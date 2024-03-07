//retorna divisores do int inputado ou
//se este é primo

import java.util.Scanner;

class Prime {
    public static void main(String[]args) {

        //pede input int
        Scanner sc = new Scanner(System.in);
        System.out.print("qual número? ");

        int x = sc.nextInt();
        sc.close();

        boolean flag = false;

        //itera para encontrar divisores de x
        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                flag = true;
                System.out.println(x + " é divisível por " + i);
            }
            else {
                continue;}}

        //retorna aviso caso seja primo
        if (!flag) {
            System.out.println(x + " é primo");}
    }
}