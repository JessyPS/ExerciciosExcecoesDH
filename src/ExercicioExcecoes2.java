import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExercicioExcecoes2 {

    public static void main(String[] args) {
//      Criar um arrayList de Strings e inicializá-lo com null.

//      List<String> listaDeAnimais = Arrays.asList(null); //Passando um objeto para dentro do array que só aceita String
        ArrayList<String> listaDeAnimais = null;
        listaDeAnimais = new ArrayList<>();

//      Modificar a inicialização do arrayList anterior e inicializá-lo com uma lista vazia.

//      Agora, imprimir o conteúdo da posição 5.
        try {
            System.out.println("Animal da posição 5: " + listaDeAnimais.get(5));

//      Imprimir o conteúdo da posição 2.
//        try {
//            System.out.println("Animal da posição 2: " + listaDeAnimais.get(2));

//      Adicionar os seguintes valores: “Pato”, “Cachorro”, “Gato”.
            listaDeAnimais.add("Pato");
            listaDeAnimais.add("Cachorro");
            listaDeAnimais.add("Gato");

        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.toString());

        } catch (NullPointerException e){
            System.out.println("NullPointerException: " + e.getMessage());
        }

//      Ao imprimir o que acontece ?
//      Exceção: NullPointerException
    }
}
