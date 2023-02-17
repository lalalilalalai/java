public class Main {

    public static void main(String[] args) {
        int[] nums = {7, 11, 37, 0, -19, 37, -38}; // max = 37
        System.out.println(getArrayMaxNum(nums));
    }

    public static int getArrayMaxNum(int[] nums) {
        //    TODO Method which returns array max num (loop implementation is necessary)
        //    TODO Метод, возвращающий макс значение из входного массива (реализация через цикл)
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        return max;
    }
}
