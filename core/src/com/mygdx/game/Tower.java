package com.mygdx.game;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;

public class Tower extends Rectangle {
    private int dmg;
    private float RoF;
    public int cost;
    static Texture  dzialo;

    public Tower() {
        dzialo = new Texture("wartownik_lvl1.png");
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


/*

    boolean isMouseIn(GridPoint2 mousePos) {
        return
                mousePos.x >= positionOnScreen.x &&
                        mousePos.y >= positionOnScreen.y &&
                        mousePos.x <
                                positionOnScreen.x + pieceImg.getRegionWidth() &&
                        mousePos.y <
                                positionOnScreen.y + pieceImg.getRegionHeight();
    }
    void moveBy(int x, int y) {
        positionOnScreen.x += x;
        positionOnScreen.y += y;
    }
    boolean isPositionRight(GridPoint2 dropPosition) {
        return
                dropPosition.x >= positionInPuzzle.x &&
                        dropPosition.y >= positionInPuzzle.y &&
                        dropPosition.x <
                                positionInPuzzle.x + pieceImg.getRegionWidth() &&
                        dropPosition.y <
                                positionInPuzzle.y + pieceImg.getRegionHeight();
    }
    void snapToGrid() {
        positionOnScreen.set(positionInPuzzle);
    }

    public static Texture getDzialo() {
        return dzialo;
    }

    */

}
