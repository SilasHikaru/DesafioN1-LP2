/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;
import vos.Usuario;
import enums.EntidadesDisponiveis;
import enums.TipoRepositorio;
import daos.UsuarioTextoDAO;
/**
 *
 * @author cliente
 */
public class FabricaDAOs {
     public static DAO Fabrica(EntidadesDisponiveis enumEntidade, TipoRepositorio repositorio) {
        
        return montaDAOTexto(enumEntidade);
       
    }

    private static DAO montaDAOTexto(EntidadesDisponiveis enumEntidade) {
        DAO retorno;
        switch (enumEntidade)
        {
            case USUARIO:
                retorno = new UsuarioTextoDAO();
                break;            
            default:
                retorno = null;
                break;
        }
        return retorno;    
    }
    
    
}
