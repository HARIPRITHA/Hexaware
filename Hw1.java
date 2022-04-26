import java.util.Scanner;
 

class A
{

      A()
      {
       Scanner  sc = new Scanner(System.in);

       System.out.print("Enter Id : ");
       int Id =  sc .nextInt();

       System.out.print("Enter name : ");
       String name =  sc .next();

       System.out.print("Enter age : ");
       int age =  sc .nextInt();

       System.out.print("Enter salary : ");
       int salary =  sc .nextInt();

       System.out.print("Enter designation : ");
       String designation =  sc .next();

       System.out.println("Id is : "+Id);
       System.out.println("name is : "+name);
       System.out.println("age is : "+age);
       System.out.println("salary is : "+salary);
       System.out.println("designation is : "+designation);



      }
}

class Hw1
{
       public static void main(String args[])
       {
        A a = new A();//creating a object
        
       }

}