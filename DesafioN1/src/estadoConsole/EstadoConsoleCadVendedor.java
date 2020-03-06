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
public class EstadoConsoleCadVendedor extends FuncionarioEstadoConsole {
    
    @Override
    public boolean Executa(){
        boolean sair = false ;
        System.out.println("Cadastro de Vendedor");
        Scanner ler = new Scanner(System.in);
        DesafioN1.estadoConsole = EnumEstadoConsole.GERENTE.getEstadoMaquina();
        return sair;
    }
    
}
