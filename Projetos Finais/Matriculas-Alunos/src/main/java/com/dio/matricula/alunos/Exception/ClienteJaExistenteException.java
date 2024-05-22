package com.dio.matricula.alunos.Exception;

public class ClienteJaExistenteException extends RuntimeException {
    public ClienteJaExistenteException(String message) {
        super(message);
    }

    public ClienteJaExistenteException(String message, Throwable cause) {
        super(message, cause);
    }
}
