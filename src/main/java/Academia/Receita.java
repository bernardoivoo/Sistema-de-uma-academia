/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Academia;

/**
 *
 * @author berna
 */


public class Receita {

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
    private Data dataReceita;

    // Construtor

    /**
     *
     * @param descricao
     * @param valor
     * @param dataReceita
     */
    public Receita(String descricao, double valor, Data dataReceita) {
        this.descricao = descricao;
        this.valor = valor;
        this.dataReceita = dataReceita;
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
     * @param descricao
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
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
     * @param valor
     */
    public void setValor(double valor) {
        this.valor = valor;
    }

    /**
     *
     * @return
     */
    public Data getDataReceita() {
        return dataReceita;
    }

    /**
     *
     * @param dataReceita
     */
    public void setDataReceita(Data dataReceita) {
        this.dataReceita = dataReceita;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Receita{" + "descricao=" + descricao + ", valor=" + valor + ", dataReceita=" + dataReceita + '}';
    }

   
    
    

    
}