class Person {
    String name;
    Person(String name) { this.name = name; }
}
class Student extends Person {
    Student(String name) { 
        super(name); 
    }
}
public class Task_02_Call_parent_constructor_with_supername {
    public static void main(String[] args) {
        Student s = new Student("Neha");
        System.out.println("Name: " + s.name);
    }
}
