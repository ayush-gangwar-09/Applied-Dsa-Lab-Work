class Counter {
    int count;
    Counter() { count = 0; }
    void increment() { count++; }
}
public class Task_03_Increment_a_Counter_three_times {
    public static void main(String[] args) {
        Counter c = new Counter();
        c.increment(); c.increment(); c.increment();
        System.out.println("Count: " + c.count);
    }
}
