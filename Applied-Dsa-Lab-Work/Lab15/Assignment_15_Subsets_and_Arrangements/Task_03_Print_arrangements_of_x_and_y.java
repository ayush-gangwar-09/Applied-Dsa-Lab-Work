public class Task_03_Print_arrangements_of_x_and_y {
    static char[] letters = {'x', 'y'};
    static boolean[] used = new boolean[letters.length];
    static char[] result = new char[letters.length];
    static void arrange(int pos) {
        if (pos == letters.length) {
            System.out.println(new String(result));
            return;
        }
        for (int i = 0; i < letters.length; i++) {
            if (!used[i]) {
                used[i] = true;
                result[pos] = letters[i];
                arrange(pos + 1);
                used[i] = false;
            }
        }
    }
    public static void main(String[] args) {
        arrange(0);
    }
}
