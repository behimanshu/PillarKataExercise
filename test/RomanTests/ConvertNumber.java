package RomanTests;

import static org.junit.Assert.*;

import org.junit.Test;

import RomanSource.*;

public class ConvertNumber {

	
	//Test to check if I returns 1
	@Test
	public void converting1()
	{
		assertConversionCheck("I", 1);
	}
	
	//Test to check if III returns 3
	@Test
	public void converting3()
	{
		assertConversionCheck("III", 3);
	}
	
	//Test to check if IX returns 9
	@Test
	public void converting9()
	{
		assertConversionCheck("IX", 9);
	}
	
	//Test to check if 1066 returns MLXVI
	@Test
	public void converting1066()
	{
		assertConversionCheck("MLXVI", 1066);
	}
	
	//Test to check if 1989 returns MCMLXXXIX
	@Test
	public void converting1989()
	{
		assertConversionCheck("MCMLXXXIX", 1989);
	}

	private void assertConversionCheck(String romanLiteral, int numeral) {
		assertEquals(romanLiteral, RomanConversion.convertNumber(numeral));
	}

}
