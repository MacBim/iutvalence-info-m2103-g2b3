package fr.iutvalence.info.m2103.sokoban;

import javax.swing.SwingUtilities;

import fr.iutvalence.info.m2103.ihm.SokobanHMI;


/**
 * Launcher of the Sokoban application
 */
public class Main {

	/**
	 * Application's main
	 * @param args command-line arguments (unused)
	 */
	public static void main(String[] args) {
		new Sokoban(new HumanPlayerConsole(), new DisplayConsole()).play();
		
	}

}
