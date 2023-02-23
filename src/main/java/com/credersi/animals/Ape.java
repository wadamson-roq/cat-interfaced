package com.credersi.animals;

public class Ape extends Animal implements Juggle, Puzzles {
	
	public boolean juggle() {
		return true;
	}
	
	public int puzzles() {
		return 5;
	}
	
}
