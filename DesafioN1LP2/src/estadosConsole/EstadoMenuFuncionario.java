package estadosConsole;

import business.config.Config;
import desafion1lp2.DesafioN1LP2;
import java.util.Scanner;

public class EstadoMenuFuncionario extends MaquinaEstado {
    @Override
    public boolean executar() {
        System.out.println("O que você deseja gerenciar?");
        System.out.println("1 - Cliente");
        System.out.println("2 - Produto");
        System.out.println("3 - Pedido");
        if(Config.getInstance().getFuncionario().getTipoFuncionario().equalsIgnoreCase("GERENTE")) {
            System.out.println("4 - Funcionário");
        }
        System.out.println("0 - Desconectar");
        
        Scanner leitor = new Scanner(System.in);
        
        switch(leitor.nextLine()) {
            case "1":
                EstadoCRUID.tipoItem = "CLIENTE";
                DesafioN1LP2.estadoConsole = EnumEstado.ESTADO_CRUID.getEstadoMaquina();
                break;

            case "2":
                EstadoCRUID.tipoItem = "PRODUTO";
                DesafioN1LP2.estadoConsole = EnumEstado.ESTADO_CRUID.getEstadoMaquina();
                break;

            case "3":
                EstadoCRUID.tipoItem = "PEDIDO";
                DesafioN1LP2.estadoConsole = EnumEstado.ESTADO_CRUID.getEstadoMaquina();
                break;

            case "4":
                if(Config.getInstance().getFuncionario().getTipoFuncionario().equalsIgnoreCase("GERENTE")){
                    EstadoCRUID.tipoItem = "FUNCIONARIO";
                    DesafioN1LP2.estadoConsole = EnumEstado.ESTADO_CRUID.getEstadoMaquina();
                } else {
                    System.out.println("Opção invalida ");
                }
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