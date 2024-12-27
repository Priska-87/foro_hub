package foro.hub.api.domain.topico;


// CLASE TOPICO - PARA LA PERSISTENCIA DE DATOS

import foro.hub.api.domain.usuario.Usuario;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Table(name = "topicos")
@Entity(name = "Topico")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Topico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;

    private String mensaje;

    private LocalDateTime fecha;

    @Enumerated(EnumType.STRING)
    private EstadoDelTopico estado;

    @Setter
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name= "id_usuario")
    private Usuario  id_usuario;

    private String autor;

    private String curso;

    private boolean activo;


    public Topico(TopicoDTO datosRegistroTopico) {

        this.titulo = datosRegistroTopico.titulo();
        this.mensaje = datosRegistroTopico.mensaje();
        this.fecha = datosRegistroTopico.fecha();
        this.fecha =LocalDateTime.now();
        this.estado = datosRegistroTopico.estado();
        this.autor = datosRegistroTopico.autor();
        this.id_usuario = datosRegistroTopico.id_usuario();
        this.curso = datosRegistroTopico.curso();
        this.activo = true;
    }

    public void actualizarDatos(DatosActualizarTopico datosActualizarTopico) {

        if (datosActualizarTopico.titulo() != null ){
            this.titulo = datosActualizarTopico.titulo();
        }

        if (datosActualizarTopico.mensaje() != null ){
            this.mensaje= datosActualizarTopico.mensaje();
        }

        if (datosActualizarTopico.estado() != null ){
            this.estado = datosActualizarTopico.estado();
        }

        if (datosActualizarTopico.id_usuario() != null ){
            this.id_usuario = datosActualizarTopico.id_usuario();
        }

        if (datosActualizarTopico.curso() != null ){
            this.curso = datosActualizarTopico.curso();
        }

        if (datosActualizarTopico.autor() != null ){
            this.autor = datosActualizarTopico.autor();
        }

        this.titulo = datosActualizarTopico.titulo();
        this.mensaje = datosActualizarTopico.mensaje();
        this.fecha = datosActualizarTopico.fecha();
        this.fecha =LocalDateTime.now();
        this.estado = datosActualizarTopico.estado();
        this.autor = datosActualizarTopico.autor();
        this.curso = datosActualizarTopico.curso();
        this.activo = true;
    }

    public void desactivarTopico() {
        this.activo = false;
        this.estado = EstadoDelTopico.valueOf("INACTIVO");
    }


    //------------------------------------------fin------------------------------------------

}






