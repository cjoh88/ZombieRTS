package com.johansson.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.johansson.ZombieGame;
import com.johansson.editor.Editor;

public class DesktopLauncher {

	private static boolean launchEditor = false;

	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();

		if(launchEditor) {
			config.width = 1600;
			config.height = 900;
			config.fullscreen = false;

			new LwjglApplication(new Editor(), config);
		}
		else {
			config.width = 3200;
			config.height = 1800;
			config.fullscreen = true;

			new LwjglApplication(new ZombieGame(), config);
		}
	}
}
