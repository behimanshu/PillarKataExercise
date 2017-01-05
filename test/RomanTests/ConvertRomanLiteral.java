package RomanTests;

import static org.junit.Assert.*;

import org.junit.Test;

import RomanSource.NumberConversionToRoman;

public class ConvertRomanLiteral {

	@Test
	public void convertingI() {
		assertRomanConversion(1, "I");
	}

	// Test to check whether III returns 3 or not
	@Test
	public void convertingIII() {
		assertRomanConversion(3, "III");
	}

	// Test to check whether IX returns 9 or not
	@Test
	public void convertingIX() {
		assertRomanConversion(9, "IX");
	}

	// Test to check whether MLXVI returns 1066 or not

	@Test
	public void convertingMLXVI() {
		assertRomanConversion(1066, "MLXVI");
	}

	public void assertRomanConversion(int numeral, String romanLiteral) {
		assertEquals(numeral, NumberConversionToRoman.convertRoman(romanLiteral));
	}
}
