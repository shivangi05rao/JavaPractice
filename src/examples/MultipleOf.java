package examples;

public class MultipleOf {
    public static void main(String[] args) {
        //Multiple of 5 & 7 using while loop
        int num = 1;
        while (true){
            if (num%5==0 && num%7==0) {
                System.out.println("Found ans: " + num);
                break;
            }
            num++;
        }
        //Using for loop
        for (int i=1; ;i++){
            if (num%5==0 && num%7==0) {
                System.out.println("Found ans: " + num);
                break;
            }
        }
        //print 1 to 50 except multiples of 3 using for loop
        for (int i=0; i<=50; i++){
            if (i%3 == 0){
                continue;
            }
            System.out.println(i);
        }
        //using while loop
        int n = 1;
        while (n<=50){
            if (n%3 == 0){
                n++;
                continue;
            }
            System.out.println(n);
            n++;
        }
//        for (int i=1; i<5 ; i++){
//            System.out.print(i + ",");
//        }
    }
}
