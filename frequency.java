import java.util.*;
import java.io.*;
class frequency
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String str;
		char m;
		int count=0,i;
		System.out.println("Enter a string");
		str=sc.nextLine();
		System.out.println("Enter the element to be searched");
		m=sc.nextLine().charAt(0);
		for(i=0;i<str.length();i++)
		{
			if(m==str.charAt(i))
			{
				count++;
			}
		
		}
		System.out.println("Frequency= "+count);
	}
}
