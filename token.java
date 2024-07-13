import java.util.*;
class token
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        int n,sum=0;
        System.out.println("enter the number seperated by space");
        String s=sc.nextLine();
        StringTokenizer st=new StringTokenizer(s," ");
        System.out.println("entered integers are");
        while(st.hasMoreTokens())
        {
            String temp=st.nextToken();
            int a=Integer.parseInt(temp);
            System.out.println(a);
            sum+=a;
        }
        System.out.println("The sum of numbers is :"+sum);

    }
}