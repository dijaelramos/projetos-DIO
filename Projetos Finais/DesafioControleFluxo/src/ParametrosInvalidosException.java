public class ParametrosInvalidosException extends Exception  {
    public ParametrosInvalidosException() {
        super("O primeiro parâmetro deve ser menor que o segundo.");
    }
}
