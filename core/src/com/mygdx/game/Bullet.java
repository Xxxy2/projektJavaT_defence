package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.GridPoint2;

public class Bullet {
        private int dmg;
        private float RoF;
        public int cost;
        Texture bullet;
    //EnemyMoving enemyMoving;


        public Bullet() {
            bullet = new Texture("badlogic.jpg");
        }



    void draw(SpriteBatch batch,int tx,  int ty ) {

        batch.draw(bullet, tx, ty);
        //batch.draw(pieceImg, positionOnScreen.x, positionOnScreen.y);
    }



}
