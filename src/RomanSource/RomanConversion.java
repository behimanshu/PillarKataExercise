package RomanSource;

public class RomanConversion {
	
	private enum DigitAssignment
	{
		//setting the values for each unique roman literal
		I(1), V(5), X(10);
		private final int value;
		
		DigitAssignment(int value)
		{
			this.value = value;
		}
	}
	
	public static String convertNumber(int number)
	{
		for(DigitAssignment digit:DigitAssignment.values())
		{
			if(number==digit.value)
			{
				return digit.name();
			}
		}
		return "";	
	}
}
