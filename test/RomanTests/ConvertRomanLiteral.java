package RomanTests;

import static org.junit.Assert.*;

import org.junit.Test;

import RomanSource.NumberConversionToRoman;

public class ConvertRomanLiteral {

	@Test
	public void convertingI() {
		assertRomanConversion(1,"I");
	}
	
	//Test to check whether III returns 3 or not
	@Test
	public void convertingIII()
	{
		assertRomanConversion(3,"III");
	}

	public void assertRomanConversion(int numeral, String romanLiteral)
	{
		assertEquals(numeral, NumberConversionToRoman.convertRoman(romanLiteral));
	}
}
