package daos;

import vos.PedidoVO;
import vos.ClienteVO;
import basis.Entidade;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;

public class PedidoTextoDAO extends DAO{
    private final String PATH_FILE = "..\\DesafioN1LP2_DAO\\src\\txts\\pedidos.txt";
    private final String PATH_FILE1 = "..\\DesafioN1LP2_DAO\\src\\txts\\clientes.txt";
    
    public PedidoTextoDAO() { 
        super(PedidoVO.class);
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
        boolean contemCliente = false;
        boolean repetido = false;
        PedidoVO pedido = (PedidoVO) entidade;
        int id = pedido.getPedidoId();
        int idCliente = pedido.getClienteId();
        
        try{
            try(BufferedReader buffRead = new BufferedReader(new FileReader(PATH_FILE))){
                String linha;
                String splited[];
                
                while((linha = buffRead.readLine()) != null){
                    splited = linha.split("\\|");
                    if(Integer.parseInt(splited[0])== id){
                        repetido = true;
                    }

                }
                try(BufferedReader buffReadCliente = new BufferedReader(new FileReader(PATH_FILE1))){
                    String linha1;
                    String splited1[];
                    
                    while((linha1 = buffReadCliente.readLine()) != null){
                        splited1 = linha1.split("\\|");
                        if(Integer.parseInt(splited1[0])== idCliente){
                            contemCliente = true;
                        }

                    }
                    
                    if(contemCliente && !repetido){
                        try(PrintWriter pw = new PrintWriter(new FileWriter(PATH_FILE,true))){
                            pw.println(pedido.getPedidoId() + "|" + pedido.getClienteId());
                            pw.close();
                        }
                    }
                    else{
                        System.out.println("Não foi possível cadastrar");
                    }
                }
            }
        } catch(Exception e){
            e.printStackTrace();
        }
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
