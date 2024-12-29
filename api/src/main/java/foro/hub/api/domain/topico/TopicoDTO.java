package foro.hub.api.domain.topico;

import foro.hub.api.domain.usuario.Usuario;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.time.LocalDateTime;

//DTO (DATA TRANSFER OBJECT - TRANSFIERE LO QUE ESTA VINIENDO DEL API - EXPONE SOLO LOS DATOS QUE TU QUIERES

public record TopicoDTO(

        @NotNull(message = "Ya existe un tópico con ese título")
        String titulo,

        @NotNull
        String mensaje,

        @NotNull
        LocalDateTime fecha,

        @NotNull
        EstadoDelTopico estado,

//        @NotNull
//        String autor,

        @NotBlank
        String curso

) {
}
