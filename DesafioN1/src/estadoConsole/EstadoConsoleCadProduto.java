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
public class EstadoConsoleCadProduto extends FuncionarioEstadoConsole{
    @Override
    public boolean Executa(){
        boolean sair = false ;
        System.out.println("Cadastro de Produto");
        Scanner ler = new Scanner(System.in);
        if(funcionario){
            DesafioN1.estadoConsole = EnumEstadoConsole.GERENTE.getEstadoMaquina();
        }
        else{
            DesafioN1.estadoConsole = EnumEstadoConsole.VENDEDOR.getEstadoMaquina();
        }
        return sair;
    }
}
