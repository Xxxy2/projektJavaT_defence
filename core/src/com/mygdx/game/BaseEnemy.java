package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;

public class BaseEnemy {
    Texture duch;
    private static int SPEED = 50;
    private float speed;

    private MyGame game;




    public BaseEnemy(){
        duch = new Texture("duszek.png");
        game.batch.begin();
        game.batch.draw(duch,200,200);
        game.batch.end();
//move();
    }
void move(){
    System.out.println(Gdx.graphics.getDeltaTime());
    speed = speed + SPEED * Gdx.graphics.getDeltaTime();



}



}
