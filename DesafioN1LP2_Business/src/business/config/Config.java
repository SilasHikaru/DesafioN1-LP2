/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.config;
import vos.FuncionarioVO;
/**
 *
 * @author Acer2
 */
public class Config {
    
    private FuncionarioVO funcionario = new FuncionarioVO();
    private static Config config;
 
    private Config() {
    }
 
    public static synchronized Config getInstance() {
        if (config == null)
            config= new Config();
 
        return config;
    }
    
    private FuncionarioVO tipoRepositorio; 

    public void setFuncionario (FuncionarioVO funcionario) {
         this.funcionario = funcionario;
    }

    
    public FuncionarioVO getFuncionario() {
        return this.funcionario;
    }
}
