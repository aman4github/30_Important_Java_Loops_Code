public class PrimeNumber1To100 {
    public static void main(String[] args) {
        int flag = 0;

        for(int i = 1; i <= 100; i++) {
            flag = 0;
            for(int j = 2; j <= (i / 2); j++) {
                if(i % j == 0) {
                    flag++;
                    break;
                }
            }
            if(flag == 0)
                System.out.print(i + "\t");
        }
    }
}
