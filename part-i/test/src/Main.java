import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(checkIfPrime(13));
        System.out.println(checkIfPalindrome("kayak"));
        System.out.println(checkIfAnagram("sadder", "dreads"));
        System.out.println(Arrays.toString(printFibonacciSequence(10)));
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

    private static boolean checkIfAnagram(String str1, String str2) {
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        if (str1.length() != str2.length())
            return false;

        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Compare sorted arrays
        return Arrays.equals(charArray1, charArray2);
    }

    private static int[] printFibonacciSequence(int length) {
        var numbers = new int[length];
        for (int i = 0; i < length; ++i) {
            if (i == 0 || i == 1)
                numbers[i] = i;
            else {
                var last = numbers[i - 1];
                var secondToTheLast = numbers[i - 2];
                numbers[i] = secondToTheLast + last;
            }
        }
        return numbers;
    }
}