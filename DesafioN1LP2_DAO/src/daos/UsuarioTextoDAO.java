package daos;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import java.sql.SQLException;
import basis.Entidade;
import java.io.BufferedReader;
import java.io.FileReader;
import vos.AcessoVO;
import vos.FuncionarioVO;

public class UsuarioTextoDAO extends DAO{
   
    
    public UsuarioTextoDAO()
    { 
        super(AcessoVO.class);  
    }
    @Override
    public Entidade seleciona(int id) {
        // Não há retorno por id
        return null;
    }

    @Override
    public Entidade localiza(String codigo) throws SQLException  {
        Entidade entidade = null;
       // Caminho inicia no main
        String path = "..\\DesafioN1LP2_DAO\\src\\txts\\acessos.txt";
        try {
            BufferedReader buffRead = new BufferedReader (new FileReader(path));
            String linha;
            String splited[];
            while((linha = buffRead.readLine()) != null) {
                splited = linha.split("\\|");
                if(splited[0].equals(codigo)){
                    AcessoVO acesso = new AcessoVO();
                    FuncionarioVO funcionario = new FuncionarioVO();
                    acesso.setUsuario(codigo);
                    acesso.setSenha(splited[1]);
                    funcionario.setTipoFuncionario(splited[2]);
                    funcionario.setAcesso(acesso);
                    
                    entidade = funcionario;
                    /*
                    ((AcessoVO)entidade).setUsuario(codigo);
                    ((AcessoVO)entidade).setSenha(splited[1]);
                    ((FuncionarioVO)entidade).setTipoFuncionario(splited[2]);
                    */
                }
            }

            buffRead.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
        return entidade;
    }
    
    /* Opção 1 
    */
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
    
    @Override 
    public boolean cadastra(int id){
        return false;
    }
}
