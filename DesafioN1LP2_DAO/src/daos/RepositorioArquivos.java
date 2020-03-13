/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import daos.DAO;
import daos.FabricaDAOs;
import daos.Repositorio;
import basis.Entidade;
import enums.EntidadesDisponiveis;
import enums.TipoRepositorio;
/**
 *
 * @author cliente
 */
public class RepositorioArquivos extends Repositorio{
    
    @Override
    public Entidade seleciona(int id, EntidadesDisponiveis tipoEntidade) {
        DAO dao = FabricaDAOs.Fabrica(tipoEntidade, TipoRepositorio.TEXTO);
        Entidade entidade = dao.seleciona(id);
        return entidade;
    }

    @Override
    public Entidade localiza(String codigo, EntidadesDisponiveis tipoEntidade) {
        DAO dao = FabricaDAOs.Fabrica(tipoEntidade, TipoRepositorio.TEXTO);
        Entidade entidade = null;
        try {
            entidade = dao.localiza(codigo);
        } catch (SQLException ex) {
            Logger.getLogger(RepositorioArquivos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return entidade;
    }
    
    public boolean Cadastro(int id, EntidadesDisponiveis tipoEntidade){
         boolean cadastro = false;
         DAO dao = FabricaDAOs.Fabrica(tipoEntidade, TipoRepositorio.TEXTO);
         cadastro = dao.cadastra(id);
         return cadastro;
    }
}
