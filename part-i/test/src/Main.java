public class Main {
    public static void main(String[] args) {
        System.out.println(checkIfPrime(13));
    }

    private static boolean checkIfPrime(int number) {
        if (number <= 1)
            return false;

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0)
                return false;
        }

        return true;
    }
}