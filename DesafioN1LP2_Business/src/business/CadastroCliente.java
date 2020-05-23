package business;

import basis.FabricaRepositorio;
import daos.Repositorio;
import enums.EntidadesDisponiveis;
import vos.ClienteVO;

public class CadastroCliente {
    public boolean validarCliente(ClienteVO cliente) {
        boolean valido = false;
        
        Repositorio repositorio = FabricaRepositorio.Fabrica();        
        ClienteVO clienteBuscado = (ClienteVO)repositorio.localizar(cliente.getNome(), EntidadesDisponiveis.CLIENTE);
        
        if(clienteBuscado == null) {
            valido = true;
            repositorio.cadastrar(cliente, EntidadesDisponiveis.CLIENTE);
        }
        
        return valido;
    }
}
