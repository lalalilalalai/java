import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

//    TODO https://leetcode.com/problems/valid-palindrome/

    static public void main(String[] args) {
        String example = "3D3";
        System.out.println(isPalindrome(example));
    }

    public static boolean isPalindrome(String s) {
        String strLowerCase = s.toLowerCase();
        Pattern pattern = Pattern.compile("[a-z0-9]");
        Matcher matcher = pattern.matcher(strLowerCase);

        StringBuilder resultStraight = new StringBuilder();

        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            resultStraight = resultStraight.append(new StringBuilder(strLowerCase.substring(start, end)));
        }

        String resultStraightStr = resultStraight.toString();
        String resultReverseStr = resultStraight.reverse().toString();

        return resultStraightStr.equals(resultReverseStr);
    }
}