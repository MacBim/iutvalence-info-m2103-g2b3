package fr.iutvalence.info.m2103.ihm;

import fr.iutvalence.info.m2103.sokoban.*;

import java.awt.GridLayout;


import javax.swing.*;

/**
 * The game panel class
 * @author mercieje
 *
 */
public class GamePanel extends JPanel
{
	private static final int NUMBER_OF_LINES = 8;

	private static final int NUMBER_OF_COLUMNS = 8;

	/**
	 * The panel where the buttons will  be
	 */
	private JPanel gamePanel;
	
	private JButton[][] gameBoard;
	
	
	/**
	 * The game panel constructor
	 * @param numberOfLine
	 * @param numberOfColumns
	 * @param numberOfButtons
	 */
	public GamePanel(int numberOfLine, int numberOfColumns, int numberOfButtons)
	{
		
		this.setLayout(new GridLayout(numberOfLine, numberOfColumns));
		this.gameBoard = new JButton[NUMBER_OF_LINES][NUMBER_OF_COLUMNS];
		for(int buttonLineIndex=0; buttonLineIndex<NUMBER_OF_LINES; buttonLineIndex++)
		{
			for(int buttonColumnIndex=0; buttonColumnIndex<NUMBER_OF_COLUMNS; buttonColumnIndex++)
			{
				JButton bouton = new JButton();
				this.gameBoard[buttonLineIndex][buttonColumnIndex] = bouton;
				bouton.setFocusable(false);
				this.add(bouton);
			}
		}
	}
	
	public JButton getButton(int line, int column)
	{
		return this.gameBoard[line][column];
	}
}
