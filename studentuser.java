import java.io.*;
import java.util.*;
class InvalidAgeException extends Exception
{

}
class InvalidNameException extends Exception
{

}
class student
{
    student(int rno,String name,int age,String course)
    {
        System.out.println("THE ROLL NO OF THE STUDENT "+rno);
        System.out.println("THE NAME NO OF THE STUDENT "+name);
        System.out.println("THE AGE NO OF THE STUDENT "+age);
        System.out.println("THE COURSE NO OF THE STUDENT "+course);

    }
    void test(int age)
    {
        try
        {
            if(age<15||age>21)
            {
                throw new InvalidAgeException();
            }
        }
        catch(InvalidAgeException e)
        {
            System.out.println("INVALID AGE");
        }
    }
    void test2(String n )
    {
        try{
        for(int i=0;i<n.length();i++)
        {
            char c=n.charAt(i);
            if(!((c>='A'&&c<='Z')||(c>='a'&&c<='z')))
            {
                
                throw new InvalidNameException();
            }
            
        }
    }
    catch(InvalidNameException e)
    {
        System.out.println("INVALID NAME");
    }
    }

}
class studentuser
{
    public static void main(String[] args) {
        int r,age;
        String na,co;
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE ROLL NO  NAME   AGE   COURSE OF THE STUDENT");
        r=sc.nextInt();
        sc.nextLine();
        na=sc.nextLine();
        age=sc.nextInt();
        sc.nextLine();
        co=sc.nextLine();
        student s=new student(r,na,age,co);
        s.test(age);
        s.test2(na);

    }
}