public class App {
    public static void main(String[] args) throws Exception {
        controller.ReprodutorMusical.tocarMusica();
        controller.ReprodutorMusical.pausarMusica();
        controller.ReprodutorMusical.selecionarMusica();
        controller.AparelhoTelefonico.ligarChamada();
        controller.AparelhoTelefonico.atenderChamada();
        controller.AparelhoTelefonico.iniciarCorreioVoz();
        controller.NavegadorInternet.exibirPagina();
        controller.NavegadorInternet.adicionarNovaAba();
        controller.NavegadorInternet.atualizarPagina();
    }
}
