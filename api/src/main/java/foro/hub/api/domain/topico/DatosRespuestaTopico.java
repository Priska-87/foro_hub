package foro.hub.api.domain.topico;

import foro.hub.api.domain.usuario.Usuario;

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
