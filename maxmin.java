import java.util.*;
class maxmin
{
	public static void main(String args[])
	{
		int a[]=new int[50];
		int n,i,s,l;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements ");
		n=sc.nextInt();
		System.out.println("Enter the elements into the array");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		l=a[0];
		for(i=0;i<n;i++)
		{
			if(a[i]>l)
			{
				l=a[i];
			}
		}
		System.out.println("The largest element is "+l);
		s=a[0];
		for(i=0;i<n;i++)
		{
			if(a[i]<s)
			{
				s=a[i];
			}
		}
		System.out.println("The smallest element is "+s);
	}
}


