# Recurssion Assignment

## GCD Method
The Greatest Common Denominator method that takes in two integers and returns the GCD
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
