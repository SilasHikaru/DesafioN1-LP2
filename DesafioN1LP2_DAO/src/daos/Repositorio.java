package daos;

import enums.EntidadesDisponiveis;
import basis.Entidade;
import java.util.ArrayList;

public abstract class Repositorio {
    public abstract Entidade localizar(String codigo, EntidadesDisponiveis tipoEntidade);
    public abstract ArrayList<Entidade> listar(EntidadesDisponiveis tipoEntidade);
    public abstract Entidade selecionar(int id, EntidadesDisponiveis tipoEntidade);
    public abstract void atualizar(Entidade entidade, EntidadesDisponiveis tipoEntidade);
    public abstract void cadastrar(Entidade entidade, EntidadesDisponiveis tipoEntidade);
    public abstract void deletar(int id, EntidadesDisponiveis tipoEntidade);
}
