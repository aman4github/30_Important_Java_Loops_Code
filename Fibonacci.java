import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number : ");
        int num = sc.nextInt();
        int a = 0, b = 1,c;
        System.out.print(a + "\t" + b + "\t");

//        [0, 1, 1, 2, 3, 5, 8]
        for (int i = 0; i < (num - 2); i++){
            c = a + b;
            System.out.print(c + "\t");
            a = b;
            b = c;
        }

        sc.close();
    }
}
