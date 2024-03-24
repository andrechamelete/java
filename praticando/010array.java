/* criar array:
dataType[] arrayName; ;// exemplo:
int[] data;

arrayName = new dataType[n]; // exemplo:
int[] data = new int[4];


inicializar array:
int[] data = {12, 9, 4};

acessar elemento da array:
data[0] - primeiro elemento
data[2] - terceiro elemento
*/

class Main {
    public static void main(String[]args) {
        int[] data = {12, 9, 2, 8};

        data[2] *= 10;

        int size = data.length;

        int product = 1;

        for (int i = 0; i < 4; i++) {
            product = product * data[i];
        }
        System.out.println("produto: " + product);

        System.out.println("tamanho: " + size);

        /*uma array de strings - apenas como exeplo, nao esta fazendo nada nesse codigo*/
        String[] languages = {"Java", "Python", "C"};
    }
}