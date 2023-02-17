public class Main {

    public static void main(String[] args) {
        System.out.println(getFactorial(5));
        System.out.println(getFactorial(1));
        System.out.println(getFactorial(0));
    }

    public static int getFactorial(int num) {
//        TODO get factorial recursively
//        TODO вернуть факториал числа рекурсивно
//        factorial 0 = 1
        if (num == 0 || num == 1)
            return 1;
        return num * getFactorial(num - 1);
    }
}
