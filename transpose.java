import java.util.*;
class transpose
{
	public static void main(String args[])
	{
		int a[][]=new int[10][10];
		int b[][]=new int[10][10];
		int r,c,i,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows and columns");
		r=sc.nextInt();
		c=sc.nextInt();
		System.out.println("Enter the elements into the matrix");
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("The matrix is:");
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				b[j][i]=a[i][j];
			}
		}
		System.out.println("The transpose of the matrix is:");
		for(i=0;i<c;i++)
		{
			for(j=0;j<r;j++)
			{
				System.out.print(b[i][j]+"\t");
			}
			System.out.println();
		}
	}
}