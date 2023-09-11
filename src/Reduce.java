public class Reduce {
    public static void main(String[] args) {
        int num = 0;
        int n = 100;
        while (n != 0) {
            boolean Even = n % 2 == 0;

            if (Even) {
                n = n / 2;
                num += 1;
            }
            else {
                n -= 1;
                num += 1;
            }

        }
        System.out.println(num);
    }
}
