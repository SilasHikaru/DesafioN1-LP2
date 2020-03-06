/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estadoConsole;

/**
 *
 * @author Acer2
 */
public enum EnumEstadoConsole {
    
    BEM_VINDO(new EstadoConsoleBemVindo()),
    LOGIN (new EstadoConsoleLogin()),
    MENU_PRINCIPAL (new EstadoConsoleMenuPrincipal()),
    GERENTE (new EstadoConsoleGerente()),
    VENDEDOR(new EstadoConsoleVendedor()),
    CAD_VENDEDOR(new EstadoConsoleCadVendedor()),
    CAD_GERENTE(new EstadoConsoleCadGerente()),
    CAD_CLIENTE(new EstadoConsoleCadCliente()),
    CAD_PRODUTO(new EstadoConsoleCadProduto()),
    CAD_PEDIDO(new EstadoConsoleCadPedido());
    
   private final FuncionarioEstadoConsole estadoMaquina;
            
    EnumEstadoConsole(FuncionarioEstadoConsole estadoMaquina) {
        this.estadoMaquina = estadoMaquina;
    }
    
    public FuncionarioEstadoConsole getEstadoMaquina(){
        return estadoMaquina;
    }
}
