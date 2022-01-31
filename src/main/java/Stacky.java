import java.sql.SQLOutput;

public class Stacky {

    int topOfStack = -1;
    int stackSize;
    String[] data;

    public Stacky(int stackSize) {
        this.stackSize = stackSize;
        data = new String[stackSize];
    }

    public void push(String value) {
        if (topOfStack + 1 >= stackSize) {
            System.err.println("StackOverflow Error!");
        } else {
            topOfStack++;
            data[topOfStack] = value;
        }
        printStack();
    }

    public String pop() {
        String ret = data[topOfStack];
        topOfStack--; // Vi flyttar pointern ett steg neråt
        printStack();
        return ret;
    }

    // peek bara returnerar vårt översta värde
    public String peek() {
        return data[topOfStack];
    }

    public void printStack() {
        System.out.print("| ");
        for (int i = 0; i <= topOfStack; i++) {
            System.out.print(data[i] + " |");
        }
        System.out.println("");
    }
}



