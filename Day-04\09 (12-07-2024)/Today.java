package com.string;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Today {

	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(sdf.format(now));
	}

}
