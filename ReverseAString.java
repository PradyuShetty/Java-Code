package ReverseString;

import java.util.Scanner;

public class ReverseAString {
	public static void main(String args[])
	{
		System.out.println("Enter the String");
		Scanner sc = new Scanner(System.in);
		 String str = sc.nextLine();
		for(int i=str.length() -1;i>=0;i--)
		{
			System.out.print(str.charAt(i));
		}
		
		
	}
}
