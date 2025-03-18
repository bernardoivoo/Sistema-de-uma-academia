package Academia;

/**
 *
 * @author berna
 */
public class Venda {

    /**
     *
     */
    private int id; // Identificador da venda

    /**
     *
     */
    private int produtoId; // ID do produto vendido

    /**
     *
     */
    private String nomeDoProduto; // Nome do produto

    /**
     *
     */
    private String categoriaDaVenda; // Categoria da venda

    /**
     *
     */
    private Data dataVenda; // Data da venda

    /**
     *
     */
    private double valorTotal; // Valor total da venda

    /**
     *
     * @param id
     * @param produtoId
     * @param nomeDoProduto
     * @param categoriaDaVenda
     * @param dataVenda
     * @param valorTotal
     */
    public Venda(int id, int produtoId, String nomeDoProduto, String categoriaDaVenda, Data dataVenda, double valorTotal) {
        this.id = id;
        this.produtoId = produtoId;
        this.nomeDoProduto = nomeDoProduto;
        this.categoriaDaVenda = categoriaDaVenda;
        this.dataVenda = dataVenda;
        this.valorTotal = valorTotal;
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
    public int getProdutoId() {
        return produtoId;
    }

    /**
     *
     * @param produtoId
     */
    public void setProdutoId(int produtoId) {
        this.produtoId = produtoId;
    }

    /**
     *
     * @return
     */
    public String getNomeDoProduto() {
        return nomeDoProduto;
    }

    /**
     *
     * @param nomeDoProduto
     */
    public void setNomeDoProduto(String nomeDoProduto) {
        this.nomeDoProduto = nomeDoProduto;
    }

    /**
     *
     * @return
     */
    public String getCategoriaDaVenda() {
        return categoriaDaVenda;
    }

    /**
     *
     * @param categoriaDaVenda
     */
    public void setCategoriaDaVenda(String categoriaDaVenda) {
        this.categoriaDaVenda = categoriaDaVenda;
    }

    /**
     *
     * @return
     */
    public Data getDataVenda() {
        return dataVenda;
    }

    /**
     *
     * @param dataVenda
     */
    public void setDataVenda(Data dataVenda) {
        this.dataVenda = dataVenda;
    }

    /**
     *
     * @return
     */
    public double getValorTotal() {
        return valorTotal;
    }

    /**
     *
     * @param valorTotal
     */
    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Venda{" + "id=" + id + ", produtoId=" + produtoId + ", nomeDoProduto=" + nomeDoProduto + ", categoriaDaVenda=" + categoriaDaVenda + ", dataVenda=" + dataVenda + ", valorTotal=" + valorTotal + '}';
    }
    
    
}
