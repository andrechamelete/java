public class BinarySearch {

    static int search(int[] list, int x) {
        int left = 0;
        int right = list.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (list[mid] == x) {
                return mid;

            }
            else if (list[mid] < x) {
                left = mid +1;
            }
            else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[]args) {
        int[] lista = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int alvo = 8;

        int value = BinarySearch.search(lista, alvo);

        if (value != -1) {
            System.out.println("Seu número é o " + (value + 1) + "º da lista");
        }
        else {
            System.out.println("NOT FOUND");
        }
    }
}