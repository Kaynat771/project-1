public class EuclideanAlgorithm {
    public static void main(String[] args) {
        int num1 = 24;
        int num2 = 18;

        int gcd = findGCD(num1, num2);

        System.out.printf("GCD of %d and %d is %d", num1, num2, gcd);
    }

    public static int findGCD(int num1, int num2) {
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }
}
