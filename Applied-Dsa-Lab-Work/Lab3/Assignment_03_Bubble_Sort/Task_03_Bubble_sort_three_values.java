public class Task_03_Bubble_sort_three_values {
    public static void main(String[] args) {
        int[] a = {9, 7, 3};
        for (int pass = 0; pass < a.length - 1; pass++) {
            for (int i = 0; i < a.length - 1 - pass; i++) {
                if (a[i] > a[i + 1]) {
                    int temp = a[i]; 
                    a[i] = a[i + 1]; 
                    a[i + 1] = temp;
                }
            }
        }
        for (int value : a) 
            System.out.println(value);
    }
}
