public class Main {
    public static void main(String[]args) {
        Paciente p1 = new Paciente(70, 1.78);

        p1.calcularIMC();
        System.out.println(p1.calcularIMC());

        p1.diagnostico();
    }
}