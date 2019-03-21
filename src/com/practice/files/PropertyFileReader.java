package com.practice.files;

import com.practice.collections.Utils;

public class PropertyFileReader {
	
	private static final String FILE_PATH = "test.properties";
	public static void main(String[] args) {
		String result = Utils.safeGetProperties(FILE_PATH, "test.property");
		System.out.println(result);
		Utils.safeWriteProperties("sample", "new value", FILE_PATH);
		String result1 = Utils.safeGetProperties(FILE_PATH, "sample");
		System.out.println(result1);
	}

}
