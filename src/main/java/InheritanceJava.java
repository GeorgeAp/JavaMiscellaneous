public class InheritanceJava {
    class A {
        A a = new A();
    }

    // B inherits from A
    class B extends A{
        A b = new B();
    }
}
