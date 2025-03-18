package Academia;

/**
 *
 * @author berna
 */
public class Vendaplano {

    /**
     *
     */
    private int id; // Identificador da venda do plano

    /**
     *
     */
    private int cpfAnonimo; // CPF anônimo do aluno

    /**
     *
     */
    private String tipoDoPlano; // Tipo do plano vendido

    /**
     *
     */
    private double valorTotal; // Valor total da venda do plano

    /**
     *
     */
    private Data data; // Data da venda

    // Construtor

    /**
     *
     * @param id
     * @param cpfAnonimo
     * @param tipoDoPlano
     * @param valorTotal
     * @param data
     */
    public Vendaplano(int id, int cpfAnonimo, String tipoDoPlano, double valorTotal, Data data) {
        this.id = id;
        this.cpfAnonimo = cpfAnonimo;
        this.tipoDoPlano = tipoDoPlano;
        this.valorTotal = valorTotal;
        this.data = data;
    }

    // Getters e Setters

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
    public String getTipoDoPlano() {
        return tipoDoPlano;
    }

    /**
     *
     * @param tipoDoPlano
     */
    public void setTipoDoPlano(String tipoDoPlano) {
        this.tipoDoPlano = tipoDoPlano;
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
    public Data getData() {
        return data;
    }

    /**
     *
     * @param data
     */
    public void setData(Data data) {
        this.data = data;
    }

    // Método para exibir as informações da venda do plano

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "VendaPlano [ID: " + id + ", CPF Anônimo: " + cpfAnonimo + ", Tipo do Plano: " + tipoDoPlano +
                ", Valor Total: " + valorTotal + ", Data: " + data + "]";
    }
}
