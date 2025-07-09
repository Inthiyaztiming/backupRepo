package Tests;

import java.util.HashSet;

public class randomcheck 
{
	public static void main (String[] args) 
	{
		String []a= {"ab","cd","ef"};
		String []b= {"af","ee","ef"};
		
		for(int i=0;i<a.length;i++) 
		{
			HashSet<Character> seta= new HashSet<>();
			for(char c:a[i].toCharArray()) 
			{
				seta.add(c);
			}
			HashSet<Character> setb= new HashSet<>();
			for(char c:b[i].toCharArray()) 
			{
				setb.add(c);
			}
			
			seta.retainAll(setb);
			if(!seta.isEmpty()) 
			{
				System.out.println("YES");
			}else 
			{
				System.out.println("NO");
			}
		}
		
	}
	 }
