import java.util.*;
class first extends Thread
{
    public void run()
    {
        int i,a;
        Scanner sc=new Scanner(System.in);
        try
        {
            Random r=new Random();
            for( i=0;i<10;i++)
            {
                 a=r.nextInt(100);
                if(a%2==0)
                {
                    even e=new even(a);
                    e.start();

                }
                else
                {
                    odd o=new odd(a);
                    o.start();
                }
            }
        }
        catch(Exception e)
        {

        }
    }

}
class even extends Thread
{
    int n;
    even(int n1)
    {
        n=n1;
    }
    public void run()
    {
        try
        {
            System.out.println(n*n);
        }
        catch(Exception e)
        {

        }
    }
}
class odd extends Thread
{
    int n;
    odd(int n1)
    {
        n=n1;
    }
    public void run()
    {
        try
        {
            System.out.println(n*n*n);
        }
        catch(Exception e)
        {

        }
    }
}
class random1
{
    public static void main(String[] args) {
        first f=new first();
        f.start();
    }
}