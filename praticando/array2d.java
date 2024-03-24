class Main {
    public static void main(String[]args) {
        int[][] data = {
            {2, 3, 4},
            {6, 7, 8, 9},
            {11, 13, 15, 18}
        };

        for (int [] inner: data) {
            for (int value: inner) {
                System.out.println(value);
            }
        }
    }
}


