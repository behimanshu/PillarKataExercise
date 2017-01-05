package RomanTests;

import static org.junit.Assert.*;

import org.junit.Test;

import RomanSource.NumberConversionToRoman;

public class ConvertRomanLiteral {

	@Test
	public void convertingI() {
		assertRomanConversion(1,"I");
	}

	public void assertRomanConversion(int numeral, String romanLiteral)
	{
		assertEquals(numeral, NumberConversionToRoman.convertRoman(romanLiteral));
	}
}
