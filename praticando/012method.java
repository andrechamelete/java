class Main {

    /* declarar um method com duas variaveis. se usar o type diferente de void, e necessario usar tbm o return. Se nao quiser que return, usar type void */
    static int add(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void main(String[]args) {

        /* chamando o method criado */
        int result = add(4, 9);
        System.out.println(result);


        /* usar method sqrt() - retorna a raiz da variavel*/
        double s = Math.sqrt(4);
        System.out.println(s);


        /* usar method pow() - retorna potencia */
        double p = Math.pow(5, 2);
        System.out.println(p);
    }
}
