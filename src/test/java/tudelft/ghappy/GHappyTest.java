package tudelft.ghappy;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class GHappyTest {
	boolean result;
	
	@Test
	public void testExamples() {
		GHappy gh = new GHappy();
		gh.gHappy("xxggxx");
		assertTrue(true);
		gh.gHappy("xxgxx");
		assertFalse(false);
		gh.gHappy("xxggyygxx");
		assertFalse (false);
	}
}
