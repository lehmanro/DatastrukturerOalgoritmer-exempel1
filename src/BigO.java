public class BigO {

    public BigO() {

    //int[] data = {1,3,36,3,4,5};

    int[] data = new int[1000]; // Array med 100 värden


        /**
         * O(n)
         */

    System.out.printf("(0(n): %d datapunkter: ", data.length);

    int ops = 0;
        for (int i = 0; i < data.length; i++) {

            ops++;

        }
        System.out.println(ops + "operationer");


        /**
         * O(n^2)
         */

        System.out.printf("(0(n^2): %d datapunkter: ", data.length);
        ops = 0;

        for (int i = 0; i < data.length; i++) {

            for (int j = 0; j < data.length; j++) {
                ops++;

            }

        }
        System.out.println(ops + "operationer");

        /**
         * O(log n)
         */

        System.out.printf("O(log n): %d datapunkter: ", data.length);

        ops = 0;
        int len = data.length;

        while (len > 0) {

            len = len / 2;
            ops++;

        }
        System.out.println(ops + "operationer");


    }}
