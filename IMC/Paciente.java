public class Paciente {

    //campos de estado do paciente
    public double peso;
    public double altura;
    public double imc;

    //contructor
    public Paciente(double peso, double altura){
        this.peso = peso;
        this.altura = altura;
    }

    //método para retornar IMC do paciente
    public double calcularIMC(Paciente p) {
        p.imc = p.peso / (p.altura * p.altura);
        return p.imc;
    }

    //método para retornar o diagnoóstico em relação ao IMC do paciente
    public void diagnostico(Paciente p) {
        if (p.imc < 16)
            System.out.println("Baixo peso muito grave");
        else if (p.imc < 17)
            System.out.println("Baixo peso grave");
        else if (p.imc < 18.5)
            System.out.println("Baixo peso");
        else if (p.imc < 25.0)
            System.out.println("Peso normal");
        else if (p.imc < 30.0)
            System.out.println("Sobrepeso");
        else if (p.imc < 35.0)
            System.out.println("Obesidade grau 1");
        else if (p.imc < 40.0)
            System.out.println("Obesidade grau 2");
        else
            System.out.println("Obesidade grau 3: obesidade mórbida");
    }
}