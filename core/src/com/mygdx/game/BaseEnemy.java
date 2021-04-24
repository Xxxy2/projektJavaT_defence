package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class BaseEnemy {
    Texture duch;
    EnemyMoving enemyMoving;

    private static int SPEED = 50;
    private float speed;
    private float dmg;
    private float hp;
    private float ManaBurn;

    public BaseEnemy(){
        duch = new Texture("duszek.png");
        enemyMoving = new EnemyMoving();

    }

    void draw(SpriteBatch batch) {
        enemyMoving.MoveEnemy();
        batch.draw(duch, enemyMoving.GetXPos(), enemyMoving.GetYPos());   //Aktualizowanie pozycji przeciwnika
    }
}
