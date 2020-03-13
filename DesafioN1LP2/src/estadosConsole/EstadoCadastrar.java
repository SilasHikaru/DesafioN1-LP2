package estadosConsole;

import java.util.Scanner;
import basis.Entidade;
import daos.RepositorioArquivos;
import daos.Repositorio;
import vos.ClienteVO;
import enums.EntidadesDisponiveis;
import daos.DAO;
public class EstadoCadastrar extends MaquinaEstado {
    @Override
    public boolean executar() {
        switch(EstadoCRUID.tipoItem) {
            case "CLIENTE":
                cadastrarCliente();
                break;
                
            case "PRODUTO":
                cadastrarProduto();
                break;
                
            case "PEDIDO":
                cadastrarPedido();
                break;
            
            case "FUNCIONARIO":
                cadastrarFuncionario();
                break;
                
            default:
                System.out.println("Tipo de item inválido");
                break;
        }
        
        return false;
    }
    
    private void cadastrarCliente() {
        
        ClienteVO cliente = new ClienteVO();
        RepositorioArquivos repositorio = new RepositorioArquivos();
        boolean cadastro = false;
        
        Scanner le = new Scanner(System.in);
        System.out.print("Informe o ID do cliente que deseja cadastrar");
        cliente.setClienteId(Integer.parseInt(le.nextLine()));
        System.out.print("Informe o nome do cliente");
        cliente.setNome(le.nextLine());
        
        cadastro = repositorio.Cadastro(cliente.getClienteId(), EntidadesDisponiveis.USUARIO);
    }
    
    private void cadastrarProduto() {
        
    }
    
    private void cadastrarPedido() {
    }
    
    private void cadastrarFuncionario() {
        
    }
}