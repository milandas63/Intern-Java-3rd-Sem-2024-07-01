package com.gui;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

public class VirtualDesktop {
	JFrame frame;
	JSplitPane split;
	JButton btnAdd;
	JButton btnEdit;
	JButton btnDelete;
	JButton btnCut;
	JButton btnCopy;
	JButton btnPaste;
	JDesktopPane desktop;

	public VirtualDesktop() {
		frame = new JFrame();
		frame.setTitle("Virtual Desktop");
		frame.setBounds(0, 0, 1350, 720);
		
		split = new JSplitPane();
		split.setDividerLocation(250);
		frame.add(split);

		desktop = new JDesktopPane();
		split.setRightComponent(desktop);
			
		JPanel pnlLeft = new JPanel(new GridLayout(20,1));
		split.setLeftComponent(pnlLeft);
			btnAdd = new JButton("Add");
			btnEdit = new JButton("Edit");
			btnDelete = new JButton("Delete");
			btnCut = new JButton("Cut");
			btnCopy = new JButton("Copy");
			btnPaste = new JButton("Paste");
			btnAdd.addActionListener(new ButtonEventClass(desktop, "Add"));
			btnEdit.addActionListener(new ButtonEventClass(desktop, "Edit"));
			btnDelete.addActionListener(new ButtonEventClass(desktop, "Delete"));
			btnCut.addActionListener(new ButtonEventClass(desktop, "Cut"));
			btnCopy.addActionListener(new ButtonEventClass(desktop, "Copy"));
			pnlLeft.add(btnAdd);
			pnlLeft.add(btnEdit);
			pnlLeft.add(btnDelete);
			pnlLeft.add(btnCut);
			pnlLeft.add(btnCopy);
			pnlLeft.add(btnPaste);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		new VirtualDesktop();
	}

}
