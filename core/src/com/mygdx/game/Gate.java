package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Gate {

    Texture orb = new Texture("orb.bmp");

public Gate(){


}
    void draw(SpriteBatch batch) {

        batch.draw(orb, 530, 400);
        //batch.draw(pieceImg, positionOnScreen.x, positionOnScreen.y);
    }

}
