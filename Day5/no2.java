import java.util.Scanner;
class no2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No: ");
        int no = sc.nextInt();
        int product=1;
        for (int i = 1; i <= no; i++) {
            product=product*i ;
        }
        System.out.println("Sum of Product Numbers: "+ product);
    }
}