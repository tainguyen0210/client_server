package com.hust.soict.nguyen_phu_tai.client_server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket socket = new Socket("127.0.0.1", 9898);
		BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
		System.out.println(in.readLine());
		String day_so;
		do {
			System.out.println("nhap vao day so:");
			Scanner scanner = new Scanner(System.in);
			day_so = scanner.nextLine();
			out.println(day_so);
			System.out.println(in.readLine());
		}while(!day_so.contentEquals(""));
		socket.close();
		//scanner.close();
			
		}
	}


