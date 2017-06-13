package com.view.actors;

import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Touchable;
import com.badlogic.gdx.scenes.scene2d.ui.ImageButton;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Stack;

public class Letter extends Stack {
    private ImageButton imageButton;
    private Label nameLabel;

    public Letter(String name) {
        setName(name);
        imageButton = new ImageButton(com.view.AssetManager.imageButtonStyle);
        add(imageButton);
        nameLabel = new Label(name, com.view.AssetManager.skin);
        nameLabel.setTouchable(Touchable.disabled);
        nameLabel.setAlignment(1);
        nameLabel.setFontScale(3);
        addActor(nameLabel);
    }

    public Letter(Actor letter) {
        this(letter.getName());
    }
}
