package List.Ordenacao.Exercicio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    private List<Integer> numerosList;

    public OrdenacaoNumeros() {
        this.numerosList = new ArrayList<>();
    }
    public void adicionarNumero(int numero) {
        numerosList.add(numero);
    }
    public List<Integer> ordenarAscendente() {
        List<Integer> numerosAscendente = new ArrayList<>(this.numerosList);
        if (!numerosList.isEmpty()){
            Collections.sort(numerosAscendente);
        } return numerosAscendente;
    }

}
