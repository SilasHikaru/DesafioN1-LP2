package estadosConsole;

import desafion1lp2.DesafioN1LP2;
import java.util.Scanner;

public class EstadoCRUID  extends MaquinaEstado {
    public static String tipoItem;
    
    @Override
    public boolean executar() {
        System.out.println("--- GERENCIANDO " + tipoItem + " ---");
        System.out.println("1 - Cadastrar");
        System.out.println("2 - Atualizar");
        System.out.println("3 - Excluir");
        System.out.println("4 - Cunsultar");
        System.out.println("5 - Listar");
        System.out.println("6 - Voltar");
        System.out.println("0 - Desconectar");
        
        Scanner leitor = new Scanner(System.in);
        
        switch(leitor.nextLine()) {
            case "1":
                DesafioN1LP2.estadoConsole = EnumEstado.CADASTRAR.getEstadoMaquina();
                break;

            case "2":
                DesafioN1LP2.estadoConsole = EnumEstado.ATUALIZAR.getEstadoMaquina();
                break;

            case "3":
                DesafioN1LP2.estadoConsole = EnumEstado.EXCLUIR.getEstadoMaquina();
                break;

            case "4":
                DesafioN1LP2.estadoConsole = EnumEstado.CONSULTAR.getEstadoMaquina();
                break;

            case "5":
                DesafioN1LP2.estadoConsole = EnumEstado.LISTAR.getEstadoMaquina();
                break;

            case "6":
                DesafioN1LP2.estadoConsole = EnumEstado.MENU_FUNCIONARIO.getEstadoMaquina();
                break;

            case "0":
                DesafioN1LP2.estadoConsole = EnumEstado.BEM_VINDO.getEstadoMaquina();
                break;

            default:
                System.out.println("Opção inválida");
                break;
        }
        
        return false;
    }
}