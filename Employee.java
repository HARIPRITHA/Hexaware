import java.util.Scanner;

class Clerk
 {
	int id;
	int age;
	String name;
	
	static int salary = 15000;
        static String designation = "Clerk";

	Clerk()
	{
        
	Scanner sc = new Scanner(System.in);

	System.out.print("Enter the Clerk Id : ");
	id = sc.nextInt();

	System.out.print("Enter the Clerk Name : ");
	name = sc.next();

	System.out.print("Enter the Clerk Age : ");
	age = sc.nextInt();
	

	}

	 void display()
		{
		System.out.println(" Clerks Id is : "+id);
		System.out.println(" Clerks Name is : "+name);
		System.out.println(" Clerks Age is : "+age);
		System.out.println(" Clerks Salary is : "+salary);
		System.out.println(" Designation is : "+designation);
		}

 }

class Developer
 {
	int id;
	int age;
	String name;
	
	static int salary = 25000;
        static String designation = "Developer";

	Developer()
	{
        
	Scanner sc = new Scanner(System.in);

	System.out.print("Enter the developer Id : ");
	id = sc.nextInt();

	System.out.print("Enter the developer Name : ");
	name = sc.next();

	System.out.print("Enter the developer Age : ");
	age = sc.nextInt();
	

	}

	 void display()
		{
		System.out.println(" Developer Id is : "+id);
		System.out.println(" Developer Name is : "+name);
		System.out.println(" Developer Age is : "+age);
		System.out.println(" Developer Salary is : "+salary);
		System.out.println(" Designation is : "+designation);
		}

 }

class Tester
 {
	int id;
	int age;
	String name;
	
	static int salary = 20000;
        static String designation = "Tester";

	Tester()
	{
        
	Scanner sc = new Scanner(System.in);

	System.out.print("Enter the Tester Id : ");
	id = sc.nextInt();

	System.out.print("Enter the Tester Name : ");
	name = sc.next();

	System.out.print("Enter the Tester Age : ");
	age = sc.nextInt();
	

	}

	 void display()
		{
		System.out.println(" Tester Id is : "+id);
		System.out.println(" Tester Name is : "+name);
		System.out.println(" Tester Age is : "+age);
		System.out.println(" Tester Salary is : "+salary);
		System.out.println(" Designation is : "+designation);
		}

 }

class Manager
 {
	int id;
	int age;
	String name;
	
	static int salary = 50000;
        static String designation = "Manager";

	Manager()
	{
        
	Scanner sc = new Scanner(System.in);

	System.out.print("Enter the Manager Id : ");
	id = sc.nextInt();

	System.out.print("Enter the Manager Name : ");
	name = sc.next();

	System.out.print("Enter the Manager Age : ");
	age = sc.nextInt();
	

	}

	 void display()
		{
		System.out.println("Manager Id is : "+id);
		System.out.println("Manager Name is : "+name);
		System.out.println("Manager Age is : "+age);
		System.out.println("Manager Salary is : "+salary);
		System.out.println(" Designation is : "+designation);
		}

 }




class Employee
{
	public static void main(String args[])
		{

	Scanner sc = new Scanner(System.in);

	System.out.println("Enter the number between 1 to 5");
	int i = sc.nextInt();
        if(i>0&&i<=5){
	switch(i){
			
			case 1 : Clerk c = new Clerk();
			c.display();
			break;
			case 2 : Developer d = new Developer();
			d.display();
			break;
			case 3 : Tester t = new Tester();
			t.display();
			break;
			case 4 : Manager m = new Manager();
			m.display();
			case 5: System.out.println("Exit ,Thank you! ....Enter a valid number");
		}
              }

		}

}