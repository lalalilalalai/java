import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        System.out.println(countLetterInString("Fairytale", "a"));
        System.out.println(countLetterInString("Fairytale", "t"));
        System.out.println(countLetterInString("Fairytale", "f"));
        System.out.println(countLetterInString("Fairytale", "k"));
    }

    public static int countLetterInString(String input, String letter) {
        input = input.toLowerCase(Locale.ROOT);
        letter = letter.toLowerCase(Locale.ROOT);
        int count = 0;
        while (input.contains(letter)) {
            count++;
            int i = input.indexOf(letter);
            input = input.substring(i + 1);
        }
        return count;
    }
}
