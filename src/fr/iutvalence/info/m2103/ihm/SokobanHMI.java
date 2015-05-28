package fr.iutvalence.info.m2103.ihm;

import java.awt.Button;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;



public class SokobanHMI implements Runnable, ActionListener
{	
	/**
	 * The window of the game
	 */
	private JFrame window;
	/**
	 * the main panel which contain the gamePanel and the controlPanel
	 */
	private JSplitPane mainPanel;
	/**
	 * The menuItem which close the window
	 */
	private JMenuItem menuItemClose;
	
	private JMenuItem menuItemLevels;
	
	private JPanel controlPannel;
	private GamePanel gamePanel;
	
	public void run()
	{
		this.window = new JFrame();
		this.window.setTitle("Sokoban");
		this.window.setSize(800, 600);
		this.window.setResizable(false);
		this.window.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		
		
		JMenuBar menuBar = new JMenuBar();
		JMenu menu = new JMenu("Menu");
		this.menuItemLevels = new JMenuItem("Levels Choice");
		this.menuItemLevels.addActionListener(this);
		this.menuItemClose = new JMenuItem("Close");
		this.menuItemClose.addActionListener(this);
		menuBar.add(this.menuItemLevels);
		menuBar.add(this.menuItemClose);
		this.window.setJMenuBar(menuBar);
		
		
		this.mainPanel = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
		this.mainPanel.setDividerLocation(600);
		this.gamePanel = new GamePanel(8,8,64);
		this.controlPannel = new ControlPanel();

		this.mainPanel.setLeftComponent(this.gamePanel);
		this.mainPanel.setRightComponent(this.controlPannel);
		
		
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
		if(selectionnedItem == this.menuItemClose)
		{
			this.window.dispose();
		}
	}
	
	public void modifyLabel(String[][] map)
	{
		String str ="";
		for(int line=0;line<8; line++)
		{
			for(int column=0;column<8;column++)
			{
				str += map[line][column].charAt(column);
				this.gamePanel.getButton(line, column).setLabel(str);
			}
		}
	}


	
}
