import java.util.*;
class multiply
{
	public static void main(String args[])
	{
		int a[][]=new int[10][10];
		int b[][]=new int[10][10];
		int c[][]=new int[10][10];
		int r1,r2,c1,c2,i,j,k,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows and columns of first matrix");
		r1=sc.nextInt();
		c1=sc.nextInt();
		System.out.println("Enter the number of rows and columns of second matrix");
		r2=sc.nextInt();
		c2=sc.nextInt();
		System.out.println("Enter the elements into the first matrix");
		for(i=0;i<r1;i++)
		{
			for(j=0;j<c1;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter the elements into the second matrix");
		for(i=0;i<r2;i++)
		{
			for(j=0;j<c2;j++)
			{
				b[i][j]=sc.nextInt();
			}
		}
		System.out.println("The first matrix is:");
		for(i=0;i<r1;i++)
		{
			for(j=0;j<c1;j++)
			{
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("The second matrix is:");
		for(i=0;i<r2;i++)
		{
			for(j=0;j<c2;j++)
			{
				System.out.print(b[i][j]+"\t");
			}
			System.out.println();
		}
		if(c1==r2)
		{
			for(i=0;i<r1;i++)
			{
				for(j=0;j<c2;j++)
				{
				sum=0;
					for(k=0;k<r2;k++)
					{
						sum=sum+(a[i][k]*b[k][j]);
					}
					c[i][j]=sum;
				}
				
			}
			System.out.println("The result is:");
			for(i=0;i<r1;i++)
			{
				for(j=0;j<c2;j++)
				{
					System.out.print(c[i][j]+"\t");
				}
				System.out.println();
			}
		}
		else
		{
			System.out.println("Multiplication not possible");
		}
	}
}