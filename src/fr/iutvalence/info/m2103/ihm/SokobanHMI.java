package fr.iutvalence.info.m2103.ihm;

import java.awt.Button;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;



public class SokobanHMI implements Runnable, ActionListener
{	
	private JFrame window;
	private JPanel mainPanel;
	
	private JMenuItem menuItemClose;
	
	private JMenuItem menuItemLevels;
	
	private JPanel controlPannel;
	private GamePanel gamePanel;
	
	public void run()
	{
		this.window = new JFrame();
		this.window.setTitle("Sokoban");
		this.window.setSize(1200, 600);
		this.window.setResizable(false);
		this.window.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		JMenuBar menuBar = new JMenuBar();
		JMenu menu = new JMenu("Menu");
		this.menuItemLevels = new JMenuItem("Levels Choice");
		this.menuItemLevels.addActionListener(this);
		menuBar.add(this.menuItemLevels);
		this.window.setJMenuBar(menuBar);
		
		
		this.mainPanel = new JPanel();
		this.gamePanel = new GamePanel(8,8,64);
		this.controlPannel = new ControlPanel();
		/**
		this.mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.X_AXIS));
		 */
		this.mainPanel.setLayout(new GridLayout(1, 2,10,0));
		this.mainPanel.add(this.gamePanel);
		this.mainPanel.add(this.controlPannel);
		this.window.add(this.mainPanel);
		
		
		
		
		
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
	
	public void addButtonGrid(int numberOfLine, int numberOfColumns, int numberOfButtons)
	{
		this.window.setLayout(new GridLayout(numberOfLine, numberOfColumns));
		for(int buttonIndex=0; buttonIndex<numberOfButtons; buttonIndex++)
		{
			JButton bouton = new JButton();
			bouton.setFocusable(false);
			this.window.add(bouton);
		}
	}
}
