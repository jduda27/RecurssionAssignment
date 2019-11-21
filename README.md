# Recurssion Assignment

## GCD Method
The Greatest Common Denominator method that takes in two integers and returns the GCD.
```Java
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
```
## Palindrome method
The Palindrome Method takes in a word and checks to see if the word could be read both forward and backwards and 
returns a boolean true or false.
```Java
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
```
