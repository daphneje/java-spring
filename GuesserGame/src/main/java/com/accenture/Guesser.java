package com.accenture;

import java.util.Random;

public class Guesser {
	int gnum;
	
	public int guessNum() {
		Random rand = new Random();
		gnum = rand.nextInt(1, 10);
		return gnum;
}
}
