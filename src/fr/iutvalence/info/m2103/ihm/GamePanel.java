package fr.iutvalence.info.m2103.ihm;

import java.awt.Button;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class GamePanel extends JPanel
{
	private JPanel gamePanel;
	
	public GamePanel(int numberOfLine, int numberOfColumns, int numberOfButtons)
	{
		this.setLayout(new GridLayout(numberOfLine, numberOfColumns));
		for(int buttonIndex=0; buttonIndex<numberOfButtons; buttonIndex++)
		{
			JButton bouton = new JButton(String.valueOf(buttonIndex));
			bouton.setFocusable(false);
			this.add(bouton);
		}
	}
}
