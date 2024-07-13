import java.io.*;

class dup
{
    public static void main(String[] args) {
        try
        {
             int i,j,flag;
             FileInputStream fin=new FileInputStream("string1.txt");
             FileOutputStream fout=new FileOutputStream("dup.txt");
             FileOutputStream fout1=new FileOutputStream("nondup.txt");
             StringBuffer s=new StringBuffer();
             do
             {
                i=fin.read();
                
                char c=(char)i;
                if(i!=-1)
                {
                    s.append(c);
                }
             }while(i!=-1);

             for(i=0;i<s.length();i++)
             {
                Boolean h=false;
                
                for(j=0;j<s.length();j++)
                {
                    if(s.charAt(i)==s.charAt(j))
                    {
                            h=true;
                            break;
                    }
                }
                if(h==true)
                {
                    fout.write(s.charAt(i));
                }
                else
                {
                    fout1.write(s.charAt(i));
                }
             }
             
            fin.close();
            fout.close();
            fout1.close();
             

        }  
        catch(Exception e)
        {

        }   
    }
}