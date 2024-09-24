public class Palindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
    }

    /**
     * Returns true if the number is a palindrome.
     *
     * @param number the number to check
     * @return true if a palindrome, false if not
     */
    public static boolean isPalindrome(int number) {
        number = Math.abs(number);

        int numberClone = number;
        int reverse = 0;


        while (number > 0) {
            int lastDigit = number % 10;
            reverse = reverse * 10 + lastDigit;
            number /= 10;
        }


        return reverse == numberClone;
    }
}

