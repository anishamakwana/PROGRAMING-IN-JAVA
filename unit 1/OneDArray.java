import java.util.Scanner;

class OneDArray
{
   	 public static void main(String args[])
   	 {
        		int a[] = new int[5];

       		 Scanner sc = new Scanner(System.in);

       		 System.out.println("Enter 5 elements:");

       		 for(int i = 0; i < 5; i++)
       		 {
         			   a[i] = sc.nextInt();
        		 }

        		System.out.println("Array elements are:");
	
       		 for(int i = 0; i < 5; i++)
        		{
        			    System.out.println(a[i]);
       		}
   	 }
}