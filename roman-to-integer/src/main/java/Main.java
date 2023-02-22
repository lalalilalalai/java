public class Main {

    public static void main(String[] args) {
        System.out.println(romanToInt("XI")); // output: 11
        System.out.println(romanToInt("IV")); // output: 4
        System.out.println(romanToInt("MCMXCIV")); // output: 1994
        System.out.println(romanToInt("LVIII")); // output: 58
    }

//    TODO Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
//    Given a roman numeral, convert it to an integer.
//     https://leetcode.com/problems/roman-to-integer/
//    Symbol       Value
//    I             1
//    V             5
//    X             10
//    L             50
//    C             100
//    D             500
//    M             1000

    public static int romanToInt(String s) {
        char[] romanChars = s.toCharArray();
        int[] nums = new int[romanChars.length];
        int result = 0;
        for (int i = 0; i < romanChars.length; i++) {
            switch (romanChars[i]) {
                case 'M' -> nums[i] = 1000;
                case 'D' -> nums[i] = 500;
                case 'C' -> nums[i] = 100;
                case 'L' -> nums[i] = 50;
                case 'X' -> nums[i] = 10;
                case 'V' -> nums[i] = 5;
                case 'I' -> nums[i] = 1;
                default -> throw new RuntimeException("Non roman sign");
            }
        }
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < nums[i + 1]) {
                result -= nums[i];
            } else {
                result += nums[i];
            }
        }
        result += nums[nums.length - 1];
        return result;
    }
}
