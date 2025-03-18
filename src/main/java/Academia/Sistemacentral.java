package Academia;

import Controle.Catraca;
import Controle.Balanço;
import Controle.Gerenciaradministrador;
import Controle.Gerenciaraluno;
import Controle.Gerenciarfuncionario;
import Controle.Gerenciarproduto;
import Comparator.Compararvendaid;
import Comparator.ComparatorVendaplanoid;
import Controle.Gerenciaragendamento;
import Gson.Vendasgson;
import Gson.Vendasplanogson;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author berna
 */
public class Sistemacentral {

    /**
     *
     */
    private Gerenciaraluno gestaoaluno;

    /**
     *
     */
    private Gerenciarfuncionario gestaofuncionario;

    /**
     *
     */
    private Gerenciarproduto gestaoproduto;

    /**
     *
     */
    private Gerenciaradministrador gestaoadmin;

    /**
     *
     */
    private Gerenciaragendamento gestaoagenda;

    /**
     *
     */
    private Catraca catraca;

    /**
     *
     */
    private Balanço balanço;

    /**
     *
     */
    private List<Venda> vendas;

    /**
     *
     */
    private List<Vendaplano> vendasPlano;

    /**
     *
     */
    private static int contadorAlunos = 0;

    /**
     *
     */
    protected static int contadoralunos = 0;

    /**
     *
     */
    private static int contadorProdutos = 0;
    

    // Construtor com parâmetros

    /**
     *
     * @param gestaoaluno
     * @param gestaofuncionario
     * @param gestaoproduto
     * @param gestaoadmin
     * @param gestaoagenda
     * @param vendas
     */
    public Sistemacentral(Gerenciaraluno gestaoaluno, Gerenciarfuncionario gestaofuncionario, Gerenciarproduto gestaoproduto, Gerenciaradministrador gestaoadmin, Gerenciaragendamento gestaoagenda, List<Venda> vendas) {
        this.gestaoaluno = gestaoaluno;
        this.gestaofuncionario = gestaofuncionario;
        this.gestaoproduto = gestaoproduto;
        this.gestaoadmin = gestaoadmin;
        this.gestaoagenda = gestaoagenda;
        this.catraca = new Catraca(gestaoaluno);
        this.balanço = new Balanço();
        this.vendas = new ArrayList<>();
        this.vendasPlano = new ArrayList<>();
    }

    /**
     *
     */
    public Sistemacentral() {
        this.gestaoaluno = new Gerenciaraluno();
        this.gestaofuncionario = new Gerenciarfuncionario();
        this.gestaoproduto = new Gerenciarproduto();
        this.gestaoadmin = new Gerenciaradministrador();
        this.gestaoagenda = new Gerenciaragendamento(this.gestaofuncionario, this.gestaoaluno);
        this.catraca = new Catraca(this.gestaoaluno);
        this.balanço = new Balanço();
        this.vendas = new ArrayList<>();
        this.vendasPlano = new ArrayList<>();
    }

    // Getters e Setters para acessar ou modificar as listas

    /**
     *
     * @return
     */

    public Balanço getBalanço() {
        return balanço;
    }

    /**
     *
     * @param balanço
     */
    public void setBalanço(Balanço balanço) {
        this.balanço = balanço;
    }
    
    /**
     *
     * @return
     */
    public Catraca getCatraca() {
        return catraca;
    }

    /**
     *
     * @return
     */
    public List<Venda> getVendas() {
        return vendas;
    }

    /**
     *
     * @param vendas
     */
    public void setVendas(List<Venda> vendas) {
        this.vendas = vendas;
    }

    /**
     *
     * @return
     */
    public Gerenciaragendamento getGestaoagenda() {
        return gestaoagenda;
    }

    /**
     *
     * @param gestaoagenda
     */
    public void setGestaoagenda(Gerenciaragendamento gestaoagenda) {
        this.gestaoagenda = gestaoagenda;
    }

    /**
     *
     * @return
     */
    public Gerenciarproduto getGestaoproduto() {
        return gestaoproduto;
    }

    /**
     *
     * @param gestaoproduto
     */
    public void setGestaoproduto(Gerenciarproduto gestaoproduto) {
        this.gestaoproduto = gestaoproduto;
    }

    /**
     *
     * @return
     */
    public Gerenciarfuncionario getGestaofuncionario() {
        return gestaofuncionario;
    }

    /**
     *
     * @param gestaoaluno
     */
    public void setGestaoaluno(Gerenciaraluno gestaoaluno) {
        this.gestaoaluno = gestaoaluno;
    }

    /**
     *
     * @param gestaofuncionario
     */
    public void setGestaofuncionario(Gerenciarfuncionario gestaofuncionario) {
        this.gestaofuncionario = gestaofuncionario;
    }

    /**
     *
     * @return
     */
    public Gerenciaraluno getGestaoaluno() {
        return gestaoaluno;
    }

    /**
     *
     * @return
     */
    public Gerenciaradministrador getGestaoadmin() {
        return gestaoadmin;
    }

    /**
     *
     * @param gestaoadmin
     */
    public void setGestaoadmin(Gerenciaradministrador gestaoadmin) {
        this.gestaoadmin = gestaoadmin;
    }
    
    /**
     *
     */
    public void salvarVendas(){
        Vendasgson.salvarVendas(vendas);
    }
     
    /**
     *
     */
    public void salvarVendasplano(){
         Vendasplanogson.salvarVendas(vendasPlano);
     }
     
    //Questão 10:

