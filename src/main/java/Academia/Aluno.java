/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Academia;

/**
 *
 * @author berna
 */
public class Aluno {

    /**
     *
     */
    private String nomeAluno;

    /**
     *
     */
    private String endereco;

    /**
     *
     */
    private String telefone;

    /**
     *
     */
    private String email;

    /**
     *
     */
    private int cpfAnonimo;

    /**
     *
     * @param nomeAluno
     * @param endereco
     * @param telefone
     * @param email
     * @param cpfAnonimo
     */
    public Aluno(String nomeAluno, String endereco, String telefone, String email, int cpfAnonimo) {
        this.nomeAluno = nomeAluno;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.cpfAnonimo = cpfAnonimo;
        Sistemacentral.incrementarContadorAlunos();
    }

    /**
     *
     * @return
     */
    public String getNomeAluno() {
        return nomeAluno;
    }

    /**
     *
     * @param nomeAluno
     */
    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    /**
     *
     * @return
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     *
     * @param endereco
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     *
     * @return
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     *
     * @param telefone
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     *
     * @return
     */
    public String getEmail() {
        return email;
    }

    /**
     *
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     *
     * @return
     */
    public int getCpfAnonimo() {
        return cpfAnonimo;
    }

    /**
     *
     * @param cpfAnonimo
     */
    public void setCpfAnonimo(int cpfAnonimo) {
        this.cpfAnonimo = cpfAnonimo;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Aluno{" + "nomeAluno=" + nomeAluno + ", endereco=" + endereco + ", telefone=" + telefone + ", email=" + email + ", cpfAnonimo=" + cpfAnonimo + '}';
    }
    
    

}



