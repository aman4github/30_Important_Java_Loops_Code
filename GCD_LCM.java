import java.util.Scanner;

public class GCD_LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the 1st number : ");
        int n1 = sc.nextInt();

        System.out.print("Enter the 2nd number : ");
        int n2 = sc.nextInt();

        int gcdValue = 1;

        if(n1 < n2) {
            for(int i = 2; i <= n1; i++)
                if(n1 % i == 0 && n2 % i == 0)
                    gcdValue = i;
        } else {
            for(int i = 2; i <= n2; i++)
                if(n1 % i == 0 && n2 % i == 0)
                    gcdValue = i;
        }

        System.out.println(gcdValue);

        System.out.println((n1 * n2) / (gcdValue));

        sc.close();
    }
}
