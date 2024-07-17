package com.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class CharacterStream {
	BufferedReader br;
	BufferedWriter bw;
	
	public CharacterStream() {
		String str = "";

		try {
			br = new BufferedReader(new InputStreamReader(new FileInputStream("students.csv")));
			bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("data.csv")));
			
			str = br.readLine();
			while(str != null) {
				System.out.println(str);
				bw.write(str);
				str = br.readLine();
			}

			br.close();
			bw.close();
		} catch(FileNotFoundException e) {
		} catch(IOException e) {
		}
	}

	public static void main(String[] args) {
		new CharacterStream();
	}

}
