/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;
import vos.ClienteVO;
import basis.Entidade;
import java.sql.SQLException;
import java.util.ArrayList;
/**
 *
 * @author cliente
 */
public class ClienteTextoDAO extends DAO{
    
    public ClienteTextoDAO()
    { 
        super(ClienteVO.class);  
    }
    
    @Override
    public Entidade seleciona(int id) {
        // Não há retorno por id
        return null;
    }

    @Override
    public Entidade localiza(String codigo) throws SQLException  {
        return null;
    }
     @Override
    public ArrayList<Entidade> lista() throws SQLException {
        ArrayList<Entidade> entidades = new ArrayList();
        /*
        for (AcessoVO usuario : usuarios.values())
        {
            entidades.add(usuario);
        }
        */
        return entidades;
    }
    
    public boolean cadastra(int id){
        boolean cadastro = false;
        return cadastro;
    }
}
