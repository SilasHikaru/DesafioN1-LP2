package enums;

public enum EntidadesDisponiveis {
    USUARIO("usuario"),

    PEDIDO("pedido"),

    PRODUTO("produto"),
    
    CLIENTE("clinete"),
    
    FUNCIONARIO("funcionario");
 
    final private String descricao;
 
    EntidadesDisponiveis(String descricao) {
        this.descricao = descricao;
    }
 
    public String getDescricao() {
        return descricao;
    }
}