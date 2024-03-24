class Task {

    // fields
    String name;
    String resumo;
    int prazo;

    // Constructor com parametros - constructors tem o mesmo nome da classe
    Task(String task_name, String task_resumo, int task_prazo) {
        this.name = task_name;
        this.resumo = task_resumo;
        this.prazo = task_prazo;
    }

    // the main method
    public static void main(String[]args) {

        // criando objetos e definindo valores
        Task primeira = new Task("story 01", "layout", 30);
        Task segunda = new Task("story 02", "estilizaçao", 15);


        // demonstração
        System.out.println(primeira.name);
        System.out.println(segunda.resumo);

        // alterando um parâmetro de um objeto
        primeira.prazo = 20;

        // confirmando alteração
        System.out.println(primeira.prazo);
    }
}
