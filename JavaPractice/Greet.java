@FunctionalInterface
interface G {
    void sayHello(String name);
}
public class Greet {
    public static void main(String[] args) {
        G g = (name) -> System.out.println("Hello, " + name + "!");
        g.sayHello("Alice");
        g.sayHello("Bob");
    }
}