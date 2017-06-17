package view;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.viewport.ExtendViewport;
import model.Data;
import view.games.SpellingGameScreen;

public class GdxGame extends Game {

    public static final int WIDTH = 1920;
    public static final int HEIGHT = 1080;

    public OrthographicCamera camera;
    public ExtendViewport viewport;
    public SpriteBatch batch;
//    public BitmapFont font;

    public void create() {
        camera = new OrthographicCamera();
        camera.setToOrtho(false, WIDTH, HEIGHT);
        viewport = new ExtendViewport(WIDTH, HEIGHT, camera);

        batch = new SpriteBatch();
//        font = new BitmapFont();
        AssetManager.init();
        Data.populate();

        setScreen(new SpellingGameScreen(this, new view.start.StartScreen(this)));
    }

    public void render() {
        super.render(); //important!
    }

    public void dispose() {
        batch.dispose();
//        font.dispose();
    }
}
