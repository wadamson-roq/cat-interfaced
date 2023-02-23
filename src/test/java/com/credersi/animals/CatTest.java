package com.credersi.animals;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class CatTest {
	
	@Test
	public void testInitialState() {
		Cat cat = new Cat();
		assertTrue(cat.isAlive());
		assertEquals(cat.howHungry(), 50);
	}
	
	@Test
	public void testPuzzles() {
		Ape ape = new Ape();
		Rat rat = new Rat();
		Cat cat = new Cat ();
		assertEquals(ape.puzzles(), 5);
		assertEquals(rat.puzzles(), 4);
		assertEquals(cat.puzzles(), 2);
	}
	
	@Test
	public void testJuggle() {
		Ape ape = new Ape();
		assertTrue(ape.juggle());
	}
	
	@Test
	public void testPuzzlesRelative() {
		Ape ape = new Ape();
		Rat rat = new Rat();
		Cat cat = new Cat();
		assertTrue(ape.puzzles() > rat.puzzles());
		assertFalse(rat.puzzles() < cat.puzzles());
	}
}