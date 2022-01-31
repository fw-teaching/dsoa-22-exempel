public class BigO {

    public BigO() {

        int dataSize = 10000;
        System.out.println("data.length: " + dataSize);

        int i;
        for (i = 0; i < dataSize; i++) {
            int a = i;
        }
        System.out.println(i + " operationer, O(n)");

        long ops = 0;

        for (i = 0; i < dataSize; i++) {
            for (int j = 0; j < dataSize; j++) {
                ops++;
            }
        }
        System.out.println(ops + " operationer, O(n²)");


        long dataPoints = dataSize;
        ops = 0;
        while (dataPoints > 0) {
            dataPoints /= 2;
            ops++;
        }
        System.out.println(ops + " operationer, O(log n)");



    }
}
