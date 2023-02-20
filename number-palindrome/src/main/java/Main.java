public class Main {

    //    TODO Given an integer x, return true if x is a palindrome, and false otherwise.
//    https://leetcode.com/problems/palindrome-number/
    public static void main(String[] args) {
        System.out.println(isNumberPalindrome(100));
        System.out.println(isNumberPalindrome(55));
        System.out.println(isNumberPalindrome(-10));
    }


    public static boolean isNumberPalindrome(int x) {
//        TODO repeat
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int revertedNumber = 0;
        while (x > revertedNumber) {
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }

        return x == revertedNumber || x == revertedNumber / 10;
    }


    public static boolean isNumberPalindromeStr(int x) {
        String numStr = String.valueOf(x);
        String reversedNumStr = new StringBuilder(numStr).reverse().toString();
        return numStr.equals(reversedNumStr);
    }
}
