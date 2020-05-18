package daos;

import java.util.ArrayList;
import java.sql.SQLException;
import basis.Entidade;
import java.io.BufferedReader;
import java.io.FileReader;
import vos.AcessoVO;
import vos.FuncionarioVO;
import java.io.PrintWriter;
import java.io.FileWriter;

public class UsuarioTextoDAO extends DAO {
    private final String PATH_FILE = "..\\DesafioN1LP2_DAO\\src\\txts\\funcionarios.txt";

    public UsuarioTextoDAO() { 
        super(AcessoVO.class);
    }
    
    @Override
    public ArrayList<Entidade> listar() throws SQLException {
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
    public Entidade localizar(String codigo) throws SQLException {
        Entidade entidade = null;

        try {
            BufferedReader buffRead = new BufferedReader (new FileReader(PATH_FILE));
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

    @Override
    public Entidade selecionar(int id) {
        return null;
    }
    
    @Override 
    public void atualizar(Entidade entidade) {
    }
    
    @Override 
    public void cadastrar(Entidade entidade) {
    }

    @Override
    public void deletar(int id) throws SQLException {
        try {
            try (BufferedReader buffRead = new BufferedReader(new FileReader(PATH_FILE))) {
                try (PrintWriter pw = new PrintWriter(new FileWriter(PATH_FILE))) {
                    String linha;
                    String splited[];

                    while((linha = buffRead.readLine()) != null) {
                        splited = linha.split("\\|");
                        
                        if(!splited[0].equals(id)) {
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
