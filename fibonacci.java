import java.util.*;

class fibonacci
{  
    public static void main(String args[])  
    {    
        int a = 0,b = 1,c,i,n; 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter limit:");
        n = sc.nextInt();   
        System.out.println(a);   
        System.out.println(b);
        for(i=2;i<=n;i++)  
        {    
            c = a+b;    
            System.out.println(c);    
            a = b;    
            b = c;    
        }
    }
}
