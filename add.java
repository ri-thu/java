import java.util.*;
class add
{
    public static void main(String args[])
    {
        int a[][]=new int[10][10];
        int b[][]=new int[10][10];
        int c[][]=new int[10][10];
        int r1,r2,c1,c2,i,j;
        Scanner sc=new Scanner(System.in);
         System.out.println("Enter the rows and columns of first matrix");
        r1=sc.nextInt();
        c1=sc.nextInt();
       
        System.out.println("Enter the elements into the first matrix");
        for(i=0;i<r1;i++)
        {
            for(j=0;j<c1;j++)
            {
                a[i][j]=sc.nextInt();
        }
    }
     System.out.println("Enter the rows and columns of second matrix");
        r2=sc.nextInt();
        c2=sc.nextInt();
    System.out.println("Enter the elements into the second matrix");
        for(i=0;i<r2;i++)
        {
            for(j=0;j<c2;j++)
            {
                b[i][j]=sc.nextInt();
        }
    }
    System.out.println("1st matrix:");
     for(i=0;i<r1;i++)
        {
            for(j=0;j<c1;j++)
            {
               System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("2nd matrix:");
         for(i=0;i<r2;i++)
        {
            for(j=0;j<c2;j++)
            {
                System.out.print(b[i][j]+"\t");
           }
           System.out.println();
        }
        if((r1==r2)&(c1==c2))
        {
            for(i=0;i<r1;i++)
            {
                for(j=0;j<c1;j++)
                {
                    c[i][j]=a[i][j]+b[i][j];
                }
            }
            System.out.println("The sum is:");
            for(i=0;i<r1;i++)
            {
                for(j=0;j<c1;j++)
                {
                    System.out.print(c[i][j]+"\t");
                }
                System.out.println();
            }
        }
        else
        {
            System.out.println("Addition not possible");
        }
    }
}

