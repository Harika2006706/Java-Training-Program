import java.util.Scanner;

class no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a no: ");
        int no=sc.nextInt();
        int i=1;
        for(;i<=no;i++){
            System.out.println(i+" ");
        }
    }
}