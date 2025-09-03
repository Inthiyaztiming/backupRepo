package javaPrograms;

public class Programs2 {
	public static void main(String[] args) {
		
		//reverse string
		String input = "programming";
		String result = reverseString(input);
		System.out.println(result);
	}

	//reversing a string using built in functions
	public static String reverseString(String s) {
		StringBuilder sb = new StringBuilder(s);
		String reversedString = sb.reverse().toString();
		return reversedString;

	}
}
