package Lab.E_SayHelloExtended;

public interface Person {
    String getName();

    default String sayHello() {
        return "Hello";
    }
}
