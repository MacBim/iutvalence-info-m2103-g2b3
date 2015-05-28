package fr.iutvalence.info.m2103.sokoban;

import fr.iutvalence.info.m2103.interfaces.Display;

/**
 * Manages the console display
 */
public class DisplayConsole implements Display{

	@Override
	public void displayMessage(String msg) {
		System.out.println(msg);
	}

	@Override
	public void displayStartingMessage() {
		this.displayMessage("Sokoban Game\n");
		this.displayMessage("\t '@': CHARACTER     - '$': BOX");
		this.displayMessage("\t '*': BOX on TARGET - '+': CHARACTER on TARGET");
		this.displayMessage("\t '#': WALL          - '.': TARGET\n");
		this.displayMessage("------------");
	}

	@Override
	public void displayWinMessage(int turn) {
		this.displayMessage("Won in " + turn + "turns !");
	}
	
	public String[][] displayMap(String level)
	{
		int pos=0;
		String[][] map = new String[8][8];
		for(int lineIndex=0; lineIndex<8; lineIndex++)
		{
			for(int columnIndex=0; columnIndex<8; columnIndex++)
			{
				pos=+ columnIndex;
				map[lineIndex][columnIndex] += level.charAt(pos);
			}
		}
		return map;
	}

}
