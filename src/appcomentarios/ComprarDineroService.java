package appcomentarios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ComprarDineroService implements IComprarDinero{

  @Autowired
  private UsuariosService usuariosService;

  @Override
  public void comprarDinero(String usuario, Integer cantidad) {

    Usuario usu = this.usuariosService.findUsuario(usuario);

    if(usu !=null ){
      System.out.println("El usuario: "+usuario+" compra la siguiente cantidad: " + cantidad);
    }

  }
}