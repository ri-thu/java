import java.util.*;
class employee
{
	String name;
	int age;
	int phone_no;
	String address;
	int salary;
	void print_salary(int s)
	{
		System.out.println("Salary: "+s);
	}
}
	class officer extends employee
	{
		String specialization;
		
	
	}
	class manager extends employee
	{
		String department;
	}

class inheritancei
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		officer o=new officer();
		System.out.println("Enter the details of officer");
		System.out.println("Enter Name");
		o.name=sc.nextLine();
		System.out.println("Enter address");
		o.address=sc.nextLine();
		System.out.println("Enter Age");
		o.age=sc.nextInt();
		System.out.println("Enter phone number");
		o.phone_no=sc.nextInt();
		
		System.out.println("Enter salary");
		o.salary=sc.nextInt();
		manager m=new manager();
		sc.nextLine();
		System.out.println("Enter the details of manager");
		System.out.println("Enter Name");
		m.name=sc.nextLine();
		System.out.println("Enter address");
		m.address=sc.nextLine();
		System.out.println("Enter Age");
		m.age=sc.nextInt();
		System.out.println("Enter phone number");
		m.phone_no=sc.nextInt();
		
		System.out.println("Enter salary");
		m.salary=sc.nextInt();
		employee e=new employee();
		
           System.out.println("Officer:\nName: "+o.name+"\nAge: "+o.age+"\nphone     number: "+o.phone_no+"\naddress: "+o.address);
		e.print_salary(o.salary);
		System.out.println("Manager\nName: "+m.name+"\nAge: "+m.age+"\nphone number: "+m.phone_no+"\naddress: "+m.address);
		e.print_salary(m.salary);
	}
}
