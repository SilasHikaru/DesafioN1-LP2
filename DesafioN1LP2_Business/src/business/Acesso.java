package business;

import basis.FabricaRepositorio;
import enums.EntidadesDisponiveis;
import vos.Usuario;
import daos.Repositorio;

public class Acesso {
    
     private boolean validaSenha(String senhaRepositorio, String senhaDigitada){
        return (senhaRepositorio.equals(senhaDigitada)); 
    }
    
    public boolean validaUsuario(Usuario user) {
        
        boolean retorno = false;
        Repositorio repositorio = FabricaRepositorio.Fabrica();        
        Usuario usuario = (Usuario)repositorio.localiza(user.getLogin(), EntidadesDisponiveis.USUARIO);
        if (usuario != null)
        {
            retorno = validaSenha(usuario.getSenha(), user.getSenha());
        }
        return retorno;
    }
}