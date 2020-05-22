package estadosConsole;

import java.util.Scanner;

public class EstadoConsultar extends MaquinaEstado {
    @Override
    public boolean executar() {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Informe o ID");
        String id = leitor.nextLine();

        if(id.trim().equals("")) {
            System.out.println("Isso não é um ID");
        } else {
            // Faz a consulta
        }
        
        return false;
    }
}
