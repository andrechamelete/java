class Main {
    public static void main(String[]args) {
        double a = 42.5, b = 6.5;
        char operator = '-';

        switch (operator) {
            case '+':
                System.out.println(a + b);
                break;

            case '-':
                System.out.println(a - b);
                break;

            case '*':
                System.out.println(a * b);
                break;

            case '/':
                System.out.println(a / b);
                break;

            default:
                System.out.println("Invalid Operator");

        }
    }
}

/* 
o "break" é opcional no switch, mas sem ele as próximas opções após a executada também serão executadas.
"default" também é opcional
*/