package java8.lambdaExpression;

interface Addable {
    int addition(int a, int b);
}

class AddableImpl implements Addable {

    @Override
    public int addition(int a, int b) {
        return (a + b);
    }
}

public class LambdaParameters {
    public static void main(String[] args) {
        Addable add = (a, b) -> (a + b);
        int res = add.addition(10, 3);
        System.out.println(res);

        //multiple steps:
        Addable adding = (a, b) -> {
            int c = a + b;
            return c;
        };
        int sum = adding.addition(4, 6);
        System.out.println(sum);
    }


}
