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
		char romanArray[] = romanLiteral.toCharArray();
		int result = 0;
		int j = 0;
		for (int i = 1; i < romanArray.length; i++) {
			if (romanNumbers.get(romanArray[j]) < romanNumbers.get(romanArray[i])) {
				int val = romanNumbers.get(romanArray[i]) - romanNumbers.get(romanArray[j]);
				result = result + val;

			} else {
				if (j == 0) {
					result = romanNumbers.get(romanArray[0]);
				}
				result = result + romanNumbers.get(romanArray[i]);
			}
			j++;
		}
		if (j == 0) {
			result = romanNumbers.get(romanArray[0]);
		}

		return result;
	}
}
