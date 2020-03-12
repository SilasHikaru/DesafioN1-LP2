/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basis;
import daos.Repositorio;
import daos.RepositorioArquivos;
import enums.TipoRepositorio;
/**
 *
 * @author cliente
 */
public class FabricaRepositorio {
    
     public static Repositorio Fabrica() {
         return new RepositorioArquivos();
    }
}
