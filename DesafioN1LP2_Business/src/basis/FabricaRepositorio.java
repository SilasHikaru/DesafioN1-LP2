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
