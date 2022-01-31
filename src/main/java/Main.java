public class Main {

    public static void main(String[] args) {
        String[] initialArray = { "Fili", "Kili", "Balin", "Dwalin", "Ori", "Nori", "Dori", "Gloin", "Oin", "Bifur", "Bofur", "Bombur", "Thorin" };

        System.out.println("-------- Stack -------------");
        Stacky stacky = new Stacky(8);
        stacky.push("Fili");
        stacky.push("Kili");
        stacky.push("Balin");

        stacky.pop();
        stacky.push("Gimli");

        System.exit(0);

        System.out.println("-------- Linked List -------------");

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
