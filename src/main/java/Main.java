import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        System.out.println("--------  Rekursion -------------");
        Recursy.hello(5);



        System.out.println("--------  Graf -------------");

        Graphy graphy = new Graphy();
        graphy.createNode("shi", "Skjorta");
        graphy.createNode("tie", "Slips");
        graphy.createNode("jea", "Jeans");
        graphy.createNode("cro", "Crocs");

        graphy.printGraph();

        graphy.addEdge("shi", "tie");
        graphy.addEdge("shi", "jea");
        graphy.addEdge("tie", "shi");
        graphy.addEdge("tie", "jea");
        graphy.addEdge("jea", "shi");
        graphy.addEdge("jea", "tie");
        graphy.addEdge("jea", "cro");
        graphy.addEdge("cro", "jea");

        graphy.printGraph();

        System.exit(0);

        System.out.println("-------- Kö (länkad lista)-------------");

        String[] initialArray = { "Fili", "Kili", "Balin", "Dwalin", "Ori", "Nori", "Dori", "Gloin", "Oin", "Bifur", "Bofur", "Bombur", "Thorin" };

        Queuey q = new Queuey();
        for (int i = 0; i < 5; i++) {
            q.enqueue(initialArray[i]);
        }
        q.dequeue();
        q.dequeue();
        q.dequeue();

        System.out.println("-------- Stack -------------");
        Stacky stacky = new Stacky(8);
        stacky.push("Fili");
        stacky.push("Kili");
        stacky.push("Balin");

        stacky.pop(); // vi tar bort det översta elementet
        stacky.push("Gimli");



        System.out.println("-------- Cikulär array -------------");
        String[] circular = new String[4];
        circular[0 % 4] = "A";
        circular[1 % 4] = "B";
        circular[2 % 4] = "C";
        circular[3 % 4] = "D";
        System.out.println(Arrays.toString(circular));
        circular[4 % 4] = "E";  // 4 % 4 =0
        circular[5 % 4] = "F";
        System.out.println(Arrays.toString(circular));





        System.out.println("-------- Länkad lista -------------");

        Linky linky = new Linky();
        linky.add(new Player("Gimli"));

        for (int i = 0; i < 5; i++) {
            linky.add(new Player(initialArray[i]));
        }


        System.out.println("-------- Array -------------");


        StringArray myArray = new StringArray(initialArray);
        System.out.println(myArray.toString());

        myArray.add("Gimli");
        System.out.println(myArray.toString());

        myArray.add(0, "Bilbo");
        System.out.println(myArray.toString());

        // new BigO();

    }


}
