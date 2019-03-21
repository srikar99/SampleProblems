package com.practice.files;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileReadExample extends Thread{

	private static final String FILE_PATH = "D:\\documents\\project\\odata_route.txt";
	int i = 0;

	private void readFile(String filePath) throws UnsupportedEncodingException {

		/*
		 * BufferedReader br = null; try {
		 * 
		 * br = new BufferedReader(new FileReader(new File(filePath))); String line =
		 * null;
		 * 
		 * if(br.markSupported()) {
		 * 
		 * int i = 1; while((line = br.readLine()) != null) { System.out.println(i++ +
		 * line); br.reset(); } }
		 * 
		 * } catch (FileNotFoundException e) { e.printStackTrace(); } catch (IOException
		 * e) { e.printStackTrace(); } finally { try { br.close(); } catch (IOException
		 * e) { e.printStackTrace(); } }
		 */
		
		Stream<String> stream = null;
		PrintWriter out = new PrintWriter(new BufferedWriter(
				new OutputStreamWriter(new FileOutputStream(java.io.FileDescriptor.out), "UTF-8")));
		try {
			stream = Files.lines(Paths.get(filePath));

			stream.forEach(line -> {
				i++;
				out.println(i + line);

			});

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			stream.close();
			out.close();
		}

	}
	
	static PrintWriter out;
	
	@Override
	public void run() {
		Stream<String> stream = null;
		
		try {
			out = new PrintWriter(new BufferedWriter(
					new OutputStreamWriter(new FileOutputStream(java.io.FileDescriptor.out), "UTF-8"), 512));
		} catch (UnsupportedEncodingException e1) {
			e1.printStackTrace();
		}
		try {
			long start = System.currentTimeMillis();
			out.println("Start: " + start);
			
			stream = Files.lines(Paths.get(FILE_PATH));

			stream.forEach(line -> {
				i++;
				out.println(i + line);

			});
			
			long end = System.currentTimeMillis();
			out.println("End: " + end);
			out.println("Total: " + (end - start));

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			stream.close();
		}
		
	}

	public static void main(String[] args) throws UnsupportedEncodingException {
		FileReadExample readFiles = new FileReadExample();
		//readFiles.start();
		long start = System.currentTimeMillis();
		readFiles.readFile(FILE_PATH);
		long end = System.currentTimeMillis();
		System.out.println(end-start);
	}

}
