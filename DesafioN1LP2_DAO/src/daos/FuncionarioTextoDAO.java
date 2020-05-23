package daos;

import vos.AcessoVO;
import vos.FuncionarioVO;
import basis.Entidade;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;

public class FuncionarioTextoDAO extends DAO{
    private final String PATH_FILE = "..\\DesafioN1LP2_DAO\\src\\txts\\funcionarios.txt";
    
    public FuncionarioTextoDAO(){
        super(FuncionarioVO.class);
    }

    @Override
    public ArrayList listar() throws SQLException {
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
            try(BufferedReader buffRead = new BufferedReader(new FileReader(PATH_FILE))){
                String linha;
                String splited[];

                while((linha = buffRead.readLine()) != null){
                    splited = linha.split("\\|");

                    if(splited[1].equals(codigo)){
                        entidade = new FuncionarioVO();
                        ((FuncionarioVO)entidade).getAcesso().setUsuario(splited[0]);
                        ((FuncionarioVO)entidade).getAcesso().setSenha(splited[1]);
                        ((FuncionarioVO)entidade).setTipoFuncionario(splited[2]);
                        break;
                    }
                }
            }
        } catch(Exception erro) {
            erro.printStackTrace();
        }
        
        return entidade;
    }

    @Override
    public Entidade selecionar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void atualizar(Entidade entidade) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void cadastrar(Entidade entidade) {
        FuncionarioVO funcionario = (FuncionarioVO) entidade;
        
        try{
             try(PrintWriter pw = new PrintWriter(new FileWriter(PATH_FILE,true))){
                    pw.println(funcionario.getAcesso().getUsuario() + "|" + funcionario.getAcesso().getSenha()+ "|" + funcionario.getTipoFuncionario());
                    pw.close();
                }
        } catch(Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void deletar(int id) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
