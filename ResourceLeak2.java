package com.mariten.kanatools;

import com.sun.org.slf4j.internal.LoggerFactory;

import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.NullCipher;
import javax.net.ssl.SSLContext;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class ResourceLeak2 {
	private boolean active;
	public static final String[] a = { "green", "yellow", "red", "orange", "purple" };

	public void setActive(boolean b) {
		this.active = b;
	}

	public void expression1() {

		boolean isNumber = false;
		if (isNumber) {

			logger.info("hello");
		}
	}

	LoggerFactory logger = new LoggerFactory();
	String count;

	public void process() {
		SecureRandom secureRandom = new SecureRandom();
		System.runFinalizersOnExit(true);
		try {
			PrintWriter out = new PrintWriter("");
			out.println("the text");

			System.out.println("");
			System.out.println("");
			out.close();
			Cipher c1 = Cipher.getInstance("DES");
			ServerSocket soc = new ServerSocket(1234); // Plain server socket (Cleartext communication):
			ServerSocket soc1 = SSLServerSocketFactory.getDefault().createServerSocket(1234); // SSL Server Socket
																								// (Secure
																								// communication):
			Cipher cc = new NullCipher();
		} catch (IOException | NoSuchAlgorithmException | NoSuchPaddingException e) {
			System.err.println();
			System.err.println();

			Cipher c1 = Cipher.getInstance("DES");
			Socket soc234 = new Socket("127.0.0.1", 5000);
		} catch (IOException | NoSuchAlgorithmException | NoSuchPaddingException e) {

		}

	}

	public void process2() {
		try {
			SSLContext context1 = SSLContext.getInstance("SSL");
			PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("out.txt", true)));
			out.println("the text");
		} catch (IOException e) {

			logger.error("Resource is not closed anywhere.", e);

			/* logger.error("Resource is not closed anywhere.",e); */

		}
	}

	protected final Object clone() throws CloneNotSupportedException {
		CloneWithoutSuper objectBad = new CloneWithoutSuper();
		objectBad.setDate(new Date(theDate.getTime()));
		return objectBad;
	}

	public void demo(String name, String surName, String count, String preeti) {
		try {
			ps = conn.prepareStatement("");
		} catch (SQLException throwables) {
			new SARDScannerException(throwables);
		}
		String surName = surName;
		name = name;
		this.count = count;
		preeti += preeti;
		preeti = preeti;
		r += r;
	}

	protected void finalize() {

	}

	public void method() {
		Thread myThread = new Thread();
		// EMB-ISSUE: CodeIssueNames.RUN_SHOULD_NOT_BE_CALLED_DIRECTLY
		myThread.run();
	}

}
