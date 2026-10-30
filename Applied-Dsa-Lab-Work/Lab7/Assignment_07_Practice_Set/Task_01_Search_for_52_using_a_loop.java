public class Task_01_Search_for_52_using_a_loop {
    public static void main(String[] args) {
        int[] a = {45, 52, 80};
        int index = -1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 52) { index = i; break; }
        }
        if (index >= 0) System.out.println("Found at index " + index);
        else System.out.println("Not found");
    }
}
