package s045;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ESERCIZIO2Test {

	@Test 
	void testToUpper() {
		fail("Not yet implemented");
	}



         @Test
         
         void toUpperNull() {
	    String result  = ESERCIZIO2.toUpper(null);
	
	      assertNull(result);
 }


@Test

void toUpperEmpty() {
String result  = ESERCIZIO2.toUpper("");

 assertTrue(result.isEmpty());
}


@Test

void toUpperBob() {
String result  = ESERCIZIO2.toUpper("Bob");

assertEquals("BOB", result);;
}
}