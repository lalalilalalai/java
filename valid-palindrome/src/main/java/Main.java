import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

//    TODO https://leetcode.com/problems/valid-palindrome/

    static public void main(String[] args) {
        System.out.println(isPalindrome("Mr. Owl ate my metal worm"));
        System.out.println(isPalindrome("Was it a car or a cat I saw?"));
        System.out.println(isPalindrome("F 6 f"));
        System.out.println(isPalindrome("king5"));
    }

    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        StringBuilder stringBuilder = new StringBuilder();
        Pattern p = Pattern.compile("\\w");
        Matcher m = p.matcher(s);
        while (m.find()) {
            int start = m.start();
            int end = m.end();
            stringBuilder.append(s, start, end);
        }

        String straight = stringBuilder.toString();
        String reverse = stringBuilder.reverse().toString();

        return straight.equals(reverse);
    }
}