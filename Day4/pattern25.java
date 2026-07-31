import java.util.Scanner;

class pattern25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter No: ");
        int no = sc.nextInt();

        for (int i = no; i >= 1; i--) {

            // Print leading spaces
            for (int s = 1; s < i; s++) {
                System.out.print("  ");
            }

            // Print numbers from i to no
            for (int j = i; j <= no; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }
}