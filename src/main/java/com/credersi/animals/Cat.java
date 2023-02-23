package com.credersi.animals;

public class Cat extends Animal implements Purr, Puzzles {
	private int lives;
	
	@Override
	protected void dies() {
		this.lives--;
		if (this.lives == 0) {
			super.dies();
		} else {
			this.reset();
		}
	}
	
	public Cat() {
		this.lives = 9;
	}
	
	public int purr() {
		return 25;
	}
	
	public int puzzles() {
		return 2;
	}
	
}