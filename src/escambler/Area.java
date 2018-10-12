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
public class Area {
    private int id_area;
    private String nome;
    private String descricao;

    /**
     * @return the id_area
     */
    public int getId_area() {
        return id_area;
    }

    /**
     * @param id_area the id_area to set
     */
    public void setId_area(int id_area) {
        this.id_area = id_area;
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
    
}
