package java8.javabrains;

public class WritingLambdaExpression {
    public static void main(String[] args) {
        MyLambda myLambda = () -> System.out.println("Hello World!");
        AddLambda addLambda = ( a,  b) -> a + b;
    }
}

interface MyLambda {
    void foo();
}

interface AddLambda {
    int add(int a, int b);
}
