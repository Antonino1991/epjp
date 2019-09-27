package esercizi;

import static org.junit.jupiter.api.Assertions.*;
//import static org.hamcrest.CoreMatchers.is;
//import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class panGramTest {

	@Test
	void panGramFalse() {
		assertFalse(panGram.isPangram("ciao marco"));
	}

	@Test
	void panGramTrue() {
		assertTrue(panGram.isPangram("The quick brown fox jumps over the lazy dog"));
	}

	@Test
	void panGramIta() {
		assertFalse(panGram.isPangram("Qualche vago ione tipo zolfo, bromo, sodio"));
	}
	
//	@Test
//	void pangramNull() {
//		IllegalArgumentException exc = assertThrows(IllegalArgumentException.class, ()-> panGram.isPangram(null));
//		
//		assertThat(exc , is("The string is null"));
//	}

}
