import java.io.*;
import java.util.*;

class upper extends Thread
{
    public void run()
    {
        try
        {
            FileInputStream fin=new FileInputStream("f11.txt");
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
            FileInputStream fin=new FileInputStream("f11.txt");
            FileOutputStream fou=new FileOutputStream("f3.txt");
            int i;
            do
            {
                i=fin.read();
                
                
                    if((i>=97)&&(i<=122))
                    {   
                        fou.write(i);
                    }
                
            }while(i!=-1);
            fin.close();
            fou.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
class upplr
{
    public static void main(String args[])
    {
        int i;
        String s;
        try
        {
            FileOutputStream fout1=new FileOutputStream("f11.txt");
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the string");
            s=sc.nextLine();
            i=0;
           int l=s.length();
           for(int j=0;j<l;j++)
           {
             fout1.write(s.charAt(j));
           }
            fout1.close();
            lower ll=new lower();
            upper u=new upper();
            ll.start();
            u.start();            
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}