import java.util.Scanner;

class ScannerDemo
{
    	public static void main(String args[])
    	{
        		Scanner sc = new Scanner(System.in);

        		System.out.print("Enter your Name: ");
        		String name = sc.nextLine();

        		System.out.print("Enter your Age: ");
        		int age = sc.nextInt();

        		System.out.print("Enter your Marks: ");
        		float marks = sc.nextFloat();

        		System.out.print("Enter your Gender (M/F): ");
        		char gender = sc.next().charAt(0);

        		System.out.println("\n----- User Details -----");
        		System.out.println("Name   : " + name);
        		System.out.println("Age    : " + age);
        		System.out.println("Marks  : " + marks);
        		System.out.println("Gender : " + gender);
    	}
}