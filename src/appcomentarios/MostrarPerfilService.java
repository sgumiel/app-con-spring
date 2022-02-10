package appcomentarios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MostrarPerfilService implements IMostrarPerfil{

  @Autowired
  private UsuariosService usuariosService;

  @Override
  public void mostrarPerfil(String usuario) {

    Usuario usu = this.usuariosService.findUsuario(usuario);

    if(usu !=null) {
      System.out.println("El usuario: "+usu.nombre+" tiene el nickname: " + usu.nickname);
    }

  }
}