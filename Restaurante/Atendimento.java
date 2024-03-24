// classe representa o pagamento do pedido
import java.util.Scanner;

public class Atendimento {

    public Atendimento() {}

    static void Atender() {      

        System.out.println("Olá, bem vindo ao Restaurante! \nAqui está nosso cardápio. Posso anotar seu pedido?");
        System.out.println("1 - X-Burger");
        System.out.println("2 - X-Bacon");
        System.out.println("3 - X-Salada");
        
        Pedir();        
    }

    static void Pedir() {
        System.out.print("O que você deseja? (digite o número): ");
        Scanner opt = new Scanner(System.in);
        int input = opt.nextInt();

        switch (input) {
            case 1:
                System.out.println("Pedido: 1 X-Burger!");
                break;
            case 2:
                System.out.println("Pedido: 1 X-Bacon!");
                break;
            case 3:
                System.out.println("Pedido: 1 X-Salada!");
                break;
            default:
                System.out.println("Não é um pedido válido");
                Pedir();
                 
        }
        opt.close();    
    }
}
