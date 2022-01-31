
public class Linky {

    private Node first;
    private Node last;

    // Inre klass!
    private static class Node {
        Player player;
        Node next;

        Node(Player player, Node next) {
            this.player = player;
            this.next = next;
        }
    }

    public void add(Player player) {
        Node n = new Node(player, null);
        if (first == null) first = n; // listan är tom
        if (last != null) last.next = n; // gamla last.next blir den nya noden
        last = n; // den nya noden blir det nya sista objektet
        System.out.println(" ----- Linky.add(), operationer: 1");
        printLinky();
    }

    public void printLinky() {
        System.out.print("Linky: | ");
        Node n = first;
        while (n != null) {
            System.out.print(n.player.getName() + " | ");
            n = n.next;
        }
        System.out.println("");
    }
}
