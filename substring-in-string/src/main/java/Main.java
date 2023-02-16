import java.util.Locale;

public class Main {


    public static void main(String[] args) {
        System.out.println(countLetterInString("Fairytale", 'a'));
        System.out.println(countLetterInString("Fairytale", 't'));
        System.out.println(countLetterInString("Fairytale", 'f'));
        System.out.println(countLetterInString("Fairytale", 'T'));
        System.out.println(countLetterInString("Fairytale", 'k'));
        System.out.println(countLetterInString("Сказка", 'з'));
    }

    public static int countLetterInString(String input, char letter) {
//        TODO Method arguments are String and char. Count how many times a char appears in a string.
//        TODO Входные параметры - строка и символ. Посчитать, сколько раз символ встречается в строке.
        input = input.toLowerCase(Locale.ROOT);
        letter = Character.toLowerCase(letter);
        int count = 0;
        while (input.indexOf(letter) != -1) {
            count++;
            int i = input.indexOf(letter);
            input = input.substring(i + 1);
        }
        return count;
    }
}
