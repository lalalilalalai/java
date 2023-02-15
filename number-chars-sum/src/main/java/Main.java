import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        while (true) {
            String input = new Scanner(System.in).nextLine();
            if (input.equals("exit")) {
                break;
            }
            try {
                System.out.println(sumNumberChars(input));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    //    Input is any number. You need to add up the digits. Example: 99 → 18, 123 → 6
    public static int sumNumberChars(String input) {
        String regex = "\\d+";
        if (input.matches(regex)) {
            int sum = 0;
            for (int i = 0; i < input.length(); i++) {
                String digit = String.valueOf(input.charAt(i));
                sum += Integer.parseInt(digit);
            }
            return sum;
        }
        throw new RuntimeException("Entered non-number!");
    }
}
