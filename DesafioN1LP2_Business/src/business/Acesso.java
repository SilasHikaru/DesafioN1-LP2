package business;

import basis.FabricaRepositorio;
import enums.EntidadesDisponiveis;
import vos.AcessoVO;
import daos.Repositorio;

public class Acesso {
     private boolean validaSenha(String senhaRepositorio, String senhaDigitada){
        return (senhaRepositorio.equals(senhaDigitada)); 
    }
    
    public boolean validaUsuario(AcessoVO user) {
        
        boolean retorno = false;
        Repositorio repositorio = FabricaRepositorio.Fabrica();        
        AcessoVO acessoVO = (AcessoVO)repositorio.localiza(user.getUsuario(), EntidadesDisponiveis.USUARIO);
        
        if (acessoVO != null)
        {
            retorno = validaSenha(acessoVO.getSenha(), user.getSenha());
        }
        
        return retorno;
    }
}