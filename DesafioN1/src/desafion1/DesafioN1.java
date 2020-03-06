/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafion1;
import estadoConsole.FuncionarioEstadoConsole;
import estadoConsole.EnumEstadoConsole;


/**
 *
 * @author Acer2
 */
public class DesafioN1 {

    public static FuncionarioEstadoConsole estadoConsole;
    public static boolean funcionario;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        estadoConsole = EnumEstadoConsole.BEM_VINDO.getEstadoMaquina();
        Boolean saida = false;
        while (!saida){
            saida = estadoConsole.Executa();
        }
    }
    
}
