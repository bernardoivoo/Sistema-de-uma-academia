package Academia;

/**
 *
 * @author berna
 */
public class Agendamento {

    /**
     *
     */
    private String nomeAluno;

    /**
     *
     */
    private int aulaId;

    /**
     *
     */
    private Data dataAgendamento;

    /**
     *
     */
    private double preco;

    /**
     *
     */
    private String numeroCartaoCredito;

    /**
     *
     */
    private String funcionario;

    /**
     *
     */
    private int numeroSala; 

    // Construtor atualizado

    /**
     *
     * @param nomeAluno
     * @param aulaId
     * @param dataAgendamento
     * @param preco
     * @param numeroCartaoCredito
     * @param funcionario
     * @param numeroSala
     */
    public Agendamento(String nomeAluno, int aulaId, Data dataAgendamento, 
                       double preco, String numeroCartaoCredito, String funcionario, int numeroSala) {
        this.nomeAluno = nomeAluno;
        this.aulaId = aulaId;
        this.dataAgendamento = dataAgendamento;
        this.preco = preco;
        this.numeroCartaoCredito = numeroCartaoCredito;
        this.funcionario = funcionario;
        this.numeroSala = numeroSala; 
    }

    // Getters e Setters

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
    public int getAulaId() {
        return aulaId;
    }

    /**
     *
     * @param aulaId
     */
    public void setAulaId(int aulaId) {
        this.aulaId = aulaId;
    }

    /**
     *
     * @return
     */
    public Data getDataAgendamento() {
        return dataAgendamento;
    }

    /**
     *
     * @param dataAgendamento
     */
    public void setDataAgendamento(Data dataAgendamento) {
        this.dataAgendamento = dataAgendamento;
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
     * @param preco
     */
    public void setPreco(double preco) {
        this.preco = preco;
    }

    /**
     *
     * @return
     */
    public String getNumeroCartaoCredito() {
        return numeroCartaoCredito;
    }

    /**
     *
     * @param numeroCartaoCredito
     */
    public void setNumeroCartaoCredito(String numeroCartaoCredito) {
        this.numeroCartaoCredito = numeroCartaoCredito;
    }

    /**
     *
     * @return
     */
    public String getFuncionario() {
        return funcionario;
    }

    /**
     *
     * @param funcionario
     */
    public void setFuncionario(String funcionario) {
        this.funcionario = funcionario;
    }

    /**
     *
     * @return
     */
    public int getNumeroSala() {
        return numeroSala; // Getter para o número da sala
    }

    /**
     *
     * @param numeroSala
     */
    public void setNumeroSala(int numeroSala) {
        this.numeroSala = numeroSala; // Setter para o número da sala
    }

    // toString atualizado para incluir o número da sala

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Agendamento{" +
                "nomeAluno='" + nomeAluno + '\'' +
                ", aulaId=" + aulaId +
                ", dataAgendamento=" + dataAgendamento +
                ", preco=" + preco +
                ", numeroCartaoCredito='" + numeroCartaoCredito + '\'' +
                ", funcionario='" + funcionario + '\'' +
                ", numeroSala=" + numeroSala +
                '}';
    }
}
