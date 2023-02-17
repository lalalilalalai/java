import java.util.Locale;

public class Main {


    public static void main(String[] args) {
        System.out.println(countLetterInString("Fairytale", 'f', true));
        System.out.println(countLetterInString("Fairytale", 'f', false));
        System.out.println(countLetterInString("Fairytale", 'T', false));
        System.out.println(countLetterInString("Fairytale", 'k', false));
        System.out.println(countLetterInString("Сказка", 'З', false));
    }

    public static int countLetterInString(String input, char letter, boolean isCaseSensitive) {
//        TODO Method arguments are String and char. Count how many times a char appears in a string.
//        TODO Входные параметры - строка и символ. Посчитать, сколько раз символ встречается в строке.
        if (!isCaseSensitive) {
            input = input.toLowerCase(Locale.ROOT);
            letter = Character.toLowerCase(letter);
        }
        int count = 0;
        while (input.indexOf(letter) != -1) {
            count++;
            int i = input.indexOf(letter);
            input = input.substring(i + 1);
        }
        return count;
    }
}
