/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.config;

/**
 *
 * @author cliente
 */
public class ThreadMensagensAuditoria extends Thread{
    @Override
    public void run(){
        String mensagem = Config.getInstance().RetiraAuditoria();
        while(!Config.getInstance().Desativa()){
            try{

                if(!mensagem.equals("")){
                    Thread.sleep(10000);
                    System.out.println(mensagem);
                }
                Thread.sleep(1000);
            }catch(Exception e){
                e.printStackTrace();
            }
        } 
    }
}
