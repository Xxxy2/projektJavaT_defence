package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;

public class BaseEnemy extends EnemyMoving {
    Texture duch;
   // EnemyMoving enemyMoving;

    protected static float SPEED = 1;
    private float dmg;
    private float hp;
    private float ManaBurn;

    public BaseEnemy(){
        duch = new Texture("duszek.png");
      //  enemyMoving = new EnemyMoving();

    }


    void draw(SpriteBatch batch) {
        MoveEnemy();
        batch.draw(duch, (GetXPos()* SPEED), (GetYPos()*SPEED));   //Aktualizowanie pozycji przeciwnika
    }
}
