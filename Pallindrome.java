package Pallindrome1;

import java.util.Scanner;

public class Pallindrome {
	static String reverse(String str)
	{
		String rev_str=new String();
		for(int i=str.length() -1;i>=0;i--)
		{
			rev_str = rev_str + (Character.toString((str.charAt(i))));
		}
		return rev_str;
	}
	public static void main(String args[])
	{
		System.out.println("Enter the String");
		Scanner sc = new Scanner(System.in);
		 String str = sc.nextLine();
		String rev_str = reverse(str);
		//System.out.println(rev_str);
		if(str.equals(rev_str))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not a Palindrome");
		}
	}
}
