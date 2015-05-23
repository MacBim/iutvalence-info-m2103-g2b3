package fr.iutvalence.info.m2103.ihm;

import javax.swing.JButton;
import javax.swing.JPanel;

import java.awt.Button;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControlPanel extends JPanel
{	
	
	public  ControlPanel()
	{
		
		this.setLayout(new GridLayout(2, 2,50,50));
		
		this.setSize(new Dimension(200, 200));
		
		
		
		JButton upButton = new JButton("Up");
		upButton.setSize(new Dimension(10, 10));
		this.add(upButton);
		
		JButton leftButton = new JButton("left");
		leftButton.setSize(new Dimension(10, 20));
		this.add(leftButton);
		
		JButton downButton = new JButton("down");
		downButton.setSize(new Dimension(10, 20));
		this.add(downButton);
		
		
		JButton rightButton = new JButton("right");
		rightButton.setSize(new Dimension(10, 20));
		this.add(rightButton);
		
		
		/**
		this.add(new Button("left"));
		this.add(new Button("Up"));
		this.add(new Button("Up"));
		*/
	}
}
