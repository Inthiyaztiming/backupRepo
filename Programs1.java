package javaPrograms;

import java.util.HashSet;

public class Programs1 {

	public static void main(String[] args) {

    //If he asks to take string from user or console we can use scanner class in main method but countA logic remains same
		
		//occurence of a character in a string
		String input = "Amazon apple";
		int result = countcharA(input);
		System.out.println(result);
		
		//Removing extra spaces from a string sentence
		String sentence="My   name    is     Ram";
		String result1= spaceRemoval(sentence);
		System.out.println(result1);
		
		//factorial of a number
		int number=5;
		long result2= factorial(number);
		System.out.println(result2);
		
		//Duplicate characters in a string
		String program="programminggpr";
		HashSet<Character>result3=duplicatechar(program);
		System.out.println(result3);
		

	}

	//Java program to count and print the number of As in given string or Count the occurrences or frequency of a specific character in a string
	
	public static int countcharA(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c == 'A') {
				count++;
			}
		}
		return count;
	
	}
	
 //2. Normalize Spaces in a String or Java Program to Reduce Multiple Spaces to a Single Space Between Words or Remove Extra Spaces from String
	
	public static String spaceRemoval(String inputOne) 
	{
		return inputOne.trim().replaceAll("\\s+", " ");
	}

	// To remove multiple spaces between words and keep only one space between them,
	// we use replaceAll("\\s+", " "). The "\\s+" matches one or more whitespace characters.
	// If we want to remove all spaces entirely (no spaces at all), we can use replaceAll("\\s+", "").	
	
	
  //--------------------3.Factorial of a number-----------------------------
	public static long factorial(int n) 
	{
		long fact=1;
		for(int i=2;i<=n;i++) 
		{
			fact*=i;
		}
		return fact;
	}
//Factorial of a number is multiplying that number by every positive integer less than it, down to 1.
//	Example-
//	5!=5×4×3×2×1=120
//	3!=3x2x1=6
//	0!=0(special case)
	
// we are using long here because till 12! it fits in int but when we go for 13! it exceeds int max value which can fit till 20! only, 
// For 21! long also overflows we can use BigInteger then
	
	
//----------4. Finding duplicate characters in a string

	public static HashSet<Character> duplicatechar(String str)
	{
		HashSet<Character>seen=new HashSet<>();
		HashSet<Character>duplicates= new HashSet<>();
		
		for(char c:str.toCharArray()) 
		{
			if(seen.contains(c)) 
			{
				duplicates.add(c);
			}else 
			{
				seen.add(c);
			}
		}
		return duplicates;
	}
}
