package fr.iutvalence.info.m2103.ihm;

import java.awt.Button;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

/**
 * The game panel class
 * @author mercieje
 *
 */
public class GamePanel extends JPanel
{
	/**
	 * The panel where the buttons will be
	 */
	private JPanel gamePanel;
	
	/**
	 * The game panel constructor
	 * @param numberOfLine
	 * @param numberOfColumns
	 * @param numberOfButtons
	 */
	public GamePanel(int numberOfLine, int numberOfColumns, int numberOfButtons)
	{
		this.setLayout(new GridLayout(numberOfLine, numberOfColumns));
		for(int buttonIndex=0; buttonIndex<numberOfButtons; buttonIndex++)
		{
			
			JButton bouton = new JButton();
			bouton.setFocusable(false);
			this.add(bouton);
		}
	}
}
