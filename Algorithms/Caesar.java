public class Caesar {

    public static String encrypt(String input, int key) {
        StringBuilder encrypted = new StringBuilder(input);
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        for (int i = 0; i < input.length(); i++) {
            int index = alphabet.indexOf(input.charAt(i));
            index = index * i % 26;
            char newChar = alphabet.charAt(index);
            encrypted.setCharAt(i, newChar);
        }
        return encrypted.toString();
    }

    public static void main(String[]args) {
        System.out.println(Caesar.encrypt("ABCDEFGHIJKLMNOPQRSTUVWXYZ", 1));       
    }
}

// Este programa codifica mensagens da seguinte forma:
// 1. encontra cada caractere da mensagem na String "alphabet" e retorna seu index nessa String.
// 2. este index é mutiplicado por ele mesmo e pegamos o resto da divisão por 26 (quantidade de letras no alfabeto) como novo index.
// 3. este é buscado na String "alphabet" retornando o caractere correspondente;
// 4. Este caractere é é colocado na posição i da nova string (encrypted);

// melhoria: ao invés do index multiplicar ele mesmo (step 2), ele multiplicar o index do caractere na mensagem.
// exemplo: a primeira letra (index 0) do input é C. C está no index 2 da String "alphabet". 
// Então, multiplicamos 0 * 2, e o resultado é o char na string "alphabet" que será inserido na "encrypted".
// problema: qualquer número multplicado por zero é zero, logo teremos problemas com a primeira letra do input e com A