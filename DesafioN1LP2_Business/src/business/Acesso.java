package business;

import basis.FabricaRepositorio;
import enums.EntidadesDisponiveis;
import vos.AcessoVO;
import vos.FuncionarioVO;
import daos.Repositorio;
import desafion1lp2.DesafioN1LP2;

public class Acesso {
     private boolean validaSenha(String senhaRepositorio, String senhaDigitada){
        return (senhaRepositorio.equals(senhaDigitada)); 
    }
    
    public boolean validaUsuario(AcessoVO user) {
        
        boolean retorno = false;
        Repositorio repositorio = FabricaRepositorio.Fabrica();        
        FuncionarioVO funcionario = (FuncionarioVO)repositorio.localiza(user.getUsuario(), EntidadesDisponiveis.USUARIO);
        
        if (funcionario != null)
        {
            retorno = validaSenha(funcionario.getAcesso().getSenha(), user.getSenha());
            
        }
        
        return retorno;
    }
    public boolean tipo(){
    boolean tipo = false;
        String t = FuncionarioVO.getTipoFuncionario();
    return tipo;
    }
}