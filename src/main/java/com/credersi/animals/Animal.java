package com.credersi.animals;

public class Animal {
	private boolean alive;
	private int hunger;
	
	protected void dies() {
		this.alive = false;
	}
	
	protected void reset() {
		this.alive = true;
		this.hunger = 50;
	}
	
	public Animal() {
		this.reset();
	}
	
	public boolean feeds() {
		if (this.hunger > 20) {
			this.hunger -= 20;
		} else {
			this.hunger = 0;
		}
		
		return this.isAlive();
	}
	
	public boolean isAlive() {
		return this.alive;
	}
	
	public boolean runs() {
		this.hunger += 30;
		if (this.hunger >= 100) {
			this.dies();
		}
		
		return this.isAlive();
	}
	
	public int howHungry() {
		return this.hunger;
	}
}