/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.config;
import vos.FuncionarioVO;
import java.util.concurrent.*;
/**
 *
 * @author Acer2
 */
public class Config {
    
    private FuncionarioVO funcionario = new FuncionarioVO();
    private static Config config;
    private boolean desativa = true;
    private Config() {
    }
   
    ConcurrentLinkedQueue<String> lista = new ConcurrentLinkedQueue<String>();
    
    ThreadMensagensAuditoria thread = new ThreadMensagensAuditoria();
    
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
    
    public void IncluiAuditoria(String mensagem){
        this.lista.add(mensagem);
    }
    
    public String RetiraAuditoria (){
        try{
            Thread.sleep(1000);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
        return lista.poll();
    }
    
    public void ativo(){
        thread.start();
    }
    
    public Boolean Desativa(){
        return desativa;
    }
}
