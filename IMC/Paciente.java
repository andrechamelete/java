public class Paciente {

    public double peso;
    public double altura;

    public Paciente(double peso, double altura){
        this.peso = peso;
        this.altura = altura;
    }

    public double calcularIMC() {
        double imc = 0;
        imc = peso / (altura * altura);
        return imc;
    }

    public void diagnostico() {
        if (calcularIMC() < 16)
            System.out.println("Baixo peso muito grave");
        else if (calcularIMC() < 17)
            System.out.println("Baixo peso grave");
        else if (calcularIMC() < 18.5)
            System.out.println("Baixo peso");
        else if (calcularIMC() < 25.0)
            System.out.println("Peso normal");
        else if (calcularIMC() < 30.0)
            System.out.println("Sobrepeso");
        else if (calcularIMC() < 35.0)
            System.out.println("Obesidade grau 1");
        else if (calcularIMC() < 40.0)
            System.out.println("Obesidade grau 2");
        else
            System.out.println("Obesidade grau 3: obesidade mórbida");
    }
}