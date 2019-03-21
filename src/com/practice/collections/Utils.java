package com.practice.collections;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public final class Utils {

	private Utils() {
	}

	/**
	 * Checks if the given string is empty
	 * 
	 * @param string to be checked for empty
	 * @return true if string is empty and false otherwise
	 */
	public static boolean isEmpty(String string) {
		if (null == string || string.trim().equals("")) {
			return true;
		}

		return false;
	}

	/**
	 * <p>
	 * Method to return the value for the <code>key</code> specified from the file
	 * specified <code>filePath</code>.
	 * </p>
	 * 
	 * <p>
	 * All the places where a value from a property file is needed, it must be
	 * routed through here.
	 * </p>
	 * 
	 * File can be on the class path or somewhere on the system, the user needs to
	 * pass in the proper file location
	 * 
	 * @param filePath the path of the properties file
	 * @param key      the key in the properties file for which value is needed
	 * @return the value corresponding to the key in the file specified by file path
	 */
	public static String safeGetProperties(String filePath, String key) {

		if (isEmpty(key)) {
			throw new IllegalArgumentException("null or empty key passed, check the input key");
		}

		if (isEmpty(filePath)) {
			throw new IllegalArgumentException("null or empty filePath passed, check the input file path");
		}

		Properties properties = getPropertiesInstance();
		InputStream propStream = Thread.currentThread().getContextClassLoader().getResourceAsStream(filePath);

		if (null == propStream) {
			try {
				propStream = new FileInputStream(new File(filePath));
			} catch (FileNotFoundException e) {
			}
		}

		try {
			properties.load(propStream);
		} catch (IOException e) {
		} finally {
			try {
				propStream.close();
			} catch (IOException e) {
			}
		}

		return properties.getProperty(key);
	}

	/**
	 * Method to write properties to a property file specified by file path.
	 * <p />
	 * 
	 * Developers should make use of this utility method to add new properties to
	 * add to the properties file, the method will take care of naming conventions
	 * and all the other standardizations.
	 * <p />
	 * 
	 * @param key
	 * @param value
	 * @param filePath
	 */
	public static void safeWriteProperties(String key, String value, String filePath) {
		Properties properties = getPropertiesInstance();
		FileOutputStream fileOutputStream = null;

		try {
			InputStream in = new FileInputStream(new File(filePath));
			properties.load(in);
			
			properties.setProperty(key, value);
			fileOutputStream = new FileOutputStream(filePath);
			properties.store(fileOutputStream, null);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fileOutputStream != null) {
					fileOutputStream.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * Method to return {@link Properties} instance
	 * 
	 * @return instance of {@link Properties} class
	 */
	private static Properties getPropertiesInstance() {
		return new Properties();
	}
}
