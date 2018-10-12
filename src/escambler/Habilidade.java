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
public class Habilidade {
    private int id_habilidade;
    private String nome_habilidade;
    private String descricao_habilidade;

    /**
     * @return the id_habilidade
     */
    public int getId_habilidade() {
        return id_habilidade;
    }

    /**
     * @param id_habilidade the id_habilidade to set
     */
    public void setId_habilidade(int id_habilidade) {
        this.id_habilidade = id_habilidade;
    }

    /**
     * @return the nome_habilidade
     */
    public String getNome_habilidade() {
        return nome_habilidade;
    }

    /**
     * @param nome_habilidade the nome_habilidade to set
     */
    public void setNome_habilidade(String nome_habilidade) {
        this.nome_habilidade = nome_habilidade;
    }

    /**
     * @return the descricao_habilidade
     */
    public String getDescricao_habilidade() {
        return descricao_habilidade;
    }

    /**
     * @param descricao_habilidade the descricao_habilidade to set
     */
    public void setDescricao_habilidade(String descricao_habilidade) {
        this.descricao_habilidade = descricao_habilidade;
    }
    
}
