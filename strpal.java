import java.util.*;
class strpal
{
	public static void main(String args[])
	{
		String a,b;
		int l,i,flag=0,j;
		
		System.out.println("Enter a string");
		Scanner sc=new Scanner(System.in);
		a=sc.nextLine();
		System.out.println("Original: "+a);
		l=a.length();
		for(i=0;i<l;i++)
		{
			System.out.println(a.charAt(i));
		}
		j=0;
		for(i=0;i<l;i++)
		{
			j++;
			if(a.charAt(i)!=a.charAt(l-j))
	        {
	        	flag=1;
	        	break;
	        }
	        
	       }
	        if(flag==0)
			{
			System.out.println("Palindrome");
			}
			else
			{
				System.out.println("Not a palindrome");
			}
		}
	}

