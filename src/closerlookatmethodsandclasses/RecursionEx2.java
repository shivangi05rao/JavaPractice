package closerlookatmethodsandclasses;
class RecTest{
    int[] values;

    RecTest(int values){
        this.values = new int[values];
    }

    //display array --> recursively
    void printArray(int i){
        if (i == 0) return;
        else printArray(i-1);
        System.out.println("[" + (i-1) + "] " + values[i-1]);
    }
}
public class RecursionEx2 {
    public static void main(String[] args) {
        RecTest ob = new RecTest(10);
        for (int i=0; i<10; i++) ob.values[i] = i;
        ob.printArray(10);
    }
}
