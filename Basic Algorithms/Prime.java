import java.util.Scanner;

class Prime {
    public static void main(String[]args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Números primos até: ");

        int z = sc.nextInt();
        sc.close();


        int x = 1; // inicial
//        int z = 20; //  final

        for (x = x; x < z; x++) {
            boolean flag = false;
            // avaliar se x é primo.
            for (int i = 2; i < x; i++) {
                if (x % i == 0) {
                    flag = true;
                    break;}
                else {
                    continue;}}

            if (!flag) {
                System.out.print(x + ", ");}
            else {continue;}

        }
        System.out.print("\n");
    }
}