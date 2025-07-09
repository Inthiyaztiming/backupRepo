package Tests;

import java.util.Scanner;

public class javaprograms2
{
	//Print given numbers even or odd specific range
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter first");
		int num= sc.nextInt();
		
		System.out.println("Enter second");
		int num1= sc.nextInt();
		
		for(int i=num;i<num1;i++) 
		{
			if(i%2==0) 
			{
				System.out.println(i);
			}
			
		}
		
		
		sc.close();
	}}	
//sum of even numbers for specific range
//int sum = 0;
//
////Loop through the range and add even numbers to sum
//for (int i = start; i <= end; i++) {
//  if (i % 2 == 0) {
//      sum += i;  // Add to sum if the number is even
//  }
//}

//// odd numbers in reverse order
//System.out.println("Enter first");
//int num= sc.nextInt();
//
//System.out.println("Enter second");
//int num1= sc.nextInt();
//
//for(int i=num;i>=num1;i--) 
//{
//	if(i%2==1) 
//	{
//		System.out.println(i);
//	}
//	
//}
//
//
//sc.close();