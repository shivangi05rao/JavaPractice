package introducingclasses;
//This class defines an integer stack that can hold 10 values
class Stack{
    int[] stack = new int[10];
    int index;

    //initialize topOfStack
    Stack(){
        index = -1;
    }

    //push an item on to the stack
    void push(int item){
        if (index == 9)
            System.out.println("Stack is full.");
        else
            stack[++index] = item;
    }

    //pop an item from the stack
    int pop(){
        if (index < 0){
            System.out.println("Stack underflow");
            return 0;
        } else return stack[index--];
    }
}

public class TestStack {
    public static void main(String[] args) {
        Stack myStack1 = new Stack();
        Stack myStack2 = new Stack();

        //push some numbers onto the stack
        for (int i = 0; i < 10; i++) myStack1.push(i);
        for (int i = 10; i < 20; i++) myStack2.push(i);

        //pop those numbers off the stack
        System.out.println("Stack in myStack1: ");
        for (int i = 0; i < 10; i++){
            System.out.println(myStack1.pop());
        }

        System.out.println();
        System.out.println("Stack in myStack2: ");
        for (int i = 0; i < 10; i++){
            System.out.println(myStack2.pop());
        }
    }
}
