package Academia;

/**
 *
 * @author berna
 */
public class Funcionario {

    /**
     *
     */
    private String nome;

    /**
     *
     */
    private int id;

    /**
     *
     */
    private int senha;

    /**
     *
     * @param nome
     * @param id
     * @param senha
     */
    public Funcionario(String nome, int id, int senha) {
        this.nome = nome;
        this.id = id;
        this.senha = senha;
    }

    /**
     *
     * @return
     */
    public String getNome() {
        return nome;
    }

    /**
     *
     * @param nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     *
     * @return
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     *
     * @return
     */
    public int getSenha() {
        return senha;
    }

    /**
     *
     * @param senha
     */
    public void setSenha(int senha) {
        this.senha = senha;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Funcionario{" + "nome=" + nome + ", id=" + id + ", senha=" + senha + '}';
    }

  
}

