public class Multiples {
    public static void main(String[] args) {
        int n = 0;
        for (int i = 1; i < 1000; i++) {
            boolean MultiplesOf3 = i % 3 == 0;
            boolean MultiplesOf5 = i % 5 == 0;

            if (MultiplesOf3 & MultiplesOf5){
                n += 1;
            }

        }
        System.out.println(n);
    }
}
