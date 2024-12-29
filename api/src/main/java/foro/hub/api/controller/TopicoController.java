package foro.hub.api.controller;




import foro.hub.api.domain.topico.ListadoTopicoDTO;
import foro.hub.api.domain.topico.Topico;
import foro.hub.api.domain.topico.TopicoDTO;
import foro.hub.api.domain.topico.TopicoRepository;
import foro.hub.api.domain.usuario.Usuario;
import foro.hub.api.domain.usuario.UsuarioRepository;
import foro.hub.api.domain.topico.DatosActualizarTopico;
import foro.hub.api.domain.topico.DatosRespuestaTopico;
import foro.hub.api.infra.security.TokenService;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



@RestController
@ResponseBody
@RequestMapping("/topico")
public class TopicoController {

    @Autowired
    private TopicoRepository topicoRepository;
    @Autowired
    private UsuarioRepository usuarioRepository;
    @Autowired
    private TokenService tokenService;


    @PostMapping
    @Transactional
    public ResponseEntity<?> registrarTopico(
            @RequestBody @Valid TopicoDTO datosRegistroTopico,
            @RequestHeader("Authorization") String authorizationHeader
    ) {

        String token = authorizationHeader.replace("Bearer ", "");
        Long idUsuario = tokenService.getIdUsuario(token);
        Usuario usuario = usuarioRepository.findById(idUsuario)
                .orElseThrow(() -> new RuntimeException("Usuario no encontrado"));
        Topico topico = new Topico(datosRegistroTopico);
        topico.setUsuario(usuario);
        topico.setAutor(usuario.getNombre());
        topicoRepository.save(topico);
        return ResponseEntity.status(HttpStatus.CREATED).body("Tópico registrado con éxito");
    }



    @GetMapping
    public Page<ListadoTopicoDTO> listadoTopicos(@PageableDefault(size=10, sort = "fecha", direction = Sort.Direction.DESC) Pageable paginacion){
        return topicoRepository.findAll(paginacion).map(ListadoTopicoDTO::new);

    }

    @GetMapping("/{id}")
    public ResponseEntity<DatosRespuestaTopico> retornarDatosTopico(@PathVariable Long id){
        Topico topico = topicoRepository.getReferenceById(id);
        var datosTopico = new DatosRespuestaTopico(topico.getId(), topico.getTitulo(),
                topico.getMensaje(),topico.getFecha(), topico.getEstado(), topico.getAutor(),
                topico.getCurso());
        return ResponseEntity.ok(datosTopico);
    }


    @PutMapping
    @Transactional
    public void actualizarTopico(@RequestBody @Valid DatosActualizarTopico datosActualizarTopico){
        Topico topico = topicoRepository.getReferenceById(datosActualizarTopico.id());
        topico.actualizarDatos(datosActualizarTopico);
    }

    //DELETE LOGICO
    @DeleteMapping("/{id}")
    @Transactional
    public ResponseEntity eliminarTopico(@PathVariable Long id){
        Topico topico = topicoRepository.getReferenceById(id);
        topico.desactivarTopico();
        return ResponseEntity.noContent().build();

    }

//    //DELETE EN BASE DE DATOS
//    @DeleteMapping("/{id}")
//    @Transactional
//    public void  eliminarTopico(@PathVariable Long id){
//        Topico topico = topicoRepository.getReferenceById(id);
//        topicoRepository.delete(topico);
//
//
//    }


}

//------------------------------------------------------------fin-------------------------------------------------------


