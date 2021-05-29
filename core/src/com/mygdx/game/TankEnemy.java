package com.mygdx.game;

import Scenes.Hud;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class TankEnemy extends BaseEnemy{
    public TankEnemy(){
        duch = new Texture("duszek2.png");
        SPEED = 1f;
        dmg = 3;
        hp = 10;
    }

    void draw(SpriteBatch batch) {
        MoveEnemy();
        //batch.draw(duch, (enemyMoving.GetXPos()* SPEED), (enemyMoving.GetYPos()*SPEED));   //Aktualizowanie pozycji przeciwnika
        batch.draw(duch, (GetXPos()* SPEED), (GetYPos()*SPEED));   //Aktualizowanie pozycji przeciwnika
    }
}
