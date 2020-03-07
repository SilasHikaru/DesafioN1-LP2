package estadosConsole;

public class EstadoAtualizar extends MaquinaEstado {
    public static int id;
    
    @Override
    public boolean executar() {
        switch(EstadoCRUID.tipoItem) {
            case "CLIENTE":
                atualizarCliente();
                break;
                
            case "PRODUTO":
                atualizarProduto();
                break;
                
            case "PEDIDO":
                atualizarPedido();
                break;
            
            case "FUNCIONARIO":
                atualizarFuncionario();
                break;
                
            default:
                System.out.println("Tipo de item inválido");
                break;
        }
        
        return false;
    }
    
    private void atualizarCliente() {
        
    }
    
    private void atualizarProduto() {
        
    }
    
    private void atualizarPedido() {
    }
    
    private void atualizarFuncionario() {
        
    }
}