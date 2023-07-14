package Fibonacci;

public class Fibonacci1 {
	public static void main(String args[])
	{
		int n1=0,n2=1 , n3 ,count=10;
		System.out.println(n1+""+n2);
		for(int i=2;i<=count;++i);//loop starts from 2 because 0 and1 are already printed
		n3=n1+n2;
		System.out.println(""+n3);
		n1=n2;
		n2=n3;
	}
}
