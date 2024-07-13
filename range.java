import java.util.*;
class range
{
	public static void main(String args[])
	{
		int i,j,m,n,flag;
		System.out.println("Enter the upper limit and lower limit");
		Scanner sc=new Scanner(System.in);
		m=sc.nextInt();
		n=sc.nextInt();
		System.out.println("The prime numbers between 2 and 15 are:");
		for(i=m;i<=n;i++)
		{
			flag=0;
			for(j=2;j<i;j++)
			{
				if(i%j==0)
				{
					flag=1;
					break;
				}
			}
			if(flag==0)
			{
				System.out.println(i);
			}
		}
	}
}
