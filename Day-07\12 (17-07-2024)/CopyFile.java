package com.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyFile {
	String inFileName = "PublicNotice.pdf";
	String outFileName = "PN.pdf";
	InputStream in;
	OutputStream out;
	
	public CopyFile() {
		try {
			File file = new File(inFileName);
			double fivePc = 0.05*file.length();
			in = new FileInputStream(file);
			out = new FileOutputStream(outFileName);
			int each;
			long count = 0;
			
			while( (each=in.read()) != -1) {
				out.write(each);
				count++;
				if(count>=fivePc) {
					System.out.print(".");
					count = 0;
				}
			}
			
			out.close();
			in.close();
		} catch(FileNotFoundException e) {
		} catch(IOException e) {
		}
	}

	public static void main(String[] args) {
		new CopyFile();
	}

}
