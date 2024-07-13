import java.util.*;

class linear
{
        public static void main(String args[])
        {
            int n,i,m,pst=0,flag=0;
            int a[];
            a=new int[10];
            System.out.println("Enter the number of elements in the array");
            Scanner sc=new Scanner(System.in);
            n=sc.nextInt();
            System.out.println("Enter the elements");
            for(i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
            
            }
            System.out.println("Enter the element to be searched");
            m=sc.nextInt();
            for(i=0;i<n;i++)
            {
                if(a[i]==m)
                {
                    pst=i+1;
                    flag=1;
                    break;
                }
            }
            if(flag==1)
            {
                System.out.println("Element found at position "+pst);
            }
            else
            {
                System.out.println("Element not found");
            }
        

        }
}