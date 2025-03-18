/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controle;


import Academia.Agendamento;
import Academia.Data;
import Academia.Despesa;
import Academia.Receita;
import Academia.Venda;
import Academia.Vendaplano;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author berna
 */
//Classe responsável por gerenciar balanço
public class Balanço {

    /**
     *
     */
    private List<Despesa> despesas;

    /**
     *
     */
    private List<Receita> receitas;
    

    // Construtor

    /**
     *
     */
    public Balanço() {
        this.despesas = new ArrayList<>();
        this.receitas = new ArrayList<>();
    }
    

    // Método para adicionar uma despesa

    /**
     *
     * @param despesa
     */
    public void adicionarDespesa(Despesa despesa) {
        despesas.add(despesa);
        System.out.println("Despesa adicionada: " + despesa);
    }

   // Método para adicionar receita de uma venda

    /**
     *
     * @param venda
     */
    public void adicionarReceitaVenda(Venda venda) {
        Receita receita = new Receita("Receita de venda do produto: " + venda.getNomeDoProduto(), venda.getValorTotal(), venda.getDataVenda());
        receitas.add(receita);
        System.out.println("Receita de venda adicionada ao balanço.");
    }

       // Método para adicionar receita de uma venda de plano

    /**
     *
     * @param vendaPlano
     */
    public void adicionarReceitaVendaPlano(Vendaplano vendaPlano) {
        Receita receita = new Receita("Receita de venda do plano: " + vendaPlano.getTipoDoPlano(), vendaPlano.getValorTotal(), vendaPlano.getData());
        receitas.add(receita);
        System.out.println("Receita de venda de plano adicionada ao balanço.");
    }
    
    /**
     *
     */
    String nome = "";

    /**
     *
     */
    double preco = 0;

    /**
     *
     */
    Data dataAgendamento;
    
    /**
     *
     * @param agendamento
     */
    public void ReceitaConfirmarPreAgendamento(Agendamento agendamento){
        nome = agendamento.getNomeAluno();
        preco = agendamento.getPreco();
        dataAgendamento = agendamento.getDataAgendamento();
    }
    
    /**
     *
     */
    public void Exibirlista(){
        System.out.println(receitas);
    }
    
    /**
     *
     */
    public void adicionarReceitaConfirmarPreAgendamento() {
        Data dataAgendamento = new Data (30, 10, 2024);
        Receita receitaTeste = new Receita("Receita de Agendamento" + nome, 100.0, dataAgendamento);
        receitas.add(receitaTeste);
        System.out.println("Total de receitas após confirmação : " + receitas);
    }

    
      // Método para calcular o balanço mensal

    /**
     *
     * @param mes
     * @param ano
     * @return
     */
    public double calcularBalancoMensal(int mes, int ano) {
        double totalReceitas = 0.0;
        double totalDespesas = 0.0;

        // Calcular total de receitas no mês especificado
        for (Receita receita : receitas) {
            if (receita.getDataReceita().getMes() == mes && receita.getDataReceita().getAno() == ano) {
                totalReceitas += receita.getValor();
            }
        }

        // Calcular total de despesas no mês especificado
        for (Despesa despesa : despesas) {
            if (despesa.getDatadespesa().getMes() == mes && despesa.getDatadespesa().getAno() == ano) {
                totalDespesas += despesa.getValor();
            }
        }

        // Calcular o balanço
        double balancoMensal = totalReceitas - totalDespesas; 
        System.out.println("Balanço do mês " + mes + "/" + ano + ": " + balancoMensal);
        return balancoMensal;
        
       
    }
    
    // Método para imprimir os dados do balanço mensal

    /**
     *
     * @param mes
     * @param ano
     */
    public void imprimirDadosBalancoMensal(int mes, int ano) {
        double totalReceitas = 0.0;
        double totalDespesas = 0.0;

        System.out.println("Dados do Balanço Mensal - " + mes + "/" + ano);
    
    // Imprimir receitas do mês
         System.out.println("Receitas:");
         for (Receita receita : receitas) {
        if (receita.getDataReceita().getMes() == mes && receita.getDataReceita().getAno() == ano) {
            System.out.println(" - " + receita.getDescricao() + ": R$" + receita.getValor());
            totalReceitas += receita.getValor();
        }
    }

    // Imprimir despesas do mês
    System.out.println("Despesas:");
     for (Despesa despesa : despesas) {
        if (despesa.getDatadespesa().getMes() == mes && despesa.getDatadespesa().getAno() == ano) {
            System.out.println(" - " + despesa.getDescricao() + ": R$" + despesa.getValor());
            totalDespesas += despesa.getValor();
        }
    }

    // Calcular o balanço
    double balancoMensal = totalReceitas - totalDespesas;
    System.out.println("Total de Receitas: R$" + totalReceitas);
    System.out.println("Total de Despesas: R$" + totalDespesas);
    System.out.println("Balanço do mês " + mes + "/" + ano + ": R$" + balancoMensal);
    }


    }
  


