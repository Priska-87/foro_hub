package foro.hub.api.infra.errores;

public class ValidacionException extends RuntimeException {

    public ValidacionException(String mensaje)  {
        super(mensaje);

    }
}
