package vos;

import basis.Entidade;

public class FuncionarioVO extends Entidade{
    private String nome;
    private String tipoFuncionario;
    private AcessoVO acesso;
  
    public AcessoVO getAcesso(){
        return acesso;
    }
    
    public void setAcesso(AcessoVO acesso){
        this.acesso = acesso;
    }
    
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the ipoFuncionario
     */
    public String getTipoFuncionario() {
        return tipoFuncionario;
    }

    /**
     * @param tipoFuncionario the tipoFuncionario to set
     */
    public void setTipoFuncionario(String tipoFuncionario) {
        this.tipoFuncionario = tipoFuncionario;
    }
}
