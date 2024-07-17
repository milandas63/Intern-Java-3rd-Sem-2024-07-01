package com.io;

import java.io.FileOutputStream;
import java.util.Scanner;

public class KeyboardInput {
	String id, name, father, location, email_id, mobile_no;
	FileOutputStream fos;
	Scanner sc;
	
	public KeyboardInput() {
		try {
			fos = new FileOutputStream("students.csv");
			sc = new Scanner(System.in);
			StringBuffer buffer;
			boolean more = true;
			while(more) {
				buffer = new StringBuffer();
				for(int i=0; i<25; i++) System.out.println();
				System.out.println("STUDENT INFORMATION");
				System.out.println("-------------------");
				System.out.println();
				
				System.out.print("1. Identification No.: ");
				id = sc.nextLine();
				buffer.append(id+",");

				System.out.print("2. Candidate's Name:   ");
				name = sc.nextLine();
				buffer.append(name+",");

				System.out.print("3. Father's Name:      ");
				father = sc.nextLine();
				buffer.append(father+",");

				System.out.print("4. Location:           ");
				location = sc.nextLine();
				buffer.append(location+",");

				System.out.print("5. Email-Id:           ");
				email_id = sc.nextLine();
				buffer.append(email_id+",");

				System.out.print("6. Mobile Number:      ");
				mobile_no = sc.nextLine();
				buffer.append(mobile_no+"\r\n");
				
				fos.write(buffer.toString().getBytes());
				System.out.println("\r\n\r\n\r\n");

				System.out.print("More [y/n]:            ");
				more = sc.nextLine().toUpperCase().startsWith("Y");

			}

			fos.close();
			sc.close();
		} catch(Exception e) {
		}
	}

	public static void main(String[] args) {
		new KeyboardInput();
	}

}
