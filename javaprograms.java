package Tests;

import java.util.Scanner;

public class javaprograms
{
	//Print given numbers even or odd only one number
	public static void main(String[] args)
	{
		
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number to check even or odd:");
		int num= sc.nextInt();
		
		if(num%2==0) 
		{
			System.out.println("even");
		}
		else 
		{
			System.out.println("odd");
		}
		
		sc.close();
			
    }
		
		
}

//Check if a number is divisible by 5 and 11- Entire code will be same just we will change the condition based on our program
//if (number % 5 == 0 && number % 11 == 0)

//Check if a year is a leap year
//if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))


//student status based on marks
//if (in < 35) {
//    System.out.println("Fail");
//} else if (in == 35) {
//    System.out.println("Pass");
//} else if (in > 35 && in <= 70) {
//    System.out.println("Third Class");
//} else if (in > 70 && in <= 85) {
//    System.out.println("Second Class");
//} else if (in > 85) {
//    System.out.println("First Class");

//	Prime number check
//Prime numbers are only divisible by 1 and themselves.
//1 is not a prime number, because it only has one divisor (1 itself).
//The smallest prime number is 2, and it is the only even prime number.
//All other even numbers (like 4, 6, 8, 10, etc.) are not prime, because they can be divided by 2.

//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter a number: ");
//        int num = scanner.nextInt();
//        
//        // Prime number check within the main method
//        boolean isPrime = true;
//        
//        if (num <= 1) {
//            isPrime = false; // Numbers less than or equal to 1 are not prime
//        } else {
//            for (int i = 2; i < num; i++) {
//                if (num % i == 0) {
//                    isPrime = false; // If divisible by any number, it's not prime
//                    break;
//                }
//            }
//        }
//        
//        if (isPrime) {
//            System.out.println(num + " is a prime number.");
//        } else {
//            System.out.println(num + " is not a prime number.");
//        }
//
//        scanner.close();
//    }}


//checking days
//switch(dayName) 
//{
//case "Monday":
//case "tue":
//case "wed":
//case "thu":
//case "fri":
//	System.out.println("weekday");
//	break;
//case "sat":
//case "sun":
//	System.out.println("weekend");
//	break;
//	default :
//		System.out.println("def");
//}
//
//sc.close();