    /**
     *
     * @param id
     * @param cpfAnonimo
     * @param produtoId
     * @param quantidade
     * @param dataVenda
     */
    public void realizarVenda(int id, int cpfAnonimo, int produtoId, int quantidade, Data dataVenda) {
    // Busca o aluno pelo CPF
    Aluno aluno = this.gestaoaluno.buscarAluno(cpfAnonimo);
    if (aluno == null) {
        System.out.println("Aluno não encontrado. Verifique o CPF.");
        return;
    }

    // Busca o produto pelo ID
    Produto produto = this.gestaoproduto.buscarProduto(produtoId);
    if (produto == null) {
        System.out.println("Produto não encontrado. Verifique o ID.");
        return;
    }

    // Verifica se há quantidade suficiente no estoque
    if (produto.getQuantidade() < quantidade) {
        System.out.println("Estoque insuficiente para o produto: " + produto.getNomeDoProduto());
        return;
    }

    // Realiza a venda e atualiza o estoque do produto
    produto.setQuantidade(produto.getQuantidade() - quantidade);
    System.out.println("Venda realizada com sucesso para o aluno: " + aluno.getNomeAluno());
    System.out.println("Produto vendido: " + produto.getNomeDoProduto() + " | Quantidade: " + quantidade +  " | Valor total: "
            + produto.getValor() +  " | Data da venda: " + dataVenda);

    // Registra a venda
    double valorTotal = quantidade * produto.getValor();
    Venda venda = new Venda(id, produtoId, produto.getNomeDoProduto(), produto.getCategoria(), dataVenda, valorTotal);
    
    // Armazena a venda na lista
    vendas.add(venda);
    System.out.println("Venda registrada com sucesso.");
    
    // Adiciona receita à lista de receitas
    balanço.adicionarReceitaVenda(venda);
  
    
}

    // Método para realizar venda de plano

    /**
     *
     * @param id
     * @param cpfAnonimo
     * @param tipoDoPlano
     * @param valorTotal
     * @param dataVendaplano
     */
    public void realizarVendaPlano(int id, int cpfAnonimo, String tipoDoPlano, double valorTotal, Data dataVendaplano) {
    // Busca o aluno pelo CPF anônimo
    Aluno aluno = this.gestaoaluno.buscarAluno(cpfAnonimo);
    if (aluno == null) {
        System.out.println("Aluno não encontrado. Verifique o CPF.");
        return;
    }

    // Realiza a venda do plano
    System.out.println("Venda de plano realizada com sucesso para o aluno: " + aluno.getNomeAluno());
    System.out.println("Tipo do Plano: " + tipoDoPlano + " | Valor: " + valorTotal);

    // Registra a venda do plano
    Vendaplano vendaPlano = new Vendaplano(id, cpfAnonimo, tipoDoPlano, valorTotal, dataVendaplano);
    
    // Armazena a venda do plano na lista
    vendasPlano.add(vendaPlano);
    System.out.println("Venda do plano registrada com sucesso.");
    System.out.println("Data da venda do plano: " + dataVendaplano);
    
     // Adiciona receita à lista de receitas
     balanço.adicionarReceitaVendaPlano(vendaPlano);
   

}
    

    
    // Método para buscar e imprimir dados de uma venda específica
    // Questão 8:

    /**
     *
     * @param idVenda
     */
    public void imprimirDadosVenda(int idVenda) {
    // Criar uma venda para busca, incluindo o idVenda e um valor total de 0
    Venda vendaBusca = new Venda(idVenda, 0, null, null, null, 0);
    int index = Collections.binarySearch(vendas, vendaBusca, new Compararvendaid());

    if (index >= 0) {
        System.out.println("Dados da Venda:");
        System.out.println(vendas.get(index));
    } else {
        System.out.println("Venda não encontrada.");
    }
    }

    // Método para buscar e imprimir dados de uma venda de plano específica

    /**
     *
     * @param idVendaPlano
     */
    public void imprimirDadosVendaPlano(int idVendaPlano) {
    // Criar uma venda de plano para busca, incluindo o idVendaPlano e um cpfAnonimo de 0
    Vendaplano vendaPlanoBusca = new Vendaplano(idVendaPlano, 0, null, 0, null);
    int index = Collections.binarySearch(vendasPlano, vendaPlanoBusca, new ComparatorVendaplanoid());

    if (index >= 0) {
        System.out.println("Dados da Venda do Plano:");
        System.out.println(vendasPlano.get(index));
    } else {
        System.out.println("Venda do plano não encontrada.");
    }
    }
   
    
    //Questões 11 e 12:
   // Método para incrementar o contador ao criar um novo Aluno

    /**
     *
     */
    public static void incrementarContadorAlunos() {
        contadorAlunos++;
    }

    // Método para obter o número de instâncias de Aluno

    /**
     *
     * @return
     */
    public static int getContadorAlunos() {
        return contadorAlunos;
    }
    
     // Método para incrementar o contador ao criar um novo Aluno

    /**
     *
     */
    protected static void incrementarContadoralunos() {
        contadorAlunos++;
    }

    // Método para obter o número de instâncias de Aluno

    /**
     *
     * @return
     */
    public static int getContadoralunos() {
        return contadorAlunos;
    }
    
    // Método para incrementar o contador ao criar um novo Aluno

    /**
     *
     */
    public static void incrementarContadorProdutos() {
        contadorProdutos++;
    }

    // Método para obter o número de instâncias de Aluno

    /**
     *
     * @return
     */
    public static int getContadorProdutos() {
        return contadorProdutos;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Sistemacentral{" + "gestaoaluno=" + gestaoaluno + ", gestaofuncionario=" + gestaofuncionario + ", gestaoproduto=" + gestaoproduto + ", gestaoadmin=" + gestaoadmin + ", gestaoagenda=" + gestaoagenda + ", catraca=" + catraca + ", balan\u00e7o=" + balanço + ", vendas=" + vendas + ", vendasPlano=" + vendasPlano + '}';
    }

   


    }
    
 
