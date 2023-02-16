public class Main {

    public static void main(String[] args) {
        processRange(15, 18);
    }

    public static void processRange(int start, int stop) {
//        TODO Method with two arguments - range start and range end.
//         Sort out range and print them by rule:
//         If num is multiple of 3 - print "hard",
//         If num is multiple of 5 - print "bass",
//         If num is multiple of 3 and 5 - print "hardbass",
//         Else print num.
//        TODO Метод принимает два параметра: начало и конец диапазона.
//         После этого метод перебирает числа в указанном диапазоне и выводит в консоль по правилу:
//         Если число кратно трем - выводится "hard",
//         если число кратно 5 - выводится "bass".
//         Если кратно 3 и 5 - "hardbass".
//         Иначе - выводится само число.
        for (int i = start; i <= stop; i++) {
            if (i % 3 == 0) {
                System.out.print("hard");
            }
            if (i % 5 == 0) {
                System.out.print("bass");
            }
            if (i % 5 != 0 && i % 3 != 0) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
