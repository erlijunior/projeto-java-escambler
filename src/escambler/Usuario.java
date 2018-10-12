
package escambler;
import java.util.ArrayList;

/**
 *
 * @author Garber
 */
public class Usuario {
   private int id_usuario;
    private String nome;
    private String login;
    private String email;
    private String password;
    private String confirma_password;
    private String bio;
    private Habilidade habilidade_usuario;
    private ArrayList disciplinas;

    public Usuario(String nome) {
        this.nome = nome;
    }
    
    
    
    /**
     * @return the id_usuario
     */
    public int getId_usuario() {
        return id_usuario;
    }

    /**
     * @param id_usuario the id_usuario to set
     */
    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
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
     * @return the login
     */
    public String getLogin() {
        return login;
    }

    /**
     * @param login the login to set
     */
    public void setLogin(String login) {
        this.login = login;
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
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the confirma_password
     */
    public String getConfirma_password() {
        return confirma_password;
    }

    /**
     * @param confirma_password the confirma_password to set
     */
    public void setConfirma_password(String confirma_password) {
        this.confirma_password = confirma_password;
    }

    /**
     * @return the bio
     */
    public String getBio() {
        return bio;
    }

    /**
     * @param bio the bio to set
     */
    public void setBio(String bio) {
        this.bio = bio;
    }

    /**
     * @return the habilidade_usuario
     */
    public Habilidade getHabilidade_usuario() {
        return habilidade_usuario;
    }

    /**
     * @param habilidade_usuario the habilidade_usuario to set
     */
    public void setHabilidade_usuario(Habilidade habilidade_usuario) {
        this.habilidade_usuario = habilidade_usuario;
    }

    /**
     * @return the disciplinas
     */
    public ArrayList getDisciplinas() {
        return disciplinas;
    }

    /**
     * @param disciplinas the disciplinas to set
     */
    public void setDisciplinas(ArrayList disciplinas) {
        this.disciplinas = disciplinas;
    }
    @Override
   public String toString(){
       return  this.nome;
   } 
}
