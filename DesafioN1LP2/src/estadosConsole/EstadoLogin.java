package estadosConsole;

import desafion1lp2.DesafioN1LP2;
import java.util.Scanner;
import business.Acesso;
import vos.AcessoVO;
import vos.FuncionarioVO;
import basis.Entidade;
public class EstadoLogin extends MaquinaEstado {
    @Override
    public boolean executar() {
        AcessoVO user = new AcessoVO();
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Usuário: ");
        user.setUsuario(leitor.nextLine());

        System.out.print("Senha: ");
        user.setSenha(leitor.nextLine());
        
        Acesso acesso = new Acesso();
        
        if(acesso.validaUsuario(user)){
            if( DesafioN1LP2.tipoFuncionario.equalsIgnoreCase("VENDEDOR")|| DesafioN1LP2.tipoFuncionario.equalsIgnoreCase("VENDEDOR")) {
                DesafioN1LP2.estadoConsole = EnumEstado.MENU_FUNCIONARIO.getEstadoMaquina();
            } else if(DesafioN1LP2.tipoFuncionario.equalsIgnoreCase("COMUM")) {
                System.out.println("Este usuário não possui funções neste sistema");
            } else {
                System.out.println("Tipo de funcionário não existe");
            }
        } else {
            System.out.println("Usuário ou senha inválido");
        }
       
        return false;
    }
}