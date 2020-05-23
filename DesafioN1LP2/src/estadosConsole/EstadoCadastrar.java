package estadosConsole;

import java.util.Scanner;
import basis.Entidade;
import business.CadastroCliente;
import business.config.Config;
import daos.RepositorioArquivos;
import daos.Repositorio;
import vos.ClienteVO;
import vos.ProdutoVO;
import vos.PedidoVO;
import vos.FuncionarioVO;
import vos.AcessoVO;
import enums.EntidadesDisponiveis;
import daos.DAO;
import desafion1lp2.DesafioN1LP2;

public class EstadoCadastrar extends MaquinaEstado {
    @Override
    public boolean executar() {
        switch(EstadoCRUID.tipoItem) {
            case "CLIENTE":
                cadastrarCliente();
                break;
                
            case "FUNCIONARIO":
                cadastrarFuncionario();
                break;
                
            case "PEDIDO":
                cadastrarPedido();
                break;
                
            case "PRODUTO":
                cadastrarProduto();
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
        
        Scanner le = new Scanner(System.in);
        
        System.out.print("Informe o ID do cliente que deseja cadastrar: ");
        cliente.setClienteId(Integer.parseInt(le.nextLine()));
        
        System.out.print("Informe o nome do cliente: ");
        cliente.setNome(le.nextLine());
        
        CadastroCliente cadCliente = new CadastroCliente();
        
        if(cadCliente.validarCliente(cliente)) {
            Config.getInstance().IncluiAuditoria("Cliente " + cliente.getNome() + " cadastrado");
            
            DesafioN1LP2.estadoConsole = EnumEstado.ESTADO_CRUID.getEstadoMaquina();
        } else {
            System.out.println("Nome do cliente já existe");
        }
    }
    
    private void cadastrarFuncionario() {
        FuncionarioVO funcionario = new FuncionarioVO();
        AcessoVO acesso = new AcessoVO();
        
        RepositorioArquivos repositorio = new RepositorioArquivos();
        
        Scanner le = new Scanner(System.in);
        
        System.out.print("Informe o usuário do funcionário: ");
        acesso.setUsuario(le.nextLine());
        
        System.out.print("Informe a senha do funcionário: ");
        acesso.setSenha(le.nextLine());
             
        System.out.print("Informe o cargo do funcionário ( GERENTE / VENDEDOR ): ");
        funcionario.setTipoFuncionario(le.nextLine());
       
        funcionario.setAcesso(acesso);
       
        repositorio.cadastrar(funcionario, EntidadesDisponiveis.FUNCIONARIO);
        DesafioN1LP2.estadoConsole = EnumEstado.ESTADO_CRUID.getEstadoMaquina();
    }
    
    private void cadastrarPedido() {
        PedidoVO pedido = new PedidoVO();
        RepositorioArquivos repositorio = new RepositorioArquivos();
        
        Scanner le = new Scanner(System.in);
        
        System.out.print("Informe o ID do pedido que deseja cadastrar: ");
        pedido.setPedidoId(Integer.parseInt(le.nextLine()));
        
        System.out.print("Informe o ID do cliente cadastrado: ");
        pedido.setClienteId(Integer.parseInt(le.nextLine()));
        
        repositorio.cadastrar(pedido, EntidadesDisponiveis.PEDIDO);
        DesafioN1LP2.estadoConsole = EnumEstado.ESTADO_CRUID.getEstadoMaquina();
    }
    
    private void cadastrarProduto() {
        ProdutoVO produto = new ProdutoVO();
        RepositorioArquivos repositorio = new RepositorioArquivos();
        
        Scanner le = new Scanner(System.in);
        
        System.out.print("Informe o ID do produto que deseja cadastrar: ");
        produto.setProdutoId(Integer.parseInt(le.nextLine()));
        
        System.out.print("Informe a descrição do produto: ");
        produto.setDescricao(le.nextLine());
        
        repositorio.cadastrar(produto, EntidadesDisponiveis.PRODUTO);
        DesafioN1LP2.estadoConsole = EnumEstado.ESTADO_CRUID.getEstadoMaquina();
    }
}
