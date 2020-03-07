package estadosConsole;

import desafion1lp2.DesafioN1LP2;
import java.util.Scanner;

public class EstadoLogin extends MaquinaEstado {
    @Override
    public boolean executar() {
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Usuário: ");
        String usuario = leitor.nextLine();

        System.out.print("Senha: ");
        String senha = leitor.nextLine();

        System.out.print("Tipo de funcionario: ");
        switch(leitor.nextLine().toUpperCase()) {
            case "G":
                DesafioN1LP2.tipoFuncionario = "GERENTE";
                DesafioN1LP2.estadoConsole = EnumEstado.MENU_FUNCIONARIO.getEstadoMaquina();
                break;

            case "V":
                DesafioN1LP2.tipoFuncionario = "VENDEDOR";
                DesafioN1LP2.estadoConsole = EnumEstado.MENU_FUNCIONARIO.getEstadoMaquina();
                break;

            default:
                System.out.println("Tipo inválido");
                break;
        }

        return false;
    }
}