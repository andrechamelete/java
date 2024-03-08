import java.util.LinkedList;

public class SelectionSortB {
    public static void main(String[] args) {
        LinkedList<Integer> lista = new LinkedList<>();
        //{34, 12, 35, 93, 83, 67, 10, 8, 38, 2, 48, 30, 49, 29};

        lista.add(34);
        lista.add(12);
        lista.add(35);
        lista.add(93);
        lista.add(83);
        lista.add(67);
        lista.add(10);
        lista.add(18);
        lista.add(38);

        for (int i = 0; i < lista.size(); i++) {


            for (int j = i+1; j < lista.size(); j++) {
                if (lista.get(i) > lista.get(j)) {
                    Integer x = lista.remove(j);
                    lista.add(i, x);
                    System.out.println(lista);
                }
            }
        }

        System.out.println("Lista final: " + lista);
    }
}