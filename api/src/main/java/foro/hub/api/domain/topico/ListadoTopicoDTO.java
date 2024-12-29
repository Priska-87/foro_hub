package foro.hub.api.domain.topico;


import java.time.LocalDateTime;

public record ListadoTopicoDTO(
        Long id,
        String titulo,
        String mensaje,
        LocalDateTime fecha,
        String curso,
        String autor,
        EstadoDelTopico estado

){

    public ListadoTopicoDTO(Topico topico){
        this(topico.getId(),
                topico.getTitulo(),
                topico.getMensaje(),
                LocalDateTime.parse(String.valueOf(topico.getFecha())),
                topico.getCurso(),
                topico.getAutor(),
                topico.getEstado());


    }

}
