import java.util.*;
public class Main
{
	public static void main(String[] args) {
	//	System.out.print("Enter operation: ");
		String[] operation = new String[3];
		String a, b;
		String operator;
		String[] romanNums = {"I","II","III","IV","V","VI","VII","VIII","IX","X"};
		String[] nums = {"1","2","3","4","5","6","7","8","9","10"};
		String[] opers = {"+","-","*","/"};
		int a1, b1;

		Calculation calc = new Calculation();
   		RomanToNumber rom = new RomanToNumber();
   		NumberToRoman numRom = new NumberToRoman();

		Scanner sc= new Scanner(System.in);
		operation = sc.nextLine().split(" "); 
		a = operation[0]; 
		operator = operation[1];
		b = operation[2];

		try{
			if (!(((Arrays.asList(romanNums).contains(a) && Arrays.asList(romanNums).contains(b)) || (Arrays.asList(nums).contains(a) && Arrays.asList(nums).contains(b))) && Arrays.asList(opers).contains(operator))){
				throw new Exception("Incorrect input!");
			}
   		}
   		catch(Exception ex){
   			System.out.println(ex.getMessage());
   			System.exit(0);
   		}


		if (Arrays.asList(romanNums).contains(a) && Arrays.asList(romanNums).contains(b)){
			a1 = rom.romanToDecimal(a); 
			b1 = rom.romanToDecimal(b);

			calc.calculate(a1, b1, operator);
        	System.out.println(numRom.intToRoman(calc.getOutput()));
		}

		else {
			calc.calculate(Integer.parseInt(a), Integer.parseInt(b), operator);
        	System.out.println(calc.getOutput());
		}		
	}
}