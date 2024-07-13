import java.io.*;
import java.util.*;
class filecharspace
{
    public static void main(String arg[])
    {
        int i,count1=0,count2=0,count3=0;
        try
        {
            FileInputStream fin=new FileInputStream("a.txt");
            do
            {
                i=fin.read();
                char c=(char)i;
                count1++;
                if(c==' '||c=='\t')
                {
                    count2++;
                }
                if(c=='\n')
                {
                    count3++;
                }
            }while(i!=-1);
            fin.close();
            System.out.println("number of characters : "+count1);
            System.out.println("number of spaces : "+count2);
            System.out.println("number of nextline: "+count3);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}