import java.io.*;
import java.util.*;

class upper extends Thread
{
    public void run()
    {
        try
        {
            FileInputStream fin=new FileInputStream("f1.txt");
            FileOutputStream fout=new FileOutputStream("f2.txt");
            int i;
            do
            {
                i=fin.read();
                    if((i>=65)&&(i<=90))
                    {   
                        fout.write(i);
                     }
                 
            }while(i!=-1);
            fin.close();
            fout.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
class lower extends Thread 
{
    public void run()
    {
        try
        {
            FileInputStream fi=new FileInputStream("f1.txt");
            FileOutputStream fo=new FileOutputStream("f3.txt");
            int i;
            do
            {
                i=fi.read();
                    if((i>=97)&&(i<=122))
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
class uplow
{
    public static void main(String args[])
    {
        int i;
        String s;
        try
        {
            FileOutputStream fout1=new FileOutputStream("f1.txt");
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the string");
            s=sc.nextLine();
            for(i=0;i<s.length();i++)
            {
                fout1.write(s.charAt(i));
            }
            fout1.close();
            lower l=new lower();
            upper u=new upper();
            l.start();
            u.start();            
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}