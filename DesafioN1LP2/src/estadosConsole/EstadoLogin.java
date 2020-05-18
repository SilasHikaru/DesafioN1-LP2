package estadosConsole;

import desafion1lp2.DesafioN1LP2;
import java.util.Scanner;
import business.Acesso;
import vos.AcessoVO;
import vos.FuncionarioVO;
import basis.Entidade;
import business.config.Config;

public class EstadoLogin extends MaquinaEstado {
    @Override
    public boolean executar() {
        FuncionarioVO func = new FuncionarioVO();
        func.setAcesso(new AcessoVO());
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Usuário: ");
        func.getAcesso().setUsuario(leitor.nextLine());

        System.out.print("Senha: ");
        func.getAcesso().setSenha(leitor.nextLine());
        
        Acesso acesso = new Acesso();
        
        if(acesso.validaUsuario(func)){
            if(Config.getInstance().getFuncionario().getTipoFuncionario().equalsIgnoreCase("VENDEDOR")|| Config.getInstance().getFuncionario().getTipoFuncionario().equalsIgnoreCase("VENDEDOR")) {
                DesafioN1LP2.estadoConsole = EnumEstado.MENU_FUNCIONARIO.getEstadoMaquina();
            } else if(Config.getInstance().getFuncionario().getTipoFuncionario().equalsIgnoreCase("COMUM")) {
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
