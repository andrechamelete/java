import java.util.Scanner;

class Mmdc {
    public static void main(String[]args) {

        // receber input de dois números:
        Scanner pr = new Scanner(System.in);
        System.out.print("Primeiro número: ");

        int n1 = pr.nextInt();
        pr.close();

        Scanner sg = new Scanner(System.in);
        System.out.print("Segundo número: ");

        int n2 = sg.nextInt();
        sg.close();


        //classificar entradas e criar variáveis para o cálculo
        int menor = (n1 < n2) ? n1 : n2;
        int mdc = 1;
        int mmc = 1;

        // for + if e fórmula mmc><mdc
        for (int i = 1; i < menor; i++) {
            if (n1 % i == 0 && n2 % i == 0) mdc = i;
        }

        System.out.println("Máximo Divisor Comum de " + n1 + " e " + n2 + " = " + mdc);
        mmc = n1 * n2 / mdc;
        System.out.println("Mínimo Múltiplo Comum de " + n1 + " e " + n2 + " = " + mmc);
    }
}