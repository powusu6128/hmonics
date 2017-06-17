package com.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import view.GdxGame;

public class DesktopLauncher {
    public static void main(String[] arg) {
        LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
        config.title = "Hmonics";
        config.width = 1280;
        config.height = 720;
        config.x = 0;
        config.y = 0;
        new LwjglApplication(new GdxGame(), config);
    }
}
