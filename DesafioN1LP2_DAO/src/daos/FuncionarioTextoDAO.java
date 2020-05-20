/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
/**
 *
 * @author Acer2
 */
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        boolean contem = false;
        FuncionarioVO funcionario = (FuncionarioVO) entidade;
        String usuario = funcionario.getAcesso().getUsuario();
        try{
            try(BufferedReader buffRead = new BufferedReader(new FileReader(PATH_FILE))){
                String linha;
                String splited[];
                
                while((linha = buffRead.readLine()) != null){
                    splited = linha.split("\\|");
                    if(funcionario.getAcesso().getUsuario().equals(splited[0])){
                        contem = true;
                    }

                }
                if(!contem){
                    try(PrintWriter pw = new PrintWriter(new FileWriter(PATH_FILE,true))){
                        pw.println(funcionario.getAcesso().getUsuario() + "|" + funcionario.getAcesso().getSenha()+ "|" + funcionario.getTipoFuncionario());
                        pw.close();
                    }
                }
                else{
                    System.out.println("Funcionário já cadastrado");
                }
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
