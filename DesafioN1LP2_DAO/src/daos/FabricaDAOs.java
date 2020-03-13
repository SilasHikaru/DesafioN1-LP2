package daos;

import vos.AcessoVO;
import enums.EntidadesDisponiveis;
import enums.TipoRepositorio;
import daos.UsuarioTextoDAO;

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
            case CLIENTE:
                retorno = new ClienteTextoDAO();
            default:
                retorno = null;
                break;
        }
        
        return retorno;    
    }
}