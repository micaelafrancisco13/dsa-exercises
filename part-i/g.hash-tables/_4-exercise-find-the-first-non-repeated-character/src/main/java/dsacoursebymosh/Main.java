package dsacoursebymosh;

public class Main {
    public static void main(String[] args) {
        var charFinder = new CharFinder();

        System.out.println("non-repeating character " + charFinder.findFirstNonRepeatingChar("a green apple"));
        System.out.println("repeating character " + charFinder.findFirstRepeatingChar("a green apple"));
    }
}