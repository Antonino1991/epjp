package esercizi;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArmstrongTest {

	@Test
	void armstrongPlain() {
		assertTrue(Armstrong.isArmstrong(153));
	}

	@Test
	void armstrongFalse() {
		assertFalse(Armstrong.isArmstrong(154));
	}
	
	@Test
	void armstrongZero() {
		assertTrue(Armstrong.isArmstrong(0));
	}
	
	
	@Test
	void armstrongNegative() {
		assertFalse(Armstrong.isArmstrong(-1));
	}
	

}
