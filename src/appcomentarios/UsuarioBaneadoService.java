package appcomentarios;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioBaneadoService {

    private List<String> usuariosBaneados = List.of("Juan");

    public Boolean isBaneado(String usuario){
        return usuariosBaneados.contains(usuario);
    }
}
