package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Tower_sus extends Tower{

    private int dmg;
    private float RoF;
    public int cost;
    static Texture dzialo;

    public Tower_sus() {
        dzialo = new Texture("SUS_lvl4.png");
    }


    void draw(SpriteBatch batch) {

        batch.draw(dzialo, 40, 120);
        //batch.draw(pieceImg, positionOnScreen.x, positionOnScreen.y);
    }
    void draw(SpriteBatch batch, int x, int y) {

        batch.draw(dzialo, x, y);
    }


    void fire(SpriteBatch batch, int tx, int ty){
        Bullet pocisk = new Bullet();
        pocisk.draw(batch, tx, ty);

    }





}
