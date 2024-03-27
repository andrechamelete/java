package Comercio;

import java.util.Scanner;

public class Lanchonete {

    Lanchonete () {}

    public static void atender() {
        int opcao;
        Scanner scanner = new Scanner(System.in);

        System.out.println("============ Seja Bem Vindo ============");
        System.out.println();

        do {    
            System.out.println("============= Menu Inicial =============");
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
                    System.out.println("=============== Cardápio ===============");
                    for (int i = 0; i < Produto.cardapio.size(); i++) {
                        
                        System.out.println(Produto.cardapio.get(i));                        
                    }                                      
                    break;


                case 4:

                
                case 5:
                    System.out.println("****************************************");
                    break;
            }
        }
        while (opcao != 5);
        System.out.println("Obrigado por utilizar nossos serviços!");

        scanner.close();

    }  
}

