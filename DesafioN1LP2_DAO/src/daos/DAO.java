package daos;

import basis.Entidade;
import java.sql.SQLException;
import java.util.ArrayList;

public abstract class DAO <E extends Entidade> {
    protected Class<E> entityClass;

    public DAO(Class<E> entityClass) {
        this.entityClass = entityClass;
    }

    public abstract ArrayList<E> listar() throws SQLException;
    public abstract E localizar(String codigo) throws SQLException;
    public abstract E selecionar(int id);
    public abstract void atualizar(E entidade);
    public abstract void cadastrar(Entidade entidade);
    public abstract void deletar(int id) throws SQLException;

    protected E getInstanceOfE() {
        try {
            return entityClass.newInstance();
        } catch (IllegalAccessException | InstantiationException e) {
            throw new RuntimeException(e);
        }
    }
}
