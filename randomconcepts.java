package Tests;

import java.io.IOException;
import java.util.Scanner;

import org.testng.annotations.Test;

public class randomconcepts  
{
	
	    public static void main(String[] args) {
	        // Create a scanner object for input
	        Scanner scanner = new Scanner(System.in);
	        
	        // Take the input string from the user
	        System.out.print("Enter a string: A man, a plan, a canal, Panama");
	        String input = scanner.nextLine();
	        
	        // Close the scanner
	        scanner.close();
	        
	        // Convert the input string to lowercase to make it case-insensitive
	        input = input.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
	        
	        // Call the function to check if the string is a palindrome
	        if (isPalindrome(input)) {
	            System.out.println("The string is a palindrome.");
	        } else {
	            System.out.println("The string is not a palindrome.");
	        }
	    }

	    // Function to check if a string is a palindrome
	    public static boolean isPalindrome(String str) {
	        int start = 0;
	        int end = str.length() - 1;

	        // Compare characters from both ends of the string
	        while (start < end) {
	            if (str.charAt(start) != str.charAt(end)) {
	                return false;
	            }
	            start++;
	            end--;
	        }
	        return true;
	    }
	}


	
