package RomanSource;

import RomanSource.*;

public class NumberConversionToRoman {

	public static int convertRoman(String romanLiteral) {
		String romanArray[]= romanLiteral.split("");
		int result=0;
		for(int i=0;i<romanArray.length;i++)
		{
			if(romanArray[i].equals("X"))
			{
				result=result+10;
			}
		}
		return result;
	}
	
}
