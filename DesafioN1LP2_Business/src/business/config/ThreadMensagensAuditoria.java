package business.config;

public class ThreadMensagensAuditoria extends Thread{
    @Override
    public void run(){
        String mensagem;

        while(!Config.getInstance().Desativa()){
            mensagem = Config.getInstance().RetiraAuditoria();
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
