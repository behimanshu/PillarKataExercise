package RomanTests;


import static org.junit.Assert.*;

import org.junit.Test;

import RomanSource.*;

public class ConvertNumber {

	@Test
	public void converting0() {
		assertEquals("",RomanConversion.convertNumber(0));
		
		
	}

}
