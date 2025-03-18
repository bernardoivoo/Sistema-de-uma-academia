/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Academia;
import java.util.Date;

/**
 *
 * @author berna
 */
public class Aula {

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
    private double preco;

    /**
     *
     */
    private double duracao;

    /**
     *
     */
    private String data;

    // Construtor

    /**
     *
     * @param nome
     * @param id
     * @param preco
     * @param duracao
     * @param data
     */
    public Aula(String nome, int id, double preco, double duracao, String data) {
        this.nome = nome;
        this.id = id;
        this.preco = preco;
        this.duracao = duracao;
        this.data = data;
    }

    // Getters

    /**
     *
     * @return
     */
    public String getNome() {
        return nome;
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
     * @return
     */
    public double getPreco() {
        return preco;
    }

    /**
     *
     * @return
     */
    public double getDuracao() {
        return duracao;
    }

    /**
     *
     * @return
     */
    public String getData() {
        return data;
    }

    /**
     *
     * @param data
     */
    public void setData(String data) {
        this.data = data;
    }

    // Setters

    /**
     *
     * @param nome
     */
    public void setNome(String nome) {
        this.nome = nome;
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
     * @param preco
     */
    public void setPreco(double preco) {
        this.preco = preco;
    }

    /**
     *
     * @param duracao
     */
    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Aula{" + "nome=" + nome + ", id=" + id + ", preco=" + preco + ", duracao=" + duracao + ", data=" + data + '}';
    }
    
    
}

