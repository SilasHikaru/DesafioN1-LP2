package enums;

public enum EntidadesDisponiveis {
    CLIENTE("clinete"),
    FUNCIONARIO("funcionario"),
    PEDIDO("pedido"),
    PRODUTO("produto"),
    USUARIO("usuario");
    
    final private String descricao;
 
    EntidadesDisponiveis(String descricao) {
        this.descricao = descricao;
    }
 
    public String getDescricao() {
        return descricao;
    }
}
