public class Task_03_Calculate_array_sum {
    public static void main(String[] args) {
        int[] marks = {45, 67, 80, 52, 90};
        int sum = 0;
        for (int value : marks) {
            sum += value;
        }
        System.out.println("Sum: " + sum);
    }
}
