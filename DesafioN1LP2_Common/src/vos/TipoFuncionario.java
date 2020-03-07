package vos;

public class TipoFuncionario {
    private int tipoFuncionarioId;
    private String descricao;

    /**
     * @return the tipoFuncionarioId
     */
    public int getTipoFuncionarioId() {
        return tipoFuncionarioId;
    }

    /**
     * @param tipoFuncionarioId the tipoFuncionarioId to set
     */
    public void setTipoFuncionarioId(int tipoFuncionarioId) {
        this.tipoFuncionarioId = tipoFuncionarioId;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}