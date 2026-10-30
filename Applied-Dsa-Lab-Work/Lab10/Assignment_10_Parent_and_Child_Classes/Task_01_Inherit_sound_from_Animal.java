class Animal {
    void sound() { System.out.println("Some sound"); }
}
class Dog extends Animal { }
public class Task_01_Inherit_sound_from_Animal {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
    }
}
