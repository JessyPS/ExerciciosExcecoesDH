import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExercicioExcecoes1 {
    public static void main(String[] args) {
        //Criar uma ArrayList vazia
        List<String> listaDeAnimais = new ArrayList<>();

        //Exemplo, inicializando com valores
//        List<String> listaDeAnimais = Arrays.asList("Pato","Cachorro","Gato"));

        //Adicionar os seguintes valores: “Pato”, “Cachorro”, “Gato”.
        listaDeAnimais.add("Pato");
        listaDeAnimais.add("Cachorro");
        listaDeAnimais.add("Gato");

        //Imprimir o conteúdo da posição 3.
        try {
            System.out.println("Animal da posição 3: " + listaDeAnimais.get(3));

            //Ao executar o programa, o que acontece?
            //Exception: IndexOutOfBoundsException

        } catch (IndexOutOfBoundsException e) {
//          System.out.println("Atenção!!! Esta posição não existe na lista. ");
            System.out.println("IndexOutOfBoundsException: " + e.getMessage());  // OU OU OU
//            System.out.println(e.toString());

/*            MANEIRA GENÉRICA
            }catch (Exception e){
            System.out.println(e.getMessage());
       }*/

        }
    }
}