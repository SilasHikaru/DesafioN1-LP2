package daos;

import vos.AcessoVO;
import enums.EntidadesDisponiveis;
import enums.TipoRepositorio;
// import daos.UsuarioTextoDAO;

public class FabricaDAOs {
    public static DAO Fabrica(EntidadesDisponiveis enumEntidade, TipoRepositorio repositorio) {
        return montaDAOTexto(enumEntidade);
    }

    private static DAO montaDAOTexto(EntidadesDisponiveis enumEntidade) {
        DAO retorno;

        switch (enumEntidade)
        {
            case CLIENTE:
                retorno = new ClienteTextoDAO();
                break;
                
            case FUNCIONARIO:
                retorno = new FuncionarioTextoDAO();
                break;

            case PEDIDO:
                retorno = new PedidoTextoDAO();
                break;
            
            case PRODUTO:
                retorno = new ProdutoTextoDAO();
                break;
            
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
