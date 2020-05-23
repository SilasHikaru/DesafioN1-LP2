/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;
import basis.FabricaRepositorio;
import daos.Repositorio;
import enums.EntidadesDisponiveis;
import vos.FuncionarioVO;
import vos.AcessoVO;
/**
 *
 * @author cliente
 */
public class CadastroFuncionario {
    
     public boolean validarFuncionario(FuncionarioVO funcionario) {
        boolean valido = false;
        
        Repositorio repositorio = FabricaRepositorio.Fabrica();        
        FuncionarioVO funcionarioBuscado = (FuncionarioVO)repositorio.localizar(funcionario.getAcesso().getUsuario(), EntidadesDisponiveis.FUNCIONARIO);
        
        if(funcionarioBuscado == null) {
            valido = true;
            repositorio.cadastrar(funcionario, EntidadesDisponiveis.FUNCIONARIO);
        }
        
        return valido;
    }
    
}
