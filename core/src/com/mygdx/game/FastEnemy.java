package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class FastEnemy extends  BaseEnemy{
    public FastEnemy(){
        duch = new Texture("knox_lvl2.png");
        SPEED = 1;
        dmg = 2;
        hp = 3;
    }

    void draw(SpriteBatch batch) {
        MoveEnemy();
        //batch.draw(duch, (enemyMoving.GetXPos()* SPEED), (enemyMoving.GetYPos()*SPEED));   //Aktualizowanie pozycji przeciwnika
        batch.draw(duch, (GetXPos()* SPEED), (GetYPos()*SPEED));   //Aktualizowanie pozycji przeciwnika
    }




}
