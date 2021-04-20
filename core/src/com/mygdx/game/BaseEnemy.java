package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class BaseEnemy {
    Texture duch;
    private static int SPEED = 50;
    private float speed;
    private float ManaBurn;
    private MyGame game;




    public BaseEnemy(){
        duch = new Texture("duszek.png");
//move();
    }
    void draw(SpriteBatch batch) {

        batch.draw(duch, 250, 250);
    }


    void spawn(){

        game.batch.begin();
        game.batch.draw(duch,200,200);
        game.batch.end();

    }


void move(SpriteBatch batch ){
    System.out.println(Gdx.graphics.getDeltaTime());
    speed = speed + SPEED * Gdx.graphics.getDeltaTime();




}



}
