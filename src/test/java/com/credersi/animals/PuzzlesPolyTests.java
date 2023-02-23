package com.credersi.animals;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PuzzlesPolyTests {
	
	private int treat(Puzzles solve) {
		return solve.puzzles();
	}
	
	@Test
	public void testTreatsForPuzzles() {
		Puzzles ape = new Ape();
		Puzzles rat = new Rat();
		Puzzles cat = new Cat();
		
		assertEquals(this.treat(ape), 5);
		assertEquals(this.treat(rat), 4);
		assertEquals(this.treat(cat), 2);
	}
	
}