public class Recursy {

    /** rekursiv fibonacci
     *
     */
    public static int fib(int n) {
        if (n <= 1) return n;// base case
        return fib(n-1) + fib(n-2);
    }

    /** rekursiv fibonacci
     * med MEMOISERING (Memoization)!
     */
    private static int[] fibCache = new int[100];
    public static int fib2(int n) {
        if (n <= 1)
            return n;// base case
        if (fibCache[n] != 0)
            return fibCache[n]; // returnera cachat resultat utan rekursiv uträkning!
        int fibResult = fib2(n-1) + fib2(n-2);
        fibCache[n] = fibResult; // spara resultatet för kommande bruk
        return fibResult;
    }

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
