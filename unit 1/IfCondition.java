import java.util.Scanner;

class IfCondition
{
    public static void main(String args[])
    {
        int num;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        num = sc.nextInt();

        if(num > 0)
        {
            System.out.println("Number is positive");
        }
    }
}
