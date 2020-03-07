package vos;

public class FuncionarioVO {
    private int funcionarioId;
    private String nome;
    private int TipoFuncionarioId;

    /**
     * @return the funcionarioId
     */
    public int getFuncionarioId() {
        return funcionarioId;
    }

    /**
     * @param funcionarioId the funcionarioId to set
     */
    public void setFuncionarioId(int funcionarioId) {
        this.funcionarioId = funcionarioId;
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
     * @return the TipoFuncionarioId
     */
    public int getTipoFuncionarioId() {
        return TipoFuncionarioId;
    }

    /**
     * @param TipoFuncionarioId the TipoFuncionarioId to set
     */
    public void setTipoFuncionarioId(int TipoFuncionarioId) {
        this.TipoFuncionarioId = TipoFuncionarioId;
    }
}