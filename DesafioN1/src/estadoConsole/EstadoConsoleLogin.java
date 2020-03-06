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
public class EstadoConsoleLogin extends FuncionarioEstadoConsole {
    @Override
    public boolean Executa(){
      
        boolean sair = false;
        Scanner ler = new Scanner(System.in);
        System.out.println("### Login ###");
        System.out.println("informe se é vendedor ou gerente");
        String tipo = ler.nextLine();
        
        switch(tipo) {
            case "gerente":
                DesafioN1.funcionario = true;
                DesafioN1.estadoConsole = EnumEstadoConsole.GERENTE.getEstadoMaquina();
                break;
            case "vendedor":
                DesafioN1.funcionario = false;
                DesafioN1.estadoConsole = EnumEstadoConsole.VENDEDOR.getEstadoMaquina();
        }
        
        System.out.println("Digite o usário");
        String usuario = ler.nextLine();
        System.out.println("Digite a senha ");
        String senha = ler.nextLine();
                
        System.out.println();
        
        // DesafioN1.estadoConsole = EnumEstadoConsole.MENU_PRINCIPAL.getEstadoMaquina();
        return sair;
    }           
}