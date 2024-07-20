package packagecom.gui;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login {
	JFrame frame;
	JTextField tfUsername;
	JPasswordField pfPassword;
	
	public Login() {
		frame = new JFrame("Login Credentials");
		frame.setBounds(400,230,450,350);
		frame.setLayout(null);
		
		JLabel lblCaption = new JLabel("LOGIN", JLabel.CENTER);
		lblCaption.setFont(new Font("Arial",Font.BOLD,18));
		lblCaption.setBackground(Color.lightGray);
		lblCaption.setForeground(Color.blue);
		lblCaption.setBounds(10,10,410,35);
		lblCaption.setOpaque(true);
		frame.add(lblCaption);
		
		JLabel lblUser = new JLabel("Username:");
		lblUser.setBounds(30, 60, 200, 30);
		frame.add(lblUser);
		
		tfUsername = new JTextField("");
		tfUsername.setBounds(30,95,200,30);
		frame.add(tfUsername);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(30,140,200,30);
		frame.add(lblPassword);
		
		pfPassword = new JPasswordField();
		pfPassword.setBounds(30, 175, 200, 30);
		frame.add(pfPassword);
		
		JButton btnSubmit = new JButton(" Submit ");
		btnSubmit.setBounds(100,240,100,30);
		frame.add(btnSubmit);

		JButton btnClose = new JButton(" Close ");
		btnClose.setBounds(230,240,100,30);
		btnClose.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae) {
				System.exit(0);
			}
		});
		frame.add(btnClose);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		new Login();
	}

}