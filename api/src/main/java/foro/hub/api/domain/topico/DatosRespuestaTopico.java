package foro.hub.api.domain.topico;


import java.time.LocalDateTime;

public record DatosRespuestaTopico(
        Long id,
        String titulo,
        String mensaje,
        LocalDateTime fecha,
        EstadoDelTopico estado,
        String autor,
        String curso
) {
}
