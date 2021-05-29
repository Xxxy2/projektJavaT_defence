package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class BossEnemy extends BaseEnemy{
        public BossEnemy(){
            duch = new Texture("zolwaz_lvl4.png");
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





