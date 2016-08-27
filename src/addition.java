
public class addition {
	
	/**
	 * Simple class that adds two numbers together 
	 * author Richard Kemp
	 * @param args
	 */

	public static void main(String[] args) {
		
		//Define and initialises variables which will be added together 
		int y = 2;
		firstNumber number = new firstNumber();
		
		//define variable which will be the sum
		int sum = number.number + y; //takes the value defined by the firstNumber class
		
		//print sum to console
		System.out.println(sum);

	}

}
