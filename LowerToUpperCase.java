import java.util.Scanner;

public class LowerToUpperCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the String : ");
        String str = sc.nextLine();
        String str2 = "";

        for (int i = 0; i < str.length(); i++) {
            str2 += Character.toUpperCase(str.charAt(i));
        }

        System.out.println(str2);

        sc.close();
    }
}
