class Student {
    int roll;
    String name;
    void show() {
        System.out.println("Roll: " + roll);
        System.out.println("Name: " + name);
    }
}
public class Task_01_Create_and_display_one_Student {
    public static void main(String[] args) {
        Student s = new Student();
        s.roll = 5;
        s.name = "Rohan";
        s.show();
    }
}
