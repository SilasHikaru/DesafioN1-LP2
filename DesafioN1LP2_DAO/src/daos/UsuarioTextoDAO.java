package daos;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import java.sql.SQLException;
import basis.Entidade;
import java.io.BufferedReader;
import java.io.FileReader;
import vos.AcessoVO;

public class UsuarioTextoDAO extends DAO{
    private final ConcurrentHashMap<String, AcessoVO> usuarios = new ConcurrentHashMap<>();
    
    public UsuarioTextoDAO()
    { 
        super(AcessoVO.class);
        
        // Caminho inicia no main
        String path = "..\\DesafioN1LP2_DAO\\src\\txts\\acessos.txt";
        try {
            BufferedReader buffRead = new BufferedReader (new FileReader(path));
            String linha;

            while((linha = buffRead.readLine()) != null) {
                System.out.println(linha);
            }

            buffRead.close();
        } catch(Exception e) {
            e.printStackTrace();
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
        ArrayList<Entidade> entidades = new ArrayList();
        
        for (AcessoVO usuario : usuarios.values())
        {
            entidades.add(usuario);
        }
        
        return entidades;
    }
}
