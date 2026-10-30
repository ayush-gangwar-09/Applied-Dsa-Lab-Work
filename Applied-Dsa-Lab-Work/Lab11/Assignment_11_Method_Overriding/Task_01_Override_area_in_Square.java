class Shape {
    int area() { return 0; }
}
class Square extends Shape {
    int side;
    @Override int area() { return side * side; }
}
public class Task_01_Override_area_in_Square {
    public static void main(String[] args) {
        Square s = new Square();
        s.side = 4;
        System.out.println("Area: " + s.area());
    }
}
