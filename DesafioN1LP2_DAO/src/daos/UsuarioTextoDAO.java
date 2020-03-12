/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import java.sql.SQLException;
import basis.Entidade;
import java.io.BufferedReader;
import java.io.FileReader;
import vos.Usuario;
/**
 *
 * @author cliente
 */
public class UsuarioTextoDAO extends DAO{
    
     private final ConcurrentHashMap<String, Usuario> usuarios = new ConcurrentHashMap<>();
    
    public UsuarioTextoDAO()
    { 
        super(Usuario.class);
       
        String path = "C:\\DesafioN1LP2\\DesafioN1-LP2\\DesafioN1LP2_DAO\\src\\txts\\funcionario.txt";
        try{
        BufferedReader buffRead = new BufferedReader (new FileReader(path));
        String linha = "";
        while (true) {
            if (linha != null) {
                System.out.println(linha);
 
            } else
                break;
            linha = buffRead.readLine();
        }
        buffRead.close();
        }catch(Exception e){
        }
       
    }
    @Override
    public Entidade seleciona(int id) {
        // Não há retorno por id
        return null;
    }

    @Override
    public Entidade localiza(String codigo) throws SQLException  {
        Entidade entidade = usuarios.getOrDefault(codigo, null);
        return entidade;
    }
    
    /* Opção 1 
    */
    @Override
    public ArrayList<Entidade> lista() throws SQLException {
        ArrayList<Entidade> entidades;
        entidades = new ArrayList();
        for (Usuario usuario : usuarios.values())
        {
            entidades.add(usuario);
        }
        return entidades;
    }
}
