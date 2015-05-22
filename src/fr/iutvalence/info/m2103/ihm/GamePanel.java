package fr.iutvalence.info.m2103.ihm;

import java.awt.Button;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class GamePanel
{
	private JPanel gamePanel;
	
	public GamePanel()
	{
		
	}
	
	public void addButtonGrid(int numberOfLine, int numberOfColumns, int numberOfButtons)
	{
		this.gamePanel.setLayout(new GridLayout(numberOfLine, numberOfColumns));
		for(int buttonIndex=0; buttonIndex<62; buttonIndex++)
		{
			JButton bouton = new JButton();
			bouton.setFocusable(false);
			this.gamePanel.add(bouton);
		}
	}
}
