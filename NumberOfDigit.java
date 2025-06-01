import java.util.Scanner;

public class NumberOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number : ");
        int num = sc.nextInt();
        int flag = 0;

        while(num != 0) {
            flag++;
            num /= 10;
        }

        System.out.println(flag);

        sc.close();
    }
}
