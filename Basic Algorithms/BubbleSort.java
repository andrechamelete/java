public class BubbleSort {
    public static void main(String[] args) {
        int[] lista = {34, 12, 35, 93, 83, 67, 10, 8, 38, 2, 48, 30, 49, 29};
        boolean swap;

        for (int x = 0; x < lista.length; x++) {
            System.out.print(lista[x] + ", ");
        }
        System.out.println();

        for (int z = 0; z < lista.length -1; z++) {

            swap = false;
            for (int i = 0; i < lista.length -1; i++) {
                if (lista[i] > lista[i+1]) {
                    int j= lista[i];
                    lista[i] = lista[i+1];
                    lista[i+1] = j;
                    swap = true;
                }
            }
            if (!swap)
                {break;
            }
        }

        for (int x = 0; x < lista.length; x++) {
            System.out.print(lista[x] + ", ");
        }
        System.out.println();
    }
}
