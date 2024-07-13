import java.io.*;
import java.util.*;
class file
{
    public static void main(String ar[])
    {
        try
        {
            int i,count1=0,count2=0,count3=0;
            FileInputStream fin= new FileInputStream("data.txt");
            do
            {
                i=fin.read();
                char c=(char)i;
                count1++;
                if(c==' '||c=='\n')
                {
                    count2++;
                }
                if(c=='\n')
                {
                    count3++;
                }
            }while(i!=-1);
            System.out.println("NO OF CHARACTERS"+count1);
            System.out.println("NO OF WORDS"+count2);
            System.out.println("NO OF LINES"+count3);
            fin.close();
            
        }
        catch(Exception e)
        {

        }
    }
}