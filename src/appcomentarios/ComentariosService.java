package appcomentarios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ComentariosService implements IComentarios{

  @Autowired
  private UsuariosService usuariosService;

  @Override
  public void comentar(String usuario, String comentario) {

    Usuario usu = this.usuariosService.findUsuario(usuario);

    if(usu != null) {
      System.out.println("El usuario: "+usuario+" comenta lo siguiente: " + comentario);
    }

  }
}