package business;

import basis.FabricaRepositorio;
import enums.EntidadesDisponiveis;
import vos.FuncionarioVO;
import daos.Repositorio;
import business.config.Config;

public class Acesso {
    private boolean validaSenha(String senhaRepositorio, String senhaDigitada){
        return (senhaRepositorio.equals(senhaDigitada)); 
    }
    
    public boolean validaUsuario(FuncionarioVO func) {
        boolean retorno = false;
        Repositorio repositorio = FabricaRepositorio.Fabrica();        
        FuncionarioVO funcionario = (FuncionarioVO)repositorio.localizar(func.getAcesso().getUsuario(), EntidadesDisponiveis.USUARIO);
        
        if (funcionario != null)
        {
            retorno = validaSenha(funcionario.getAcesso().getSenha(), func.getAcesso().getSenha());
            
            if(retorno){
                Config.getInstance().setFuncionario(funcionario);
            }
        }
        
        return retorno;
    }
}