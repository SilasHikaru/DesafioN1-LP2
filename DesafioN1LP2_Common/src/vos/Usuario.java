/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vos;
import basis.Entidade;
/**
 *
 * @author cliente
 */
public class Usuario extends Entidade{
    
    private String senha;
    private String login;
    private String tipo;
    
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getLogin() {
        return  login;
    }
    
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
