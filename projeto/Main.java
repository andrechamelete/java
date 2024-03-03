public class Main {
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

        System.out.println("Nome: " + primeira.nome);
        System.out.println("Resumo: " + primeira.resumo);
        System.out.println("Atualmente na etapa: " + primeira.etapa);
    }
}
