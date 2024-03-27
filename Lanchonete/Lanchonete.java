package Lanchonete;

import java.util.Scanner;

public class Lanchonete {

    Lanchonete () {}

    public static void atender() {
        int opcao;
        Scanner scanner = new Scanner(System.in);

        System.out.println("===========> Seja Bem Vindo <===========");
        System.out.println();

        do {    
            System.out.println("============> Menu Inicial <============");
            System.out.println("1. Cadastrar");
            System.out.println("2. Logar");
            System.out.println("3. Cardápio");
            System.out.println("4. Pedir");
            System.out.println("5. Sair");
            System.out.println("========================================");
            System.out.print("Escolha uma opção: ");
            

            opcao = scanner.nextInt();
            System.out.println();

            switch (opcao) {
                case 1:
                    Cliente.registrar();
                    break;
                
                case 2:
                    Cliente.login();
                    break;

                case 3:
                    Produto.getCardapio();                                
                    break;


                case 4:                    
                    System.out.print("Qual é seu pedido? ");
                    int opt = scanner.nextInt();
                    Pedido pedindo = new Pedido(opt);
                    System.out.println();
                    System.out.println("==========> Pedido Realizado <==========");
                    System.out.println(pedindo);
                    System.out.println("========================================");
                    System.out.println();
                    break;
                
                case 5:
                    System.out.println("************ Volte Sempre! *************");
                    break;
            }
        }
        while (opcao != 5);
        System.out.println("E obrigado por utilizar nossos serviços!");
        System.out.println();

        scanner.close();

    }  
}

