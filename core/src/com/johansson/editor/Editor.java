package com.johansson.editor;

import com.badlogic.gdx.Game;

public class Editor extends Game {

	EditorScreen editorScreen;
	
	@Override
	public void create () {
		editorScreen = new EditorScreen();
		setScreen(editorScreen);
	}

	@Override
	public void render () {
		super.render();
	}
}
