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
			if(romanArray[i].equals("I"))
			{
				result=result+1;
			}
			if(romanArray[i].equals("V"))
			{
				result=result+5;
			}
			if(romanArray[i].equals("L"))
			{
				result=result+50;
			}
			if(romanArray[i].equals("C"))
			{
				result=result+100;
			}
			if(romanArray[i].equals("D"))
			{
				result=result+500;
			}
			if(romanArray[i].equals("M"))
			{
				result=result+1000;
			}
			
		}
		System.out.println(result);
		return result;
	}
	
}
