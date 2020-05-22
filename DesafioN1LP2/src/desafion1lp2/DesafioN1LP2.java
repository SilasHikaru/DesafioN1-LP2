package desafion1lp2;

import estadosConsole.MaquinaEstado;
import estadosConsole.EnumEstado;

public class DesafioN1LP2 {
    public static MaquinaEstado estadoConsole;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        estadoConsole = EnumEstado.BEM_VINDO.getEstadoMaquina();
        boolean sair = false;

        while (!sair){
            sair = estadoConsole.executar();
        }
    }
}
