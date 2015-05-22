package fr.iutvalence.info.m2103.ihm;

import java.awt.Button;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;



public class SokobanHMI implements Runnable, ActionListener
{	
	private JFrame window;
	
	private JMenuItem menuItemClose;
	
	private JMenuItem menuItemLevels;
	
	private JPanel controlPannel;
	private GamePanel gamePanel;
	
	public void run()
	{
		this.window = new JFrame();
		this.gamePanel = new GamePanel();
		this.window.setTitle("Sokoban");
		this.window.setSize(600, 600);
		
		
		this.window.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		JMenu menu = new JMenu("Menu");
		this.menuItemLevels = new JMenuItem("Levels Choice");
		this.menuItemLevels.addActionListener(this);
		menuBar.add(this.menuItemLevels);
		this.window.setJMenuBar(menuBar);
		
		
		JButton bouton = new JButton();
		this.window.getContentPane().add(bouton);
		JButton bouton2 = new JButton();
		this.window.getContentPane().add(bouton2);
		this.gamePanel.addButtonGrid(8, 8, 64);
		
		
		
		
		
		this.window.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent event)
	{
		JMenuItem selectionnedItem = (JMenuItem) event.getSource();
		if(selectionnedItem == this.menuItemLevels)
		{
			JOptionPane.showMessageDialog(this.window, "No levels yet", "Levels Choice", JOptionPane.INFORMATION_MESSAGE);
			return;
		}
		
	}
	



	
}
