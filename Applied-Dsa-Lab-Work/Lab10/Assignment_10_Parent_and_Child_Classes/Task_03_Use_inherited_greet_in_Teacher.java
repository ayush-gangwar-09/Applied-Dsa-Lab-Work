class Person {
    String name;
    void greet() { System.out.println("Hello, " + name); }
}
class Teacher extends Person { }
public class Task_03_Use_inherited_greet_in_Teacher {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.name = "Kiran";
        t.greet();
    }
}
