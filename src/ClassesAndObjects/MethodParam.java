package ClassesAndObjects;

/**
 * Created by calm on 5/11/16.
 */
public class MethodParam {
    static void sayHello(String name) {
        System.out.println("Hello " + name);
    }

    public static void main (String[] args) {
        sayHello("Igor");
        sayHello("Martyna");
        sayHello("Robin");
    }
}
