package RomanSource;

import java.util.HashMap;
import java.util.Map;

import RomanSource.*;

public class NumberConversionToRoman {

	static Map<Character, Integer> romanNumbers;

	public static int convertRoman(String romanLiteral) {
		romanNumbers = new HashMap<Character, Integer>();
		romanNumbers.put('I', 1);
		romanNumbers.put('V', 5);
		romanNumbers.put('X', 10);
		romanNumbers.put('L', 50);
		romanNumbers.put('C', 100);
		romanNumbers.put('D', 500);
		romanNumbers.put('M', 1000);
		char[] romanNumArray = romanLiteral.toCharArray();
		int sum = 0;
		int j = 0;
		for(int i = 1; i < romanNumArray.length; i++){
			if(romanNumbers.get(romanNumArray[j]) < romanNumbers.get(romanNumArray[i])){
				int val = romanNumbers.get(romanNumArray[i]) - romanNumbers.get(romanNumArray[j]);
				sum = sum + val;
			}else{
				if(j == 0)
					sum = romanNumbers.get(romanNumArray[0]);
				if(romanNumArray.length > i+1 && romanNumbers.get(romanNumArray[j+1]) < romanNumbers.get(romanNumArray[i+1])){
					
				}else{
					sum = sum + romanNumbers.get(romanNumArray[i]);
				}
			}
			j++;
		}
		if(j == 0)
			sum = romanNumbers.get(romanNumArray[0]);
	
		return sum;
	}
}
