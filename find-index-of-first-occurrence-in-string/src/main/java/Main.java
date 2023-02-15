public class Main {

//    TODO https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/

    public static void main(String[] args) {
        String haystack = "leetcode";
        String needle = "leeto";
        System.out.println(strStr(haystack, needle));
    }

    public static int strStr(String haystack, String needle) {
        int index = haystack.indexOf(needle);
        return index;
    }
}