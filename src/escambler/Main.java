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
public class Main {
    public static void main(String[] args) {
        Usuario joao = new Usuario("Joao Java");
        System.out.println("Nome de login: "+joao.getNome());
        Projeto escambler = new Projeto("Escambler app das opts",joao);
        System.out.println(escambler);
      }
}
 