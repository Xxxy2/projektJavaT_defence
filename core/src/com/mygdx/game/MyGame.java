package com.mygdx.game;

import Scenes.Hud;
import Screens.PlayScreen;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.GridPoint2;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Button;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class MyGame extends Game {
	public static final int V_WIDTH = 800;
	public static final int V_HEIGHT = 600;
	public static SpriteBatch batch;

	private int index =0;
	private GridPoint2 lastMousePosition = new GridPoint2();

	//Tekstura tła
	Texture background;

	//Zmienna do odmierzania czasu
	private float timeHelper = 0;

	//Lista przeciwników i iterator do usuwania przeciwników z ekranu
	public static List<BaseEnemy> enemies = new ArrayList<>();
	Iterator<BaseEnemy> itr;

	private Tower tower;
	private Gate orb;

	Vector3 mousePosition;

	@Override
	public void create () {


		batch = new SpriteBatch();

		tower = new Tower();
		orb = new Gate();

		background = new Texture("background.png");

		setScreen( new PlayScreen(this));
	}

	@Override
	public void render () {

		super.render();

		batch.begin();

		batch.draw(background, -12.5f, -12.5f);

		itr = enemies.iterator();
		while (itr.hasNext()) {
			BaseEnemy enemy = itr.next();
			enemy.draw(batch);
			if (!enemy.isAlive) {
				itr.remove();
			}
		}

		tower.draw(batch);
		//orb.draw(batch);




		timeHelper += Gdx.graphics.getDeltaTime(); //Inkrementacja mierzonego czasu
		if (timeHelper >= 3) {
			index++;
			if (index % 5 == 0) {
				addEnemy(new FastEnemy());
			} else
				addEnemy(new BaseEnemy());
			timeHelper = 0;
		}

		mousePosition = getMousePosMappedToScreenPos();
		if (Gdx.input.isButtonJustPressed(Input.Buttons.LEFT)) {
			Bullet bullet = new Bullet();
			bullet.draw(batch, (int)mousePosition.x,(int)mousePosition.y);
			//gamecam.project(mousePosition);
			System.out.println(mousePosition);
		}
		batch.end();
	}
	@Override
	public void dispose () {
		batch.dispose();
	}

	public void addEnemy(BaseEnemy e)
	{
		enemies.add(e);
	}



	float delay = 1; // seconds

	private Vector3 getMousePosMappedToScreenPos() {
		return new Vector3(
				Gdx.input.getX(),
				600 - 1 - Gdx.input.getY(),
				0
		);
	}
}
