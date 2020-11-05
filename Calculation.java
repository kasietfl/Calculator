public class Calculation{
	private int output;
	public void calculate(int x, int y, String operator){
		switch(operator){
            case "+":
            	output = x + y;
                break;
            case "-":
            	output = x - y;
                break;
            case "*":
            	output = x * y;
                break;
            case "/":
            	output = x / y;
                break;
            default:
                System.exit(0);
                break;
        }
	}
	public void setOutput(int output){
		this.output = output;
	}
	public int getOutput(){
		return output;
	}
}