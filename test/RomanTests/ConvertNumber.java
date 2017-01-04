package RomanTests;

import static org.junit.Assert.*;

import org.junit.Test;

import RomanSource.*;

public class ConvertNumber {

	@Test
	public void converting0() {
		assertConversionCheck("", 0);
	}

	@Test
	public void converting1() {
		assertConversionCheck("I", 1);
	}

	@Test
	public void converting5() {
		assertConversionCheck("V", 5);
	}

	@Test
	public void converting10() {
		assertConversionCheck("X", 10);
	}

	@Test
	public void converting35() {
		assertConversionCheck("XXXV", 35);
	}

	@Test
	public void converting9() {
		assertConversionCheck("IX", 9);
	}

	@Test
	public void converting2() {
		assertConversionCheck("II", 2);
	}
	
	@Test
	public void converting57()
	{
		assertConversionCheck("LVII", 57);
	}

	private void assertConversionCheck(String romanLiteral, int numeral) {
		assertEquals(romanLiteral, RomanConversion.convertNumber(numeral));
	}

}
