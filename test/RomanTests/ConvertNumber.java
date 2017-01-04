package RomanTests;

import static org.junit.Assert.*;

import org.junit.Test;

import RomanSource.*;

public class ConvertNumber {

	@Test
	public void converting1()
	{
		assertConversionCheck("I", 1);
	}
	
	@Test
	public void converting3()
	{
		assertConversionCheck("III", 3);
	}
	
	@Test
	public void converting9()
	{
		assertConversionCheck("IX", 9);
	}
	

	private void assertConversionCheck(String romanLiteral, int numeral) {
		assertEquals(romanLiteral, RomanConversion.convertNumber(numeral));
	}

}
