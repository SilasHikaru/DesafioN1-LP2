/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;
import basis.FabricaRepositorio;
import daos.Repositorio;
import enums.EntidadesDisponiveis;
import vos.PedidoVO;
/**
 *
 * @author cliente
 */
public class CadastroPedido {
    public boolean validarPedido(PedidoVO pedido) {
        boolean valido = false;
        
        Repositorio repositorio = FabricaRepositorio.Fabrica();        
        PedidoVO pedidoBuscado = (PedidoVO)repositorio.localizar(Integer.toString(pedido.getPedidoId()), EntidadesDisponiveis.PEDIDO);
        
        if(pedidoBuscado == null) {
            valido = true;
            repositorio.cadastrar(pedido, EntidadesDisponiveis.PEDIDO);
        }
        
        return valido;
    }
}
