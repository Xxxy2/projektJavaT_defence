package com.mygdx.game;

import Screens.PlayScreen;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.GridPoint2;
import com.badlogic.gdx.Input;

public class MyGame extends Game {
	public static final int V_WIDTH = 800;
	public static final int V_HEIGHT = 600;
	public static SpriteBatch batch;
	Texture img;




	Texture dzialo;
	private static int SPEED = 50;
	private float speed;
	private GridPoint2 lastMousePosition = new GridPoint2();

	int x=50;
	int y=50;
	@Override
	public void create () {



		batch = new SpriteBatch();
		dzialo = new Texture("dzialo.jpg");
		img = new Texture("badlogic.jpg");
		//duch = new Texture("duszek.png");

		setScreen( new PlayScreen(this));
	}

	@Override
	public void render () {

		super.render();

/*
		System.out.println(Gdx.graphics.getDeltaTime());
		speed = speed + SPEED * Gdx.graphics.getDeltaTime();
		Gdx.gl.glClearColor(0.741f, 0.874f, 0.976f, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
batch.draw(dzialo,50,100);
	//	batch.draw(duch, speed, speed);
		//batch.draw(img, 0, 0);
		batch.end();

 */
	}
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
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
}
