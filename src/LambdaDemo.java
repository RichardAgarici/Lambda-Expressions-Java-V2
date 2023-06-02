interface MyLambda {
    int display(String str1, String str2);
}

public class LambdaDemo {
    public LambdaDemo(String s) {
        System.out.println(s.toUpperCase());
    }

    public static void main(String[] args) {
        MyLambda ml=String::compareTo;
        var result = ml.display("hello", "well");
        System.out.println(result);
    }

}


