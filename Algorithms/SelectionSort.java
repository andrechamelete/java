public class SelectionSort {
    public static void main(String[] args) {
        int[] lista = {34, 12, 35, 93, 83, 67, 10, 8, 38, 2, 48, 30, 49, 29};


        for (int i = 0; i < lista.length; i++) {

            for (int j = i+1; j < lista.length; j++) {
                if (lista[i] > lista[j]) {
                    int min = lista[i];
                    lista[i] = lista[j];
                    lista[j] = min;
                }
            }
            for (int x = 0; x < lista.length; x++) {
                System.out.print(lista[x] + ", ");
            }
            System.out.println();

        }

        for (int x = 0; x < lista.length; x++) {
            System.out.print(lista[x] + ", ");
        }
        System.out.println();

    }
}