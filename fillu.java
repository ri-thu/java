import java.io.*;
class First extends Thread
{
    public void run()
    {
        try
        {
            FileInputStream fis = new FileInputStream("f1.txt");
            FileOutputStream fos = new FileOutputStream("f2.txt");
            int i = fis.read();
            while (i != -1)
            {
                if (i <= 97 && i >= 65)
                {
                    fos.write();
                }
            }
        }
        catch (FileNotFoundException e)
        {

        }
        catch (IOException e)
        {

        }
    }
}
class Second extends Thread
{
    public void run()
    {
        try
        {
            FileInputStream fis = new FileInputStream("f1.txt");
            FileOutputStream fos = new FileOutputStream("f3.txt");
            int i = fis.read();
            while (i != -1)
            {
                if (i > 97)
                {
                    fos.write();
                }
            }
        }
        catch (FileNotFoundException e)
        {

        }
        catch (IOException e)
        {

        }
    }
}
class fillu
{
    public static void main(String k[])
    {
        First f=new First();
        Second s=new Second();
        f.start();
        s.start();
    }
}