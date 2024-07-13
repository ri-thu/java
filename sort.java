import java.util.*;
class sort
{
    public static void main(String args[])
    {
        int n,i,a[],temp,j;
        a=new int[10];
        System.out.println("Enter the number of elements");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        System.out.println("Enter the elements into the array");
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("The array before sorting is");
        for(i=0;i<n;i++)
        {
            System.out.print(a[i]+"\t");
        }
        System.out.println();
        
        for(i=0;i<n-1;i++)
        {
            for(j=0;j<n-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
        }
    }
    System.out.println("The sorted array is");
    for(i=0;i<n;i++)
    {
        System.out.print(a[i]+"\t");
    }
    System.out.println();
}
    
}
