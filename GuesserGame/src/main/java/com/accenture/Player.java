package com.accenture;

import java.util.Scanner;

public class Player {
		int pnum;
		
		public int guessNum() {
			System.out.println("Player, please guess a number");
			Scanner scan  = new Scanner(System.in);
			pnum = scan.nextInt();
			return pnum;
		}
}
