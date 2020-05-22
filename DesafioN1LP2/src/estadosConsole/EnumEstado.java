package estadosConsole;

public enum EnumEstado {
    ATUALIZAR(new EstadoAtualizar()),
    BEM_VINDO(new EstadoBemVindo()),
    CADASTRAR(new EstadoCadastrar()),
    CONSULTAR(new EstadoConsultar()),
    ESTADO_CRUID (new EstadoCRUID()),
    EXCLUIR(new EstadoExcluir()),
    LISTAR(new EstadoListar()),
    LOGIN (new EstadoLogin()),
    MENU_FUNCIONARIO (new EstadoMenuFuncionario()),;
    
    private final MaquinaEstado estadoMaquina;
    
    EnumEstado(MaquinaEstado estadoMaquina) {
        this.estadoMaquina = estadoMaquina;
    }
    
    public MaquinaEstado getEstadoMaquina() {
        return estadoMaquina;
    }
}
