public class Task_02_Bubble_sort_the_array {
    public static void main(String[] args) {
        int[] a = {3, 1, 2};
        for (int pass = 0; pass < a.length - 1; pass++) {
            for (int i = 0; i < a.length - 1 - pass; i++) {
                if (a[i] > a[i + 1]) {
                    int temp = a[i]; a[i] = a[i + 1]; a[i + 1] = temp;
                }
            }
        }
        for (int value : a) System.out.println(value);
    }
}
