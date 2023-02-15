public class Main {

    // TODO https://leetcode.com/problems/excel-sheet-column-number/

    public static void main(String[] args) {
        String column = "AAC";
        System.out.println(titleToNumber(column));
    }

    public static int titleToNumber(String columnTitle) {
//        Map<Character, Integer> alphabet = new HashMap<>();
//        int index = 1;
//        for (char i = '\u0041'; i <= '\u005A'; i++) {
//            alphabet.put(i, index);
//            index++;
//        }

        int result = 0;

        for (int i = 0; i < columnTitle.length(); i++) {
//            добавлено "- 64" вместо HashMap, т.к. порядковый номер буквы = columnTitle.charAt(i) - 64
//            например для Z: 90 - 64 = 26
            result += (columnTitle.charAt(i) - 64) * Math.pow(26, (columnTitle.length() - 1) - i);
        }

        return result;
    }
}