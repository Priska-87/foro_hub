package foro.hub.api.domain.topico;

import foro.hub.api.domain.usuario.Usuario;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public record DatosActualizarTopico(
        @NotNull
        Long id,

        String titulo,

        String mensaje,

        LocalDateTime fecha,

        EstadoDelTopico estado,

        String autor,

        Usuario id_usuario,

        String curso
) {

}
