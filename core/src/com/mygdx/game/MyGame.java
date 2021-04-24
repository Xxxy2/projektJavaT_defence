package com.mygdx.game;

import Screens.PlayScreen;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.GridPoint2;
import com.badlogic.gdx.Input;

import java.util.ArrayList;
import java.util.List;

public class MyGame extends Game {
	public static final int V_WIDTH = 800;
	public static final int V_HEIGHT = 600;
	public static SpriteBatch batch;
	private static int SPEED = 50;
	private float speed;
	private GridPoint2 lastMousePosition = new GridPoint2();

	Texture background;

	int x=50;
	int y=50;

	public List<BaseEnemy> enemies = new ArrayList<BaseEnemy>();

	//private BaseEnemy enemy;
	private Tower tower;

	@Override
	public void create () {

		background = new Texture("background.png");

	tower = new Tower();
	batch = new SpriteBatch();

	setScreen( new PlayScreen(this));
	}

	@Override
	public void render () {

		super.render();

		batch.begin();

		batch.draw(background,-12.5f,-12.5f);
		for (BaseEnemy enemy : enemies){
			enemy.draw(batch);
		}
		tower.draw(batch);

		batch.end();

		if(Gdx.input.isKeyPressed(Input.Keys.SPACE))
			addEnemy(new BaseEnemy());
	}
	@Override
	public void dispose () {
		batch.dispose();
	}

	public void addEnemy(BaseEnemy e)
	{
		enemies.add(e);
	}

	public void removeEnemy(BaseEnemy e)
	{
		enemies.remove(e);
	}

	private void handleMouse() {
		// implementacja obslugi myszki
		GridPoint2 mousePosition = getMousePosMappedToScreenPos();
		if (Gdx.input.isButtonJustPressed(Input.Buttons.LEFT)) {
		}
	}

	private GridPoint2 getMousePosMappedToScreenPos() {
		return new GridPoint2(
				Gdx.input.getX(),
				600 - 1 - Gdx.input.getY()
		);
	}

	float delay = 1; // seconds
}
