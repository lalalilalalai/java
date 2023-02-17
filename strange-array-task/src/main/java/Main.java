import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] a = {3, 4, 4};
        int[] b = {1, 2, 3, 4, 7};
        System.out.println(Arrays.toString(getArr(a, b)));
    }


//    TODO  Method with two arr arguments (a, b), returns arr c,
//     fill arr c by rule: arr values = quantity of elements in arr a, which <= element of arr b
//    TODO Метод на прием массивов a и b, на выходе массив c,
//     массив c заполняется следующим образом:
//     его i-ый элемент равен количеству элементов массива a,
//     которые меньше либо равны i-тому элементу массива b
    public static int[] getArr(int[] a, int[] b) {
        int[] c = new int[b.length];
        for (int i = 0; i < b.length; i++) {
            int count = 0;
            for (int j = 0; j < a.length; j++) {
                if (a[j] <= b[i])
                    count++;
            }
            c[i] = count;
        }
        return c;
    }
}
