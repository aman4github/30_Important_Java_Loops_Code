import java.util.Scanner;

//  *
// * *
//* * *
public class PyramidPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the rows : ");
        int row = sc.nextInt();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < (row - (i+1)); j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (i+1); k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        sc.close();

    }
}
