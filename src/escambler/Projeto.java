/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escambler;

/**
 *
 * @author Garber
 */
public class Projeto {
    private int id_projeto;
    private String nome;
    private String email;
    private String descricao;
    private int qtde_usuarios;
    private Area area_projeto;
    private Usuario idealizador;

    public Projeto(String nome, Usuario idealizador) {
        this.nome = nome;
        this.idealizador = idealizador;
    }
    
    
    
    /**
     * @return the id_projeto
     */
    public int getId_projeto() {
        return id_projeto;
    }

    /**
     * @param id_projeto the id_projeto to set
     */
    public void setId_projeto(int id_projeto) {
        this.id_projeto = id_projeto;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the qtde_usuarios
     */
    public int getQtde_usuarios() {
        return qtde_usuarios;
    }

    /**
     * @param qtde_usuarios the qtde_usuarios to set
     */
    public void setQtde_usuarios(int qtde_usuarios) {
        this.qtde_usuarios = qtde_usuarios;
    }

    /**
     * @return the area_projeto
     */
    public Area getArea_projeto() {
        return area_projeto;
    }

    /**
     * @param area_projeto the area_projeto to set
     */
    public void setArea_projeto(Area area_projeto) {
        this.area_projeto = area_projeto;
    }

    /**
     * @return the idealizador
     */
    public Usuario getIdealizador() {
        return idealizador;
    }

    /**
     * @param idealizador the idealizador to set
     */
    public void setIdealizador(Usuario idealizador) {
        this.idealizador = idealizador;
    }
    
    @Override
   public String toString(){
       return  "Nome do Projeto: "+this.nome+"\nNome do Idealizador: "+this.idealizador;
   } 
}
