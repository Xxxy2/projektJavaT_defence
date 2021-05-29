package com.mygdx.game;

import Scenes.Hud;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;

public class BaseEnemy extends Rectangle {
    public boolean isAlive = true;

    private int pathIndex=14;    //Określa do którego miejsca ścieżki aktualnie idzie przeciwnik
    private float dirX, dirY;   //Zmienne pomocnicze do sterowania przeciwnikiem w góre w dół i na boki
    //private float posX=0, posY=250; //Aktualna pozycja przeciwnika

    //Określenie położenia punktów do których dochodzi przeciwnik
    private float[] pathX = {0,0,100,100,0,0,200,200,350,350,450,450,250,250,550,550};
    private float[] pathY = {250,50,50,350,350,450,450,350,350,400,400,250,250,100,100,400};

    private float posX=pathX[0], posY=pathY[0]; //TYMCZASOWE

    //private float[] pathX = {750,100,50,50,300,300,200,200,300,300,200,200,350,350};
    //private float[] pathY = {500,100,100,200,200,150,150,100,100,50,50,0,0,250};

    private int arrLength = pathX.length;

    Texture duch;
   // EnemyMoving enemyMoving;

    protected float SPEED = 1;
    protected int dmg = 1;
    protected float hp;
    private float ManaBurn;

    public BaseEnemy(){
        duch = new Texture("duszek.png");
      //  enemyMoving = new EnemyMoving();

    }

    void draw(SpriteBatch batch) {
        MoveEnemy();
        batch.draw(duch, (GetXPos()* SPEED), (GetYPos()*SPEED));   //Aktualizowanie pozycji przeciwnika
    }

    public void MoveEnemy(){

        SetDirection(posX, posY,pathX[pathIndex],pathY[pathIndex]);
        spriteControl();

        //Sprawdzanie czy przeciwnik dotarł do punktu kontrolnego
        if(GetDistance(posX, posY, pathX[pathIndex], pathY[pathIndex]) <= 0.5) {
            SetNextWaypoint();
        }
    }

    //Aktualizowanie zmiennych przechowujących pozycje przeciwnika
    private void spriteControl() {
        posX += dirX;
        posY += dirY;
    }

    //Ustawienie następnego punktu kontrolnego przez inkrementacje zmiennej pathIndex
    private void SetNextWaypoint() {
        //Sprawdzanie czy przeciwnik dotarł do końca ścieżki
        if(pathIndex >= arrLength -1) {
            if(isAlive) {
                Hud.addHp(-dmg);  //Odejmowanie życia graczowi
                isAlive = false;
                if(Hud.getHp()<=0) Gdx.app.exit();
            }
            //MyGame.enemies.remove();
            return;
        }
        pathIndex++;
    }

    //Ustawienie kierunku chodzenia przeciwnika
    private void SetDirection(float positionX, float positionY, float targetX, float targetY) {
        float a = targetX - positionX;
        float b = targetY - positionY;

        if(a > 0)
            dirX = 1f;
        else if(a < 0)
            dirX = -1f;
        else
            dirX = 0;

        if(b > 0)
            dirY = 1f;
        else if(b < 0)
            dirY = -1f;
        else
            dirY = 0;
    }

    //Obliczanie odległości przeciwnika od punktu kontrolnego do którego aktualnie zmierza
    private float GetDistance(float positionX, float positionY, float targetX, float targetY) {
        return (float)Math.sqrt(Math.pow(targetX - positionX, 2) + Math.pow(targetY - positionY, 2));
    }

    public float GetXPos() {
        return posX;
    }
    public float GetYPos() {
        return posY;
    }
}
