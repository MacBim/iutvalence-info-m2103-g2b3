package fr.iutvalence.info.m2103.ihm;

import javax.swing.JButton;
import javax.swing.JPanel;

import java.awt.Button;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * The ControlPanel class
 * @author mercieje
 *
 */
public class ControlPanel extends JPanel
{	
	/**
	 * The controlPanel contructor
	 */
	public  ControlPanel()
	{
		
		this.setLayout(new GridLayout(4, 1,50,50));
		
		JButton upButton = new JButton("Up");
		upButton.setSize(new Dimension(10, 10));
		this.add(upButton);
		
		JButton downButton = new JButton("Down");
		downButton.setSize(new Dimension(10, 10));
		this.add(downButton);
		
		JButton leftButton = new JButton("Left");
		leftButton.setSize(new Dimension(10, 10));
		this.add(leftButton);
		
		JButton rightButton = new JButton("Right");
		rightButton.setSize(new Dimension(10, 10));
		this.add(rightButton);
	}
}
