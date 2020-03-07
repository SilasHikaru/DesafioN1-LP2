package estadosConsole;

public enum EnumEstado {
    BEM_VINDO(new EstadoBemVindo()),
    LOGIN (new EstadoLogin()),
    MENU_FUNCIONARIO (new EstadoMenuFuncionario()),
    ESTADO_CRUID (new EstadoCRUID()),
    CADASTRAR(new EstadoCadastrar()),
    ATUALIZAR(new EstadoAtualizar()),
    EXCLUIR(new EstadoExcluir()),
    CONSULTAR(new EstadoConsultar()),
    LISTAR(new EstadoListar());
    
    private final MaquinaEstado estadoMaquina;
    
    EnumEstado(MaquinaEstado estadoMaquina) {
        this.estadoMaquina = estadoMaquina;
    }
    
    public MaquinaEstado getEstadoMaquina() {
        return estadoMaquina;
    }
}