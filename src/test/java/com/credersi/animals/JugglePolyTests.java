package com.credersi.animals;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class JugglePolyTests {
	
	private boolean encourage(Juggle juggling) {
		return juggling.juggle();
	}
	
	@Test
	public void testTreatsForPuzzles() {
		Juggle ape = new Ape();
		
		assertTrue(this.encourage(ape));
	}
}