public class Main {

    public static void main(String[] args) {
        System.out.println(sumNumberDigits(560));
        System.out.println(sumNumberDigits(100));
        System.out.println(sumNumberDigits(15));
        System.out.println(sumNumberDigits(0));
    }

    public static int sumNumberDigits(int number) {
//        TODO Argument is number. Return sum of number digits. For example: 100 → 1 , 15 → 6 и тд
//        TODO На вход приходит любое число. Вернуть сумму цифр числа. Пример: 100 → 1 , 15 → 6 и тд
        String str = Integer.toString(number);
        char[] digits = str.toCharArray();
        int sum = 0;
        for (char digit : digits) {
            sum += Character.getNumericValue(digit);
        }
        return sum;
    }
}
