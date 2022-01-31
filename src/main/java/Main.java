public class Main {

    public static void main(String[] args) {
        String[] initialArray = { "Fili", "Kili", "Balin", "Dwalin", "Ori", "Nori", "Dori", "Gloin", "Oin", "Bifur", "Bofur", "Bombur", "Thorin" };


        Linky linky = new Linky();
        linky.add(new Player("Gimli"));

        for (int i = 0; i < 5; i++) {
            linky.add(new Player(initialArray[i]));
        }


        System.out.println("-------------------------------");


        StringArray myArray = new StringArray(initialArray);
        System.out.println(myArray.toString());

        myArray.add("Gimli");
        System.out.println(myArray.toString());

        myArray.add(0, "Bilbo");
        System.out.println(myArray.toString());

        // new BigO();

    }


}
