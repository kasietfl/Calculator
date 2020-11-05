class NumberToRoman{
	static String intToRoman(int num) 
	{ 
		String c[] = {"", "C"};
		String x[] = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
		String i[] = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
		String hundereds = c[(num%1000)/100];
		String tens = x[(num%100)/10];
		String ones = i[num%10];
			
		String ans = hundereds + tens + ones;
			
		return ans;
	}
}
