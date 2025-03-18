package Academia;

import java.util.Date;

/**
 *
 * @author berna
 */
public class Produto {

    /**
     *
     */
    private String nomeDoProduto;

    /**
     *
     */
    private String categoria;

    /**
     *
     */
    private double valor;

    /**
     *
     */
    private int id;

    /**
     *
     */
    private int quantidade; // Alterado para int

    // Construtor

    /**
     *
     * @param nomeDoProduto
     * @param categoria
     * @param valor
     * @param id
     * @param quantidade
     */
    public Produto(String nomeDoProduto, String categoria, double valor, int id, int quantidade) {
        this.nomeDoProduto = nomeDoProduto;
        this.categoria = categoria;
        this.valor = valor;
        this.id = id;
        this.quantidade = quantidade;
        Sistemacentral.incrementarContadorProdutos();
    }

    // Getters

    /**
     *
     * @return
     */
    public String getNomeDoProduto() {
        return nomeDoProduto;
    }

    /**
     *
     * @return
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     *
     * @return
     */
    public double getValor() {
        return valor;
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
    public int getQuantidade() {
        return quantidade;
    }

    // Setters

    /**
     *
     * @param nomeDoProduto
     */
    public void setNomeDoProduto(String nomeDoProduto) {
        this.nomeDoProduto = nomeDoProduto;
    }

    /**
     *
     * @param categoria
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /**
     *
     * @param valor
     */
    public void setValor(double valor) {
        this.valor = valor;
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
     * @param quantidade
     */
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Produto{" + "nomeDoProduto=" + nomeDoProduto + ", categoria=" + categoria + ", valor=" + valor + ", id=" + id + ", quantidade=" + quantidade + '}';
    }
    
    
}
