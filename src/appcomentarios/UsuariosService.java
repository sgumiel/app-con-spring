package appcomentarios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class UsuariosService {

  @Autowired
  private UsuarioBaneadoService usuarioBaneadoService;

  private Map<String, Usuario> usuarios = Map.ofEntries(
      Map.entry("Juan", new Usuario("Juan", "juan89")),
      Map.entry("Soledad", new Usuario("Soledad", "sole2000")),
      Map.entry("Lorena", new Usuario("Lorena", "lalore")));

  public Usuario findUsuario(String nombre) {

    if (!usuarioBaneadoService.isBaneado(nombre)) {
      return usuarios.get(nombre);
    } else {
      return null;
    }
  }
}