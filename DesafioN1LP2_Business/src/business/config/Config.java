package business.config;

import vos.FuncionarioVO;
import java.util.concurrent.*;

public class Config {
    private FuncionarioVO funcionario = new FuncionarioVO();
    private static Config config;
    private boolean desativa = false;

    private Config() {
        
    }
   
    ConcurrentLinkedQueue<String> lista = new ConcurrentLinkedQueue<String>();
    
    ThreadMensagensAuditoria thread;
    
    public static synchronized Config getInstance() {
        if (config == null)
            config= new Config();
 
        return config;
    }

    public void setFuncionario(FuncionarioVO funcionario) {
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
        if(thread == null){
            thread = new ThreadMensagensAuditoria();
            thread.start();
        }
        
    }
    
    public Boolean Desativa(){
        return desativa;
    }
    
    public void ControleDesativa(){
        desativa = true;
         try {
                thread.join(2000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            if (thread.isAlive())
                thread.interrupt();
    }
}
