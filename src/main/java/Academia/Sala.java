package Academia;

/**
 *
 * @author berna
 */
public class Sala {

    /**
     *
     */
    private String nomeDaSala;

    /**
     *
     */
    private int tipoDaAula;

    /**
     *
     */
    private int numeroDaSala;

    /**
     *
     */
    private int capacidade; // Novo atributo

    // Construtor

    /**
     *
     * @param nomeDaSala
     * @param tipoDaAula
     * @param numeroDaSala
     * @param capacidade
     */
    public Sala(String nomeDaSala, int tipoDaAula, int numeroDaSala, int capacidade) {
        this.nomeDaSala = nomeDaSala;
        this.tipoDaAula = tipoDaAula;
        this.numeroDaSala = numeroDaSala;
        this.capacidade = capacidade; // Inicializa a capacidade
    }

    // Getters

    /**
     *
     * @return
     */
    public String getNomeDaSala() {
        return nomeDaSala;
    }

    /**
     *
     * @return
     */
    public int getTipoDaAula() {
        return tipoDaAula;
    }

    /**
     *
     * @return
     */
    public int getNumeroDaSala() {
        return numeroDaSala;
    }

    /**
     *
     * @return
     */
    public int getCapacidade() { // Novo getter
        return capacidade;
    }

    // Setters

    /**
     *
     * @param nomeDaSala
     */
    public void setNomeDaSala(String nomeDaSala) {
        this.nomeDaSala = nomeDaSala;
    }

    /**
     *
     * @param tipoDaAula
     */
    public void setTipoDaAula(int tipoDaAula) {
        this.tipoDaAula = tipoDaAula;
    }

    /**
     *
     * @param numeroDaSala
     */
    public void setNumeroDaSala(int numeroDaSala) {
        this.numeroDaSala = numeroDaSala;
    }

    /**
     *
     * @param capacidade
     */
    public void setCapacidade(int capacidade) { // Novo setter
        this.capacidade = capacidade;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Sala{" + "nomeDaSala=" + nomeDaSala + ", tipoDaAula=" + tipoDaAula + 
               ", numeroDaSala=" + numeroDaSala + ", capacidade=" + capacidade + '}';
    }
}
