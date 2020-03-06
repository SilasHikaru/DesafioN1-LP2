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
public class EstadoConsoleBemVindo extends FuncionarioEstadoConsole { 
    
    @Override
    public boolean Executa(){
        boolean sair = false;
        System.out.println("Bem-vindo!");
        System.out.println("Indique a opção desejada!");
        System.out.println("1 - login");
        System.out.println("0 - Sair");
        Scanner scan = new Scanner(System.in);
        int opcao = scan.nextInt();
        switch (opcao) {
            case 1: 
                DesafioN1.estadoConsole = EnumEstadoConsole.LOGIN.getEstadoMaquina();
                break;
            case 0 :
                   sair = true;
                break;
                  
        }
        return sair;
    }
}
