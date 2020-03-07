package estadosConsole;

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
        
    }
    
    private void cadastrarProduto() {
        
    }
    
    private void cadastrarPedido() {
    }
    
    private void cadastrarFuncionario() {
        
    }
}