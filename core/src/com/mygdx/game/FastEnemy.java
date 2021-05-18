package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class FastEnemy extends  BaseEnemy{
    protected static float SPEED = 1;
    public FastEnemy(){
        duch = new Texture("duszek2.png");
      //  enemyMoving = new EnemyMoving();

    }

    void draw(SpriteBatch batch) {
       // enemyMoving.MoveEnemy();
        MoveEnemy();
        //batch.draw(duch, (enemyMoving.GetXPos()* SPEED), (enemyMoving.GetYPos()*SPEED));   //Aktualizowanie pozycji przeciwnika
        batch.draw(duch, (GetXPos()* SPEED), (GetYPos()*SPEED));   //Aktualizowanie pozycji przeciwnika
    }




}
