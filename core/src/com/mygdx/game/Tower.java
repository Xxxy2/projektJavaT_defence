package com.mygdx.game;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.GridPoint2;

public class Tower {
    private int dmg;
    private float RoF;
    public int cost;
    Texture dzialo;


    private TextureRegion pieceImg;
    private GridPoint2 positionOnScreen;
    private GridPoint2 positionInPuzzle;
    public Tower() {
        dzialo = new Texture("dzialo.jpg");
    }
          //  TextureRegion pieceImg,
           // GridPoint2 positionOnScreen,
          //  GridPoint2 positionInPuzzle) {
      //  this.pieceImg = pieceImg;
       // this.positionOnScreen = new GridPoint2(positionOnScreen);
       // this.positionInPuzzle = new GridPoint2(positionInPuzzle);

    void draw(SpriteBatch batch) {

        batch.draw(dzialo, 10, 10);
        //batch.draw(pieceImg, positionOnScreen.x, positionOnScreen.y);
    }
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

}
