import java.util.*;
class string
{
    public static void main(String args[])
    {
        int i,j,k;
        String s1=new String();
        String s2=new String();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String s=sc.nextLine();
        int l=s.length();
        int flag=0;
        for(i=0,j=0;i<l;i++)
        {

            j++;
            if(s.charAt(i)!=s.charAt(l-j))
            {
                flag=1;
                break;
            }
        }
        if(flag!=0)
        {
            System.out.println("String is not a palindrome");
        }
        else
        {
            System.out.println("String is a palindrome");
            int count=0;
            for(i=0;i<l;i++)
            {
                for(j=i+1;j<l;j++)
                {
                    if(s.charAt(i)==s.charAt(j))
                    {
                       count++; 
                    }
                }
                if(count!=0)
                {
                    s1=s1+s.charAt(i);
                }
            }
            int co=0;
            
            for(i=0;i<l;i++)
            {
                for(j=0;j<s1.length();j++)
                {
                    if(s.charAt(i)==s1.charAt(j))
                    {
                        co=1;
                        break;
                    }
            }
            if(co==0)
            {
                s2=s2+s1.charAt(i);
            }
        }

        System.out.println("Letters with no duplicates");
        for(i=0;i<s2.length();i++)
        {
            System.out.println(s2);
        }
        }    



    }
}