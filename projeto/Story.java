import java.util.LinkedList;

public class Story {

    // Fields (estados)

    public String nome;
    public String resumo;
    public String etapa;

    //    LocalDateTime criado;
    //métodos (comportamentos)
//    void move() {
//        etapa = etapa + 1;
//    }

    public static void main(String[]args) {

        Fluxo fluxo1 = new Fluxo();
        fluxo1.nomeFluxo = "Fluxo 01";
        fluxo1.etapas.add("Backlog");
        fluxo1.etapas.add("To Do");
        fluxo1.etapas.add("Doing");
        fluxo1.etapas.add("Done");

        Story primeira = new Story();
        primeira.nome = "Primeira";
        primeira.resumo = "Primeira historia de usuario";
        primeira.etapa = fluxo1.etapas.get(2);

        System.out.println(primeira.etapa);
    }
}