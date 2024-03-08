public class CountingSort {
    public static void main(String[] args) {
  
        int[] lista = {1, 1, 2, 0, 3, 1, 0, 3, 2, 2, 3, 1, 1, 0, 1, 0};
        int l = lista.length;
        int[] count = {0, 0, 0, 0}; // o tamanho dela precisa ser a quantidade de valores únicos em "lista"
  
        // contador de números: retorna uma nova array mostrando quantas vezes um número aparece na array inicial
        for (int i = 0; i < l; i++) {
            switch (lista[i]) {
            case 0:
                count[0] += 1;
                break;
            case 1:
                count[1] += 1;
                break;
            case 2:
                count[2] += 1;
                break;
            case 3:
                count[3] += 1;
                break;
            default:
                break;
            }
        }
  
        //printa a lista count, que contem qts vezes cada número (representado pelo index de "count") apareceu em "lista"
        System.out.print("Lista 'count': ");
        for (int j = 0; j < count.length; j++) {
            System.out.print(count[j]);
        }
        System.out.println();
  
        // adiciona os números contidos em "lista" em ordem crescente
        int a = 0;
        for (int k = 0; k < count.length; k++) {
            for (int h = 0; h < count[k]; h++) {
                lista[a] = k;
                a++;
            }
        }
  
        // printa a nova "lista", com seus números em ordem crescente
        System.out.print("Nova lista 'lista': ");
        for (int x = 0; x < l; x++) {
            System.out.print(lista[x]);
        }
        System.out.println();
  
    }
}