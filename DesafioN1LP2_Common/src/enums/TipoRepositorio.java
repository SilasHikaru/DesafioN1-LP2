package enums;

public enum TipoRepositorio {
    MYSQL("MySQL"),
    TEXTO("texto");

    final private String descricao;
 
    TipoRepositorio(String descricao) {
        this.descricao = descricao;
    }
 
    public String getDescricao() {
        return descricao;
    }
}
