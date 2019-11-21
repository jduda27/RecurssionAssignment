# Recurssion Assignment

## GCD Method
The Greatest Common Denominator method that takes in two integers and returns the GCD.

**Precondtions** : a valid integer *a* to be compaired to another valid integer *b*

**Postconditions** : Either call gcd where *a=b* and *b=r* or return the resulting GCD (the *a* integer)



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
## Palindrome Method
The Palindrome Method takes in a word and checks to see if the word could be read both forward and backwards and 
returns a boolean true or false.

**Precondtion** : a valid String object *a* representing a word to be tested.

**Postconditions** :  if palindrome is <=  1 return *true*, if first char and last char are equal run palindrome again with 
String *a=b*, a string with the front and back characters removed, and if neither of the conditions prior are not true return *false*.

```Java
	public static Boolean palindrome(String a){
		//declaring a string b
		String b ="";
		
		//checking if the length of the palindrome is <= 1, if so the word is a palindrome
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
## Stair Clibming Method
This method takes in a integer for the amount of steps you are wanting to climb and returns 
the total distinct ways you are able to climb the stairs.
```Java
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
```
