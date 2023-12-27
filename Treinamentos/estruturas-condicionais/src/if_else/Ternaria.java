package if_else;

public class Ternaria {
    public static void main(String[] args) {
        
        int nota = 7;
        
        String resultado = nota >=7 ? "APROVADO" : nota >=5 && nota <7 ? "RECUPERAÇÃO" : "REPROVADO";

        System.out.println(resultado);
    }
}
