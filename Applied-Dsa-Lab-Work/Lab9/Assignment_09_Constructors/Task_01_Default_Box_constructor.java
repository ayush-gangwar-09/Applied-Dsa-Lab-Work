class Box {
    int width;
    Box() {
        width = 10;
    }
}
public class Task_01_Default_Box_constructor {
    public static void main(String[] args) {
        Box b = new Box();
        System.out.println("Width: " + b.width);
    }
}
