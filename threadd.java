import java.io.*;
import java.util.*;
class lower extends Thread
{
    public void run()
    {
        try
        {
            int i;
            FileInputStream fi=new FileInputStream("f1.txt");
            FileOutputStream fo=new FileOutputStream("f2.txt");
            do
            {
                i=fi.read();
                if(i>=90&&i<=122)
                {
                    fo.write(i);
                }
            }while(i!=-1);
            fi.close();
            fo.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
class upper extends Thread
{
    public void run()
    {
        try
        {
            int i;
            FileInputStream fii=new FileInputStream("f1.txt");
            FileOutputStream foo=new FileOutputStream("f3.txt");
            do
            {
                i=fii.read();
                if(i>=65&&i<=90)
                {
                    foo.write(i);
                }
            }while(i!=-1);
            fii.close();
            foo.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
class threadd
{
    public static void main(String arg[])
    {
        try
        {
            int j,l;
            Scanner sc=new Scanner(System.in);
            char c[]=new char[15];
            System.out.println("Enter a string");
            String str=sc.nextLine();
            FileOutputStream fout=new FileOutputStream("f1.txt");
            l=str.length();
            for(j=0;j<l;j++)
            {
                fout.write(str.charAt(j));
            }
            fout.close();
            lower ll=new lower();
            upper up=new upper();
            ll.start();
            up.start();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
