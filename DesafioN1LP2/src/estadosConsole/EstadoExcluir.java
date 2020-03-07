package estadosConsole;

import desafion1lp2.DesafioN1LP2;
import java.util.Scanner;

public class EstadoExcluir extends MaquinaEstado {
    public static int id;
    
    @Override
    public boolean executar() {
        System.out.println("Tem certeza que deseja excluir?");
        System.out.println("S - Sim");
        System.out.println("N - Não");
        
        Scanner leitor = new Scanner(System.in);
        
        switch(leitor.nextLine().toUpperCase()) {
            case "S":
                // Faz a exclusão
                DesafioN1LP2.estadoConsole = EnumEstado.ESTADO_CRUID.getEstadoMaquina();
                break;

            case "N":
                DesafioN1LP2.estadoConsole = EnumEstado.ESTADO_CRUID.getEstadoMaquina();
                break;

            default:
                System.out.println("Opção inválida");
                break;
        }
        
        return false;
    }
}