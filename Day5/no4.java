//sum of digits
import java.util.Scanner;

class no4
{
    public static void main(String args[])
    {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter no's: ");
        int no = Sc.nextInt();
        int sum=0,digit;
        while(no>0)
        {
            digit=no%10;
            sum=sum+digit;
            no=no/10;
        }
        System.out.println("Sum of digits:" +sum);
    }
}