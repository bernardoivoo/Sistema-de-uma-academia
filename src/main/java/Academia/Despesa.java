/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Academia;

/**
 *
 * @author berna
 */
public class Despesa {

    /**
     *
     */
    private String descricao;

    /**
     *
     */
    private double valor;

    /**
     *
     */
    private Data datadespesa;

    // Construtor

    /**
     *
     * @param descricao
     * @param valor
     * @param datadespesa
     */
    public Despesa(String descricao, double valor, Data datadespesa) {
        this.descricao = descricao;
        this.valor = valor;
        this.datadespesa = datadespesa;
    }

    // Getters

    /**
     *
     * @return
     */
    public String getDescricao() {
        return descricao;
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
    public Data getDatadespesa() {
        return datadespesa;
    }

    /**
     *
     * @param datadespesa
     */
    public void setDatadespesa(Data datadespesa) {
        this.datadespesa = datadespesa;
    }

   

    // Setters

    /**
     *
     * @param descricao
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
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
     * @return
     */
    @Override
    public String toString() {
        return "Despesa{" + "descricao=" + descricao + ", valor=" + valor + ", datadespesa=" + datadespesa + '}';
    }

  
    
}

