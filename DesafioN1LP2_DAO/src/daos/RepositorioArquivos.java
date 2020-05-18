package daos;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
// import daos.DAO;
// import daos.FabricaDAOs;
// import daos.Repositorio;
import basis.Entidade;
import enums.EntidadesDisponiveis;
import enums.TipoRepositorio;
import java.util.ArrayList;

public class RepositorioArquivos extends Repositorio {
    @Override
    public Entidade localizar(String codigo, EntidadesDisponiveis tipoEntidade) {
        DAO dao = FabricaDAOs.Fabrica(tipoEntidade, TipoRepositorio.TEXTO);
        Entidade entidade = null;

        try {
            entidade = dao.localizar(codigo);
        } catch (SQLException ex) {
            Logger.getLogger(RepositorioArquivos.class.getName()).log(Level.SEVERE, null, ex);
        }

        return entidade;
    }
    
    @Override
    public ArrayList<Entidade> listar(EntidadesDisponiveis tipoEntidade) {
        try {
            DAO dao = FabricaDAOs.Fabrica(tipoEntidade, TipoRepositorio.TEXTO);
            return dao.listar();
        } catch (SQLException ex) {
            Logger.getLogger(RepositorioArquivos.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    public Entidade selecionar(int id, EntidadesDisponiveis tipoEntidade) {
        DAO dao = FabricaDAOs.Fabrica(tipoEntidade, TipoRepositorio.TEXTO);
        Entidade entidade = dao.selecionar(id);

        return entidade;
    }
    
    @Override
    public void atualizar(Entidade entidade, EntidadesDisponiveis tipoEntidade) {
        DAO dao = FabricaDAOs.Fabrica(tipoEntidade, TipoRepositorio.TEXTO);
        dao.atualizar(entidade);
    }

    @Override
    public void cadastrar(Entidade entidade, EntidadesDisponiveis tipoEntidade) {
        DAO dao = FabricaDAOs.Fabrica(tipoEntidade, TipoRepositorio.TEXTO);
        dao.cadastrar(entidade);
    }
    
    @Override
    public void deletar(int id, EntidadesDisponiveis tipoEntidade) {
        try {
            DAO dao = FabricaDAOs.Fabrica(tipoEntidade, TipoRepositorio.TEXTO);
            dao.deletar(id);
        } catch (SQLException ex) {
            Logger.getLogger(RepositorioArquivos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
