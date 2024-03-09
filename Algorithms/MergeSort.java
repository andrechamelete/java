import java.util.ArrayList;

public class MergeSort {

    static ArrayList<Integer> sort(ArrayList<Integer> array) {
        if (array.size() <= 1) {
            return array;
        }
        else {
            int mid = array.size() / 2;
            ArrayList<Integer> left = new ArrayList<>(array.subList(0, mid));
            ArrayList<Integer> right = new ArrayList<>(array.subList(mid, array.size()));

            ArrayList<Integer> sortedLeft = sort(left);
            ArrayList<Integer> sortedRight = sort(right);
            return MergeSort.merge(sortedLeft, sortedRight);
        }

    }

    static ArrayList<Integer> merge(ArrayList<Integer> left, ArrayList<Integer> right) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        int i = 0;
        int j = 0;
        while (i < left.size() && j < right.size()) {
            if (left.get(i) < right.get(j)) {
                result.add(left.get(i));
                i++;
            }
            else {
                result.add(right.get(j));
                j++;
            }
        }
        result.addAll(left.subList(i, left.size()));
        result.addAll(right.subList(j, right.size()));

        return result;
    }

    public static void main(String[]args) {

        ArrayList<Integer> lista = new ArrayList<Integer>();
        lista.add(385);
        lista.add(927);
        lista.add(486);
        lista.add(104);
        lista.add(452);
        lista.add(672);
        lista.add(957);
        lista.add(935);
        lista.add(134);
        lista.add(531);
        lista.add(624);
        lista.add(295);
        lista.add(844);
        lista.add(710);
        lista.add(303);
        lista.add(404);

        lista = MergeSort.sort(lista);

        for (int a = 0; a < lista.size(); a++) {
            System.out.println(lista.get(a));
        }
    }
}