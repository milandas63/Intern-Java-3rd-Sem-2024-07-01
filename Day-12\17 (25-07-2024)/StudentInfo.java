package com.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentInfo extends JFrame {
	private static final long serialVersionUID = 1L;

	Connection conn;
	Statement stmt;
	
	JTextField tfID, tfName, tfFather, tfMobile;
	JRadioButton rbMale, rbFemale;
	JButton btnAdd, btnClear, btnClose;

	public StudentInfo() {
		super("Student Info");

		conn = createConnection();
		this.setBounds(200, 100, 500, 500);
		this.setLayout(new BorderLayout());
		
		JLabel lblCaption = new JLabel("Student Info System", JLabel.CENTER);
		lblCaption.setFont(new Font("Arial", Font.BOLD, 24));
		lblCaption.setBackground(Color.blue);
		lblCaption.setForeground(Color.yellow);
		lblCaption.setOpaque(true);
		lblCaption.setBorder(BorderFactory.createRaisedBevelBorder());
		this.add(lblCaption, BorderLayout.NORTH);
		
		JPanel pnlLabel = new JPanel(new GridLayout(10,1));
		this.add(pnlLabel, BorderLayout.WEST);
			pnlLabel.add(new JLabel(""));
			pnlLabel.add(new JLabel(""));
			pnlLabel.add(new JLabel("1. ID: ", JLabel.RIGHT));
			pnlLabel.add(new JLabel("2. Name: ", JLabel.RIGHT));
			pnlLabel.add(new JLabel("3. Father: ", JLabel.RIGHT));
			pnlLabel.add(new JLabel("4. Gender: ", JLabel.RIGHT));
			pnlLabel.add(new JLabel("5. Mobile", JLabel.RIGHT));
			pnlLabel.add(new JLabel(""));
			pnlLabel.add(new JLabel(""));
			pnlLabel.add(new JLabel(""));

		JPanel pnlField = new JPanel(new GridLayout(10,1));
		this.add(pnlField, BorderLayout.CENTER);
			tfID = new JTextField();
			tfName = new JTextField();
			tfFather = new JTextField();
			JPanel pnlGender = new JPanel(new GridLayout(1,2));
				rbMale = new JRadioButton("Male");
				rbFemale = new JRadioButton("Female");
				ButtonGroup bgGender = new ButtonGroup();
				bgGender.add(rbMale);
				bgGender.add(rbFemale);
				pnlGender.add(rbMale);
				pnlGender.add(rbFemale);
			tfMobile = new JTextField();
			pnlField.add(new JLabel(""));
			pnlField.add(new JLabel(""));
			pnlField.add(tfID);
			pnlField.add(tfName);
			pnlField.add(tfFather);
			pnlField.add(pnlGender);
			pnlField.add(tfMobile);

			pnlField.add(new JLabel(""));
			pnlField.add(new JLabel(""));
			pnlField.add(new JLabel(""));

		JPanel pnlButton = new JPanel(new GridLayout(1,5));
		this.add(pnlButton, BorderLayout.SOUTH);
			btnAdd = new JButton(" Add ");
			btnClear = new JButton(" Clear ");
			btnClose = new JButton(" Close ");
			btnAdd.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent ae) {
					String name = tfName.getText();
					String father = tfFather.getText();
					String mobile = tfMobile.getText();
					String sql = "INSERT INTO student(name,father,mobile) VALUES('"+name+"','"+father+"','"+mobile+"')";
					System.out.println(sql);
					try {
						stmt.executeUpdate(sql);
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
			});
			pnlButton.add(new JLabel());
			pnlButton.add(btnAdd);
			pnlButton.add(btnClear);
			pnlButton.add(btnClose);
			pnlButton.add(new JLabel());

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	public Insets getInset() {
		return new Insets(5,20,20,50);
	}

	private Connection createConnection() {
		try {
			Class.forName("org.gjt.mm.mysql.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "root");
		} catch(Exception e) {
			System.out.println("Can't create connection: "+e.getMessage());
		}
		return conn;
	}
	
	public static void main(String[] args) {
		new StudentInfo();
	}

}
