public class Task_03_Multiply_array_values {
    public static void main(String[] args) {
        int[] a = {2, 3, 4};
        int product = 1;
        for (int value : a) product *= value;
        System.out.println("Product: " + product);
    }
}
