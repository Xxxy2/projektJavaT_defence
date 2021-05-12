package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class FastEnemy extends  BaseEnemy{
    protected static float SPEED = 0.5f;
    public FastEnemy(){
        duch = new Texture("duszek2.png");
        enemyMoving = new EnemyMoving();

    }

    void draw(SpriteBatch batch) {
        enemyMoving.MoveEnemy();
        batch.draw(duch, (enemyMoving.GetXPos()* SPEED), (enemyMoving.GetYPos()*SPEED));   //Aktualizowanie pozycji przeciwnika
    }




}
