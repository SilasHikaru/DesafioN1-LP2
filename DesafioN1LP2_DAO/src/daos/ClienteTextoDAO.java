/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;
import vos.ClienteVO;
import basis.Entidade;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
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
    
    @Override
    public void deletar(String usuario) throws SQLException {
        // Caminho inicia no main
        String path = "..\\DesafioN1LP2_DAO\\src\\txts\\acessos.txt";
        
        try {
            try (BufferedReader buffRead = new BufferedReader(new FileReader(path))) {
                try (PrintWriter pw = new PrintWriter(new FileWriter(path))) {
                    String linha;
                    String splited[];

                    while((linha = buffRead.readLine()) != null) {
                        splited = linha.split("\\|");
                        
                        if(!splited[0].equals(usuario)){
                            pw.println(linha);
                        }
                    }
                }
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
