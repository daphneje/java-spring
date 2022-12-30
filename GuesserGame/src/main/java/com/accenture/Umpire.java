package com.accenture;

public class Umpire {
	private Guesser g;
	private Player p1;
	private Player p2;
	private Player p3;

	int numberFromGuesser;
	int numberFromPlayer1;
	int numberFromPlayer2;
	int numberFromPlayer3;
	
	public Umpire(Guesser g, Player p1, Player p2, Player p3) {
		super();
		this.g = g;
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
	}
	
	public void collectNumberFromGuesser( ) {
		numberFromGuesser = g.guessNum();
	}
	
	public void collectNumberFromPlayers() {
		numberFromPlayer1 = p1.guessNum();
		numberFromPlayer2 = p2.guessNum();
		numberFromPlayer3 = p3.guessNum();
	}
	
	public void compare() {
		System.out.println("Number guessed by the guesser:" + numberFromGuesser);
		
		if(numberFromGuesser==numberFromPlayer1) {
			System.out.println("Player1 has won the game!");
		}
		else if(numberFromGuesser==numberFromPlayer2) {
			System.out.println("Player2 has won the game!");
		}
		else if(numberFromGuesser==numberFromPlayer3) {
			System.out.println("Player3 has won the game!");
		}
		else {
			System.out.println("Game lost. Try again.");
		}
	}
}
