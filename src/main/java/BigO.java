public class BigO {

    /** Exempel på O(n), O(n²) och O(log n)
     *
     */
    public BigO() {

        // Vi tänker oss en datamängd av en viss storlek
        int dataSize = 10000;
        System.out.println("data.length: " + dataSize);

        // Om vi loopar rakt av uppnår vi O(n), 1 operation per datapunkt
        int i;
        for (i = 0; i < dataSize; i++) {
            int a = i;
        }
        System.out.println(i + " operationer, O(n)");

        // Om vi loopar hela mängden på nytt för varje iterering uppnår vi O(n²)
        // Detta är i det flesta fall ingenting att eftersträva!
        long ops = 0;
        for (i = 0; i < dataSize; i++) {
            for (int j = 0; j < dataSize; j++) {
                ops++;
            }
        }
        System.out.println(ops + " operationer, O(n²)");

        // 
        long dataPoints = dataSize;
        ops = 0;
        while (dataPoints > 0) {
            dataPoints /= 2;
            ops++;
        }
        System.out.println(ops + " operationer, O(log n)");



    }
}
