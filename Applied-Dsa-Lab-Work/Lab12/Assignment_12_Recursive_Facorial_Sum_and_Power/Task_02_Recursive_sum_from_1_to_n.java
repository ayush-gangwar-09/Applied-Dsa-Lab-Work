public class Task_02_Recursive_sum_from_1_to_n {
    static int sum(int n) {
        if (n == 0) return 0;
        return n + sum(n - 1);
    }
    public static void main(String[] args) {
        System.out.println(sum(10));
    }
}
