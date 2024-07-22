package com.project;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator extends JFrame {
	JTextField tfResult;
	
	public Calculator() {
		super("Calculator");
		this.setLayout(new BorderLayout());
		this.setBounds(700, 100, 330, 500);
		
		tfResult = new JTextField("0", JTextField.RIGHT);
		this.add(tfResult, BorderLayout.NORTH);
		
		JPanel pnlCenter = new JPanel(new GridLayout(7,4));
		this.add(pnlCenter, BorderLayout.CENTER);
		String[][] buttonText = { {"%","CE","C","x"},
					   		      {"1/x","x^","SQR","/"},
							      {"7","8","9","x"},
							      {"4","5","6","-"},
							      {"1","2","3","+"},
							      {"+-","0",".","="}
				                };
		JButton dummy;
		for(int i=0; i<6; i++) {
			for(int j=0; j<4; j++) {
				dummy = new JButton(buttonText[i][j]);
				pnlCenter.add(dummy);
			}
		}
		
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new Calculator();
	}

}
