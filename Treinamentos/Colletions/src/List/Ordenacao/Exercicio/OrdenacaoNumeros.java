package Map.Ordenacao.Exercicio;

import java.util.ArrayList;
import java.util.List;

public class OrdenacaoNumeros {
    private List<Integer> numerosList;

    public OrdenacaoNumeros() {
        this.numerosList = new ArrayList<>();
    }
    public void adicionarNumero(int numero) {
        numerosList.add(numero);
    }
    public void ordenarAscendente() {
        List<Integer> numerosAscendente = new ArrayList<>(this.numerosList);
    }

}
