package estrutura_de_repeticao;

public class r_for {
    public static void main(String[] args) {
        for (int carneirinhos = 1; carneirinhos <= 20; carneirinhos ++ ) {
            if (carneirinhos > 10 && carneirinhos <=15)
                continue; // contador não conta, ele pula para o proximo
                
            System.out.println("Contando carneirinhos " + carneirinhos);
        }
    }
}
