package daos;

import vos.ClienteVO;
import basis.Entidade;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;

public class ClienteTextoDAO extends DAO {
    private final String PATH_FILE = "..\\DesafioN1LP2_DAO\\src\\txts\\acessos.txt";

    public ClienteTextoDAO() { 
        super(ClienteVO.class);
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
    public Entidade selecionar(int id) {
        // Não há retorno por id
        return null;
    }

    @Override
    public Entidade localizar(String codigo) throws SQLException {
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
