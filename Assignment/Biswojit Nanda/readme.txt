ASSIGNMENT:-1
WAP to print all multiplication tables between 2 and 40?
ANS:-
public class MultiplicationTables {
    public static void main(String[] args) {
        printMultiplicationTables();
    }
    
    public static void printMultiplicationTables() {
        for (int i = 2; i <= 40; i++) {
            System.out.println("Multiplication Table of " + i + ":");
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            System.out.println(); 
        }
    }
}
ASSIGNMENT:-2
1.WAP to sum first fifty odd numbers?
ANS:-
public class SumFirstFiftyOddNumbers {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        int number = 1; 
        
        while (count < 50) {
            sum += number;
            number += 2;
            count++;
        }
        
  
        System.out.println("Sum of the first fifty odd numbers: " + sum);
    }
}    
2.WAP To find 10 subsequent number in the series?
       2.1 1,2,4,8,16.............
 ANS:-
public class SubsequentNumbersInSeries {
    public static void main(String[] args) {
        int currentNumber = 1;
        System.out.println("First 10 subsequent numbers in the series:");
        System.out.print(currentNumber + " ");
        for (int i = 1; i <= 10; i++) {
            currentNumber *= 2; 
            System.out.print(currentNumber + " ");
        }
    }
}

       2.2 1,2,3,5,5,13.............
ANS:-
public class NextTenNumbersInSeries {
    public static void main(String[] args) {
        int firstNumber = 1;
        int secondNumber = 2;
        System.out.println("First 12 numbers in the series:");
        System.out.print(firstNumber + " "); 
        System.out.print(secondNumber + " "); 
        for (int i = 3; i <= 12; i++) {
            int nextNumber = firstNumber + secondNumber;
            System.out.print(nextNumber + " ");
            firstNumber = secondNumber;
            secondNumber = nextNumber;
        }
    }
}
ASSIGNMENT:-3
1.  String[][] users = { {"Milan","das"},
                             {"Prateekshya","patnaik"},
                             {"Goutam","gosain"},
                             {"Chinmay","maharana"},
                             {"Satyam","behera"},
                             {"Purna","panda"},
                             {"Soumya","mishra"} };

        Create Exception classes in the following hierarchy>
            java.lang.Object
            +- java.lang.Throwable
            |  +- java.lang.Exception
            |  |  +- com.password.LoginException
            |  |  |  +- com.password.WrongUsernameException
            |  |  |  +- com.password.WrongPasswordException
            |  |  +- java.lang.RuntimeException
            |  |  |  +- com.password.InvalidLoginException
            |  |  |  |  +- com.password.InvalidSpecialCharacterException
            |  |  |  |  +- com.password.TooSmallUsernameException
            |  |  |  |  +- com.password.TooLongUsernameException
            |  |  |  |  +- com.password.WrongStartCharacterException
            |  |  |  |  +- com.password.SpaceInUsernameException
ANS:-
import java.util.*;
class LoginException extends Exception {
    public LoginException(String message) {
        super(message);
    }
}
class WrongUsernameException extends LoginException {
    public WrongUsernameException(String message) {
        super(message);
    }
}
class WrongPasswordException extends LoginException {
    public WrongPasswordException(String message) {
        super(message);
    }
}
class InvalidLoginException extends RuntimeException {
    public InvalidLoginException(String message) {
        super(message);
    }
}

class InvalidSpecialCharacterException extends InvalidLoginException {
    public InvalidSpecialCharacterException(String message) {
        super(message);
    }
}
class TooSmallUsernameException extends InvalidLoginException {
    public TooSmallUsernameException(String message) {
        super(message);
    }
}
class TooLongUsernameException extends InvalidLoginException {
    public TooLongUsernameException(String message) {
        super(message);
    }
}
class WrongStartCharacterException extends InvalidLoginException {
    public WrongStartCharacterException(String message) {
        super(message);
    }
}
class SpaceInUsernameException extends InvalidLoginException {
    public SpaceInUsernameException(String message) {
        super(message);
    }
}


import com.password.*;

public class LoginValidator {
    private static final String[][] users = {
            {"Milan", "das"},
            {"Prateekshya", "patnaik"},
            {"Goutam", "gosain"},
            {"Chinmay", "maharana"},
            {"Satyam", "behera"},
            {"Purna", "panda"},
            {"Soumya", "mishra"}
    };

    public static void main(String[] args) {
        String username = "Milan";
        String password = "wrongpassword";

        try {
            validateLogin(username, password);
            System.out.println("Login successful!");
        } catch (LoginException e) {
            System.out.println("Login failed: " + e.getMessage());
        }
    }

    public static void validateLogin(String username, String password) throws LoginException {
        boolean validUsername = false;
        boolean validPassword = false;

        for (String[] user : users) {
            if (user[0].equals(username)) {
                validUsername = true;
                if (user[1].equals(password)) {
                    validPassword = true;
                    break;
                } else {
                    throw new WrongPasswordException("Incorrect password");
                }
            }
        }

        if (!validUsername) {
            throw new WrongUsernameException("Username not found");
        }

        if (!validPassword) {
            throw new WrongPasswordException("Incorrect password");
        }
    }
}
ASSIGNMENT:-4
WAP to create a login screen by inputing username and passward
ANS:-
package com.gui;

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
