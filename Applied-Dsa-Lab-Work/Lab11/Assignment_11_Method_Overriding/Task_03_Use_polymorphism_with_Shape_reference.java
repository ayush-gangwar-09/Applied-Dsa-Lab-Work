class Shape {
    int area() { return 0; }
}
class Square extends Shape {
    int side;
    Square(int side) { this.side = side; }
    @Override int area() { return side * side; }
}
public class Task_03_Use_polymorphism_with_Shape_reference{
    public static void main(String[] args) {
        Shape s = new Square(3);
        System.out.println("Area: " + s.area());
    }
}
