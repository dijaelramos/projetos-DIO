package TryCatch;

public class FormatadorCepExemplo {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("2376506");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            System.out.println("O CEP informado esta incorreto!");
        }
    }
    static String formatarCep(String cep) throws CepInvalidoException {
        if (cep.length() !=8) 
            throw new CepInvalidoException();
            //simulando um CEP formatado
            return "23.765-064";   
    }
}
