class Box {
    int width;
    Box(int width) {
        this.width = width;
    }
}
public class Task_02_Parameterized_Box_constructor {
    public static void main(String[] args) {
        Box b = new Box(25);
        System.out.println("Width: " + b.width);
    }
}
