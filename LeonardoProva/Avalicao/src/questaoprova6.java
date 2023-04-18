public class questaoprova6 {

    public static void main(String[] args) {
        // Exemplo de uso da função inverteString
        String strOriginal = "exemplo";
        String strInvertida = inverteString(strOriginal);
        System.out.println("A string original é: " + strOriginal);
        System.out.println("A string invertida é: " + strInvertida);
    }

    public static String inverteString(String str) {
        // Cria um objeto StringBuilder contendo a string original
        StringBuilder sb = new StringBuilder(str);

        // Inverte o objeto StringBuilder
        sb.reverse();

        // Retorna a string invertida como uma String
        return sb.toString();
    }
}

