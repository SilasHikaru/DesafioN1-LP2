package enums;

public enum TipoRepositorio {
     TEXTO("texto"),

    MYSQL("MySQL");
 
    final private String descricao;
 
    TipoRepositorio(String descricao) {
        this.descricao = descricao;
    }
 
    public String getDescricao() {
        return descricao;
    }
}