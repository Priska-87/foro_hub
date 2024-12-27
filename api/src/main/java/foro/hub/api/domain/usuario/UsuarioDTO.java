package foro.hub.api.domain.usuario;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record UsuarioDTO(


        @NotBlank(message = "Ingrese su username; ej: juana.perez")
        String login,

        @NotBlank(message = "La clave no puede estar vacía")
        @Size(max = 15, message = "La clave no debe superar 15 caracteres")
        String clave

) {


}