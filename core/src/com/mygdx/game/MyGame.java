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

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class MyGame extends Game {
	public static final int V_WIDTH = 800;
	public static final int V_HEIGHT = 600;
	public static SpriteBatch batch;
private int index =0;
	private GridPoint2 lastMousePosition = new GridPoint2();

	Texture background;


	public static List<BaseEnemy> enemies = new ArrayList<>();
	Iterator<BaseEnemy> itr;

	private Tower tower;
private Gate orb;

	@Override
	public void create () {

		background = new Texture("background.png");

	tower = new Tower();
	orb = new Gate();
	batch = new SpriteBatch();

	setScreen( new PlayScreen(this));
	}

	@Override
	public void render () {

		super.render();

		batch.begin();

		batch.draw(background,-12.5f,-12.5f);

		itr = enemies.iterator();
		while (itr.hasNext()){
			BaseEnemy enemy = itr.next();
			enemy.draw(batch);
			if(!enemy.isAlive)
			{
				itr.remove();
			}
		}
		tower.draw(batch);
orb.draw(batch);
		batch.end();

		if(Gdx.input.isKeyPressed(Input.Keys.SPACE)){
index++;

			if (index%3==0) {
				addEnemy(new FastEnemy());
				batch.begin();
				//tower.fire(batch,150,150);
				batch.end();
				//if(tower.overlaps(enemies )
			}

else if (index%5==0) {
	addEnemy(new TankEnemy());
	batch.begin();
	//tower.fire(batch,150,150);
	batch.end();
	//if(tower.overlaps(enemies )
}
else
			addEnemy(new BaseEnemy());
		}

	}
	@Override
	public void dispose () {
		batch.dispose();
	}

	public void addEnemy(BaseEnemy e)
	{
		enemies.add(e);
	}






	private void handleMouse() {
		// implementacja obslugi myszki
		GridPoint2 mousePosition = getMousePosMappedToScreenPos();
		if (Gdx.input.isButtonJustPressed(Input.Buttons.LEFT)) {

			// to do
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
