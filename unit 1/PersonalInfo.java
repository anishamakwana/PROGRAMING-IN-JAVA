import java.util.Scanner;

class PersonalInfo
{
    	public static void main(String args[])
    	{
       	 Scanner sc = new Scanner(System.in);

        	String name;
        	int age;

        	System.out.print("Enter name: ");
        	name = sc.nextLine();

        	System.out.print("Enter age: ");
        	age = sc.nextInt();

        	System.out.println("Name = " + name);
        	System.out.println("Age = " + age);
   	 }
}