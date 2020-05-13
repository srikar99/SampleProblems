package com.practice.strings;

import java.util.Scanner;

public class StringReplacement {
	
	public static void main(String[] args) {
		//replaceCharacter();
		String s = "'741029'";
		if(s.contains("'")) {
			s = s.replaceAll("'", "");	
		}
		System.out.println(s);
	}

	private static void replaceCharacter() {
		String charToReplace = "->";
		
		Scanner scan = new Scanner(System.in);
		
		while(scan.hasNextLine()) {
			String line = scan.nextLine();
			String line1 = line;
			if(line.contains(charToReplace)) {
				int idx = line.indexOf("//");
				if(idx != -1) {
					line = line.substring(0, idx);
					line1 = line1.replace(line, line.replace(charToReplace, "."));
				} else {
					line1 = line.replace(charToReplace, ".");
				}
			}
			
			
			System.out.println(line1);
		}
		
		
		scan.close();
	}
}
