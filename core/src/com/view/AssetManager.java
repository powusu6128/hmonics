package com.view;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.ui.ImageButton;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;

public class AssetManager {
    public static TextureAtlas atlas;
    public static Skin skin;
    public static ImageButton.ImageButtonStyle imageButtonStyle;

    public AssetManager() {
        atlas = new TextureAtlas(Gdx.files.internal("images/pack.atlas"));
        skin = new Skin(Gdx.files.internal("skins/skin.json"));
        imageButtonStyle = new ImageButton.ImageButtonStyle();
        imageButtonStyle.up = AssetManager.skin.getDrawable("buttonUp");
        imageButtonStyle.down = AssetManager.skin.getDrawable("buttonDown");
        imageButtonStyle.over = AssetManager.skin.getDrawable("buttonOver");
    }

    public static Animation<TextureRegion> getAnimation(String fileName) {
        return new Animation<TextureRegion>(0.33f, AssetManager.atlas.findRegions(fileName));
    }

    public static TextureRegion getTextureRegion(String fileName) {
        return new TextureRegion(AssetManager.atlas.findRegion(fileName));
    }
}
