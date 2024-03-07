import java.util.Scanner;

public class Fibonacci {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Quantos números de Fibonacci? ");

        int x = input.nextInt();
        System.out.println("Retornando uma sequência Fibonacci com " + x + " elementos!");

        input.close();

        int[] fibo = new int[x];
        fibo[0] = 0;
        fibo[1] = 1;

        for (int i = 2; i < x; i++) {
            fibo[i] = fibo[i-1] + fibo[i-2];
        }

        for (int j = 0; j < x; j++) {
            System.out.print(fibo[j]);
            if (j != x-1) {
                System.out.print(", ");
            }
            else {
                System.out.println(".");
            }
        }
    }
}