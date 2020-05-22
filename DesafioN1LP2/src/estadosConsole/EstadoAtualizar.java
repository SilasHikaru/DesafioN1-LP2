package estadosConsole;

public class EstadoAtualizar extends MaquinaEstado {
    public static int id;
    
    @Override
    public boolean executar() {
        switch(EstadoCRUID.tipoItem) {
            case "CLIENTE":
                atualizarCliente();
                break;
                
            case "FUNCIONARIO":
                atualizarFuncionario();
                break;
                
            case "PEDIDO":
                atualizarPedido();
                break;
                
            case "PRODUTO":
                atualizarProduto();
                break;
                
            default:
                System.out.println("Tipo de item inválido");
                break;
        }
        
        return false;
    }
    
    private void atualizarCliente() {}
    
    private void atualizarFuncionario() {}
    
    private void atualizarPedido() {}
    
    private void atualizarProduto() {}
}
