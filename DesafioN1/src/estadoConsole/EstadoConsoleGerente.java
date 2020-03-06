/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estadoConsole;
import desafion1.DesafioN1;
import java.util.Scanner;
/**
 *
 * @author Acer2
 */
public class EstadoConsoleGerente extends FuncionarioEstadoConsole {
    @Override
    public boolean Executa(){
        
        boolean sair = false;
        System.out.println("### Cadastros ###");
        System.out.println("Digite as opções:");
        System.out.println("0 - Cadasro de Gerente");
        System.out.println("1 - Cadastro de Vendedor");
        System.out.println("2 - Cadastro de Cliente");
        System.out.println("3 -Cadastro de Produtos");
        System.out.println("4- Cadastro de Pedidos");
        System.out.println("4- Cadastro de Sair");
        Scanner ler = new Scanner(System.in);
        int opcao = ler.nextInt(); 
        switch (opcao) {
            case 0 : 
                DesafioN1.estadoConsole = EnumEstadoConsole.CAD_GERENTE.getEstadoMaquina();
                break;
            case 1:
                DesafioN1.estadoConsole = EnumEstadoConsole.CAD_VENDEDOR.getEstadoMaquina();
                break;
            case 2 :
                DesafioN1.estadoConsole = EnumEstadoConsole.CAD_CLIENTE.getEstadoMaquina();
                break;
            case 3 :
                DesafioN1.estadoConsole = EnumEstadoConsole.CAD_PRODUTO.getEstadoMaquina();
                break;
            case 4 :
                DesafioN1.estadoConsole = EnumEstadoConsole.CAD_PEDIDO.getEstadoMaquina();
                break;
            case 5 :
                sair = true;
        }
        
        return sair;
    }
    
}
