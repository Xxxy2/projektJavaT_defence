package Scenes;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.mygdx.game.MyGame;
import com.badlogic.gdx.scenes.scene2d.Stage;




public class Hud {
public Stage stage;
private Viewport viewport;

//zmienne kasa ilosc mobkow, wynik
private Integer mobCounter;
private  Integer score;
private  Integer money;

    public void addHp(Integer hp) {
        this.hp=+hp;
    }

    private Integer hp;

private MyGame ggame;

Label mobCounterLabel;
Label scoreValueLabel;
Label moneyValueLabel;
Label hpValueLabel;
Label scoreLabel;
Label mobLeft;
Label moneyLeft;
Label hpLeft;
public Hud(SpriteBatch sb){
  //  ggame = new MyGame();
    mobCounter = ggame.enemies.size();
    score = 0;
    money = 100;
    hp = 10;

}

public void AktualizujTekst(SpriteBatch sb)
{
    mobCounter = ggame.enemies.size();

    viewport = new FitViewport(MyGame.V_WIDTH,MyGame.V_HEIGHT,new OrthographicCamera());
    stage = new Stage(viewport,sb);
    Table table = new Table();
    table.top();
    table.setFillParent(true);
    mobCounterLabel = new Label(String.format("%02d", mobCounter), new Label.LabelStyle(new BitmapFont(), Color.GREEN));
    scoreValueLabel = new Label(String.format("%06d", score),new Label.LabelStyle(new BitmapFont(), Color.GREEN));
    moneyValueLabel = new Label(String.format("%06d", money),new Label.LabelStyle(new BitmapFont(), Color.GREEN));
    hpValueLabel = new Label(String.format("%06d", hp),new Label.LabelStyle(new BitmapFont(), Color.GREEN));

    scoreLabel = new Label("wynik to:",new Label.LabelStyle(new BitmapFont(), Color.GREEN));
    mobLeft = new Label("pozostalo przeciwnikow :",new Label.LabelStyle(new BitmapFont(), Color.GREEN));
    moneyLeft = new Label("pozostalo kasy :",new Label.LabelStyle(new BitmapFont(), Color.GREEN));
    hpLeft = new Label("pozostalo hp :",new Label.LabelStyle(new BitmapFont(), Color.GREEN));
    table.add( scoreLabel).expandX().padTop(10);
    table.add( moneyLeft).expandX().padTop(10);
    table.add( mobLeft).expandX().padTop(10);
    table.add(hpLeft).expandX().padTop(10);

    table.row();

    table.add( scoreValueLabel).expandX();
    table.add( moneyValueLabel).expandX();
    table.add( mobCounterLabel).expandX();
    table.add( hpValueLabel).expandX();
    stage.addActor(table);
}

}
