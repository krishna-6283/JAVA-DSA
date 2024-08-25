class A {
    public void show() {
        System.out.println("A");
    }
}

class B extends A {
    public void show() {
        System.out.println("B");
    }
}

public class oop {
    public static void main(String[] args) {
        A a = new B();
        a.show();
    }
}
