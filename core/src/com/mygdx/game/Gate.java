package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Gate {

    Texture orb = new Texture("zamek.png");

public Gate(){


}
    void draw(SpriteBatch batch) {

        batch.draw(orb, 515, 435);
        //batch.draw(pieceImg, positionOnScreen.x, positionOnScreen.y);
    }

}
