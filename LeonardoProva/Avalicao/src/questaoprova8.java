import java.util.ArrayList;
import java.util.List;

public class questaoprova8 {

    public static class Main {

        public static void main(String[] args) {
            List<String> lista = new ArrayList<>();
            lista.add("Ola");
            lista.add(", ");
            lista.add("mundo");
            lista.add("!");

            String resultado = String.join("", lista);
            System.out.println(resultado); // imprime "Ola, mundo!"
        }
    }

}
