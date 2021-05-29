package Screens;

import Scenes.Hud;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.GridPoint2;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.mygdx.game.BaseEnemy;
import com.mygdx.game.Bullet;
import com.mygdx.game.MyGame;

public class PlayScreen implements Screen {
    private MyGame game;
    private OrthographicCamera gamecam;
    private Viewport gameport;
    private Hud hud;

    Vector3 mousePosition;

    public PlayScreen(MyGame game){
        this.game = game;
        gamecam = new OrthographicCamera();
        gameport = new FitViewport(800,600,gamecam);

        hud = new Hud();
}
    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0.741f, 0.874f, 0.976f, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        hud.AktualizujTekst(game.batch);

        game.batch.setProjectionMatrix(hud.stage.getCamera().combined);

        hud.stage.draw();

        gamecam.update();

        mousePosition = getMousePosMappedToScreenPos();
        if (Gdx.input.isButtonJustPressed(Input.Buttons.LEFT)) {
            //Bullet bullet = new Bullet();
            //gamecam.project(mousePosition);
            //System.out.println(mousePosition);
        }
    }

    @Override
    public void resize(int width, int height) {
        gameport.setWorldSize(800 , 600);
        gameport.update(width, height, true); }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }

    private void handleMouse() {
        // implementacja obslugi myszki

    }

    private Vector3 getMousePosMappedToScreenPos() {
        return new Vector3(
                Gdx.input.getX(),
                600 - 1 -Gdx.input.getY(),
                0
        );
    }
}
