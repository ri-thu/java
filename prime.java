import java.util.*;
import java.io.*;
class prime
{
    public static void main(String args[])
    {
        try
        {
            FileInputStream fin=new FileInputStream("f1.txt");
            FileOutputStream fo=new FileOutputStream("f2.txt");
            FileOutputStream fout=new FileOutputStream("f3.txt");
            int i;
            do
            {
                i=fin.read();
                int num=Character.getNumericValue(i);
                int flag=0;
                for(int j=2;j<num;j++)
                {
                     if(num%j==0)
                    {
                        flag=1;
                        break;
                    }
                }
                if(flag==0)
                {
                    fout.write(i);
                }
                else
                {
                    fo.write(i);
                 }
            }while(i!=-1);
         }
         catch(Exception e)
         {
            System.out.println(e);
         }
}
}