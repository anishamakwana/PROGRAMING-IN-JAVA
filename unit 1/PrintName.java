import java.util.Scanner;

class PrintName
{
    	public static void main(String args[])
    	{
       		 Scanner sc = new Scanner(System.in);

        		String name;

        		System.out.print("Enter your name: ");
        		name = sc.nextLine();

        		for(int i = 1; i <= 10; i++)
        		{
            			System.out.println(name);
        		}
    	}
}