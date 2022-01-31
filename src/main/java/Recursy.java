public class Recursy {

    /** Rekursiv funktion
     *  loopar neråt från count.
     */
    public static void hello(int count) {
        if (count <= 0) return; // Base Case
        System.out.println("Hello " + count);

        hello(count - 1); // Minska count med 1 och anropa sig själv
    }

    /* Bonusläxa: skriv en rekursiv metod som multiplicerar
    * två tal med endast addition
    *
    * multiply(5, 4) ==> 20
    *
    * */
    public static int multiply(int m, int n) {
        // ??
        return 0;
    }

}
