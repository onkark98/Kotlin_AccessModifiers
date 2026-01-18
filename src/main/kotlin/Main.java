public class Main {
    public static void main(String[] args) {
        User user = new User();
        user.greet();
        Dog dog = new Dog();
        dog.action();
        dog.breathe(); // It is allowed here (package level access)
    }
}
