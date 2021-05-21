package Screens;

import Scenes.Hud;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.mygdx.game.BaseEnemy;
import com.mygdx.game.MyGame;

public class PlayScreen implements Screen {
    private MyGame game;
    private OrthographicCamera gamecam;
    private Viewport gameport;
    private Hud hud;

    public PlayScreen(MyGame game){
    this.game = game;
    gamecam = new OrthographicCamera();
    gameport = new FitViewport(MyGame.V_WIDTH,MyGame.V_HEIGHT,gamecam);

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

    }

    @Override
    public void resize(int width, int height) {
gameport.update(width, height);
    }

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


}
