package estadosConsole;

import desafion1lp2.DesafioN1LP2;
import java.util.Scanner;
import business.Acesso;
import vos.Usuario;

public class EstadoLogin extends MaquinaEstado {
    @Override
    public boolean executar() {
        Usuario user = new Usuario();
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Usuário: ");
        user.setLogin(leitor.nextLine());

        System.out.print("Senha: ");
        user.setSenha(leitor.nextLine());

        System.out.print("Tipo de funcionario: ");
        user.setTipo(leitor.nextLine());
        
        Acesso acesso = new Acesso();
        boolean senhaValida = acesso.validaUsuario(user);
        
        if(senhaValida){
            switch(user.getTipo()) {
            case "G":
                user.setTipo("Gerente");
                DesafioN1LP2.tipoFuncionario = "GERENTE";
                DesafioN1LP2.estadoConsole = EnumEstado.MENU_FUNCIONARIO.getEstadoMaquina();
                break;

            case "V":
                user.setTipo("Vendedor");
                DesafioN1LP2.tipoFuncionario = "VENDEDOR";
                DesafioN1LP2.estadoConsole = EnumEstado.MENU_FUNCIONARIO.getEstadoMaquina();
                break;

            default:
                System.out.println("Tipo inválido");
                break;
            }
        }
       
        return false;
    }
}