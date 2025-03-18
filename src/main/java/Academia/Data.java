package Academia;

/**
 *
 * @author berna
 */
public class Data {

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

    // Construtor

    /**
     *
     * @param dia
     * @param mes
     * @param ano
     */
    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    // Getters

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

    // Método para exibir a data no formato DD/MM/AAAA

    /**
     *
     * @return
     */
    public String formatarData() {
        return String.format("%02d/%02d/%04d", dia, mes, ano);
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return formatarData();
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Data data = new Data(30, 10, 2024);
        System.out.println("Data: " + data);
    }
}

