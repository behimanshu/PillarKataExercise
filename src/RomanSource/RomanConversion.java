package RomanSource;

public class RomanConversion {

	private enum DigitAssignment {
		// setting the values for each unique roman literal
		M(1000), D(500), C(100), L(50), X(10), IX(9), V(5), IV(4), I(1);

		private final int value;

		private DigitAssignment(int value1) {
			value = value1;
		}

	}

	public static String convertNumber(int number) {
		for (DigitAssignment digit : DigitAssignment.values()) {
			if (number >= digit.value) {
				return digit.name() + convertNumber(number - digit.value);
			}
		}
		return "";
	}
}
