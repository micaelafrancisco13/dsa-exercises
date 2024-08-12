public class Main {
    public static void main(String[] args) {
        System.out.println(checkIfPrime(13));
        System.out.println(checkIfPalindrome("kayak"));
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


    private static boolean checkIfPalindrome(String string) {
        // 0 1 2 3
        // m a m a

        // 0 1 2
        // d a d
        // index[0] = d compared index[2] = d
        // if above is true, ++left index and --right index
        // index[1] = a compared index[1] = a
        var characters = string.toCharArray();

        // length is 4
        // last index = length - 1
        // two-pointer:
        // initial index compared with the last index

        var initialPosition = 0;
        var lastPosition = string.toCharArray().length - 1;

        // kayak

        //
        // sad
        //
        var isPalindrome = false;
        while (initialPosition != lastPosition) {
            // 0 1 2
            // d a d

            // i = 0, l = 2
            // i == l -> i = 1, l = 1
            // i == l ->
            if (characters[initialPosition] == characters[lastPosition]) {
                ++initialPosition;
                --lastPosition;
            }
            else break;
            isPalindrome = true;
        }
        return isPalindrome;
    }
}