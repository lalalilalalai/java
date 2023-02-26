import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String[] arr = {"flower", "flow", "flight"};
        System.out.println(getLongestCommonPrefix(arr));
        System.out.println(getLongestCommonPrefixQuicker(arr));
    }

//    TODO Write a function to find the longest common prefix string amongst an array of strings.
//         If there is no common prefix, return an empty string "".
//         https://leetcode.com/problems/longest-common-prefix/
//         https://www.educative.io/answers/how-to-find-the-longest-common-prefix-in-an-array-of-strings

    public static String getLongestCommonPrefix(String[] strs) {
        StringBuilder prefix = new StringBuilder();

        Arrays.sort(strs);

        String firstWord = strs[0];
        String lastWord = strs[strs.length - 1];

        for (int i = 0; i < firstWord.length(); i++) {
            if (firstWord.charAt(i) == lastWord.charAt(i))
                prefix.append(firstWord.charAt(i));
            else break;
        }

        return prefix.toString();
    }

    public static String getLongestCommonPrefixQuicker(String[] strs) {
        Arrays.sort(strs);
        String s1 = strs[0];
        String s2 = strs[strs.length - 1];
        int index = 0;
        while (index < s1.length() && index < s2.length()) {
            if (s1.charAt(index) == s2.charAt(index)) {
                index++;
            } else {
                break;
            }
        }
        return s1.substring(0, index);
    }


}
