public class Task_04_Print_even_array_values {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        for (int value : a) {
            if (value % 2 == 0) System.out.println(value);
        }
    }
}
