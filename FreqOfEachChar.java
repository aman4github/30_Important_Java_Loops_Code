import java.util.Scanner;

public class FreqOfEachChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = sc.nextLine();
        int[] arr = new int[10];
        char[] ch = new char[10];
        int vacantIndex = 0, found, count, len = 0;

        for (int i = 0; i < str.length(); i++) {
            found = 0;
            for (char c : ch) {
                if (str.charAt(i) == c) {
                    found++;
                    break;
                }
            }
            if (found == 0) {
                ch[vacantIndex] = str.charAt(i);
                len++;
                vacantIndex++;
            } else {
                System.out.println(found);
            }
        }

        vacantIndex = 0;
        for (char ch1 : ch) {
            count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ch1)
                    count++;
            }
            arr[vacantIndex] = count;
            vacantIndex++;
        }

        for (int i = 0; i < len; i++) {
            System.out.println(ch[i] + " : " + arr[i]);
        }

        sc.close();
    }
}
