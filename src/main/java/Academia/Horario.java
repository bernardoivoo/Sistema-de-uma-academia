package Academia;

/**
 *
 * @author berna
 */
public class Horario {

    /**
     *
     */
    private int dia;

    /**
     *
     */
    private int mes;

    /**
     *
     */
    private int ano;

    /**
     *
     */
    private String horarioEntrada;

    /**
     *
     */
    private String horarioSaida;

    /**
     *
     * @param dia
     * @param mes
     * @param ano
     * @param horarioEntrada
     * @param horarioSaida
     */
    public Horario(int dia, int mes, int ano, String horarioEntrada, String horarioSaida) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.horarioEntrada = horarioEntrada;
        this.horarioSaida = horarioSaida;
    }

    // Getters e Setters

    /**
     *
     * @return
     */
    public int getDia() {
        return dia;
    }

    /**
     *
     * @return
     */
    public int getMes() {
        return mes;
    }

    /**
     *
     * @return
     */
    public int getAno() {
        return ano;
    }

    /**
     *
     * @return
     */
    public String getHorarioEntrada() {
        return horarioEntrada;
    }

    /**
     *
     * @return
     */
    public String getHorarioSaida() {
        return horarioSaida;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Data: " + dia + "/" + mes + "/" + ano + 
               ", Entrada: " + (horarioEntrada != null ? horarioEntrada : "N/A") + 
               ", Saída: " + (horarioSaida != null ? horarioSaida : "N/A");
    }
}
