
public class Run {
	
	//Greatest Common Denominator method that takes in two integers and returns the GCD
	public static int gcd(int a, int b) {
		
		//finding the remainder of a divided by b
		int r= a%b;
		
		//testing if the remainder is greater then 0
		if(r > 0) {
			
			//if true then run through the method again and plug in (a,b) to be (b,r)
			return gcd(b,r);
		}else{
			
			//if false return the previous resulting remainder which will be the GCD
			return b;
		}
	}

	/* Palindrome method that takes in a word and checks to see if the word could be read both forward 
	 and backwards and returns a boolean true or false */
	public static Boolean palindrome(String a){
		//declaring a string b
		String b ="";
		
		//checking if the length of the palindrome is = 1, if so the word is a palindrome
		if(a.length() <= 1) {
			return true;
			
		//checking if the first letter is the same as the last letter in the word
		}else if(a.charAt(a.length()-1)==a.charAt(0)) {
			//we need to create a new substring to test if the middle of the word is a palindrome
			b = a.substring(1,a.length()-1);
			//plug in the new palindrome and test to see if it's a palindrome
			return palindrome(b);
			
		//if neither of the statements are true then the word must not be a palindrome
		}else {
			return false;
		}
	}
	
	/* Stair climbing method, through testing out a few numbers of stairs
	 * and going through them by hand i noticed a pattern, once you got past 2 steps,
	 * which is the amount steps you can take, you are able to find the number of combinations
	 * by looking at the amount of combinations from the number of steps 1 below + the number
	 * of steps from 2 below for example 3 steps have the same combination of steps as 1 steps
	 * + 2 steps.
	 * This method takes in a integer for the amount of steps you are wanting to climb and returns
	 * the total distinct ways you are able to climb the stairs */
	public static int stairs(int n) {
		//testing to see if the amount of steps climbed is less than or equal to 2
		if (n <= 2 ){
			//if so the result is n;
			return n;
		}else {
			/*if the amount of stair is greater than 2 then we can 
			 * figure out the combinations of the 2 numbers of stairs below our
			 * value n is and add them together and return them for the answer.
			 */
			return stairs(n-1)+stairs(n-2);
		}
	}
	
	
	//Main method that we can use to test the methods for the assignment
	public static void main(String[] args) {
		
		//Part 1:	Testing the Greatest Common Divisor method
		System.out.println("\nPart 1: Greatest Common Divisor Method");
		System.out.println("==========================================\n");
		System.out.println("The GCD of (36,20) is "+gcd(36,20));
		System.out.println("The GCD of (12,8) is "+gcd(12,8));
		System.out.println("The GCD of (4325,125) is "+gcd(4325,125));
		System.out.println("The GCD of (4,98) is "+gcd(4,90));
		System.out.println("==========================================\n");
		//Part 2:	Testing the Palindrome method
		System.out.println("\nPart 2: Palindrome Method");
		System.out.println("==========================================\n");
		System.out.println("It's "+palindrome("malayalam")+" that malayalam is a palindrome ");
		System.out.println("It's "+palindrome("max")+" that max is a palindrome ");
		System.out.println("It's "+palindrome("dad")+" that dad is a palindrome ");
		System.out.println("It's "+palindrome("pizza")+" that pizza is a palindrome ");
		System.out.println("It's "+palindrome("noon")+" that noon is a palindrome ");
		System.out.println("==========================================\n");
		
		//Bonus Problem: Testing the stair climbing method
		System.out.println("\nBonus: Stairs Method");
		System.out.println("==========================================\n");
		System.out.println("There are "+stairs(1)+" ways to climb 1 steps");
		System.out.println("There are "+stairs(2)+" ways to climb 2 steps");
		System.out.println("There are "+stairs(3)+" ways to climb 3 steps");
		System.out.println("There are "+stairs(4)+" ways to climb 4 steps");
		System.out.println("There are "+stairs(5)+" ways to climb 5 steps");
		System.out.println("There are "+stairs(6)+" ways to climb 6 steps");
		System.out.println("==========================================\n");
	}

}
