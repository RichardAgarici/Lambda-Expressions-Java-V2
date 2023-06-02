interface MyLambda {
    void display();
}

class UseLambda {
    public void callLambda(MyLambda m1) {
        m1.display();
    }
}


class Demo {
    public static void method1() {
        UseLambda ul = new UseLambda();
        ul.callLambda(()-> System.out.println("Hello"));
    }
}

public class LambdaDemo {
    public static void main(String[] args) {
        Demo.method1();
    }
}


