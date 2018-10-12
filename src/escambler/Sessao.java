/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escambler;
import java.util.Date;
/**
 *
 * @author Garber
 */
public class Sessao {
    private int id_sessao;
    private Usuario usuario;
    private Date data_login;

    /**
     * @return the id_sessao
     */
    public int getId_sessao() {
        return id_sessao;
    }

    /**
     * @param id_sessao the id_sessao to set
     */
    public void setId_sessao(int id_sessao) {
        this.id_sessao = id_sessao;
    }

    /**
     * @return the usuario
     */
    public Usuario getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the data_login
     */
    public Date getData_login() {
        return data_login;
    }

    /**
     * @param data_login the data_login to set
     */
    public void setData_login(Date data_login) {
        this.data_login = data_login;
    }
    
}
