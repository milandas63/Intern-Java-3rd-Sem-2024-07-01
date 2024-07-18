package com.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;

public class ButtonEventClass implements ActionListener {
	String title;
	JDesktopPane desktop;
	JInternalFrame iFrame;

	public ButtonEventClass(JDesktopPane desk, String caption) {
		title = caption;
		desktop = desk;
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		iFrame = new JInternalFrame();
		iFrame.setBounds(50, 50, 300, 250);
		iFrame.setTitle(title);
		desktop.add(iFrame);
		iFrame.setVisible(true);
	}
}
