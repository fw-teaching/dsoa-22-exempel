public class Queuey {

    /** Kö-implemetation med länkad lista
     * 
     */

    Node rear, front; 
    
    private class Node {
        String data; // värde i string-form
        Node next;
        
        Node(String data) {
            this.data = data;
        }
    }
    
    public void enqueue(String data) {
        Node n = new Node(data);
        
        if (front == null) { // tom från tidigare
            rear = n;
            front = n;
        } else {
            rear.next = n; // tidigare sista blir nästsist
            rear = n; // nya blir sist
        }
        printQueue();
    }

    public String dequeue() {
        String ret;
        ret = front.data;
        front = front.next;
        printQueue();
        return ret;
    }

    public void printQueue() {
        System.out.print("Queuey: | ");
        Node n = front;
        while (n != null) {
            System.out.print(n.data + " | ");
            n = n.next;
        }
        System.out.println("");
    }
    
}
