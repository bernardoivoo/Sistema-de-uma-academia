/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controle;

/**
 *
 * @author berna
 */

import Academia.Agendamento;
import Academia.Funcionario;
import Academia.Aluno;
import Academia.Data;
import Academia.Receita;
import Academia.Sala;
import Academia.Vendaplano;
import Academia.Venda;
import Comparator.CompararAgendamentoId;
import Gson.Agendamentogson;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author berna
 */

//Classe responsável por gerenciar agendamentos
public class Gerenciaragendamento {

    /**
     *
     */
    private List<Agendamento> agendamentos;

    /**
     *
     */
    private Gerenciarfuncionario gerenciarFuncionario;

    /**
     *
     */
    private Gerenciaraluno gerenciarAluno;

    /**
     *
     */
    private Balanço balanço; // Adiciona uma referência ao Balanço


    // Construtor que recebe as instâncias de Gerenciarfuncionario e Gerenciaraluno

    /**
     *
     * @param gerenciarFuncionario
     * @param gerenciarAluno
     */
    public Gerenciaragendamento(Gerenciarfuncionario gerenciarFuncionario, Gerenciaraluno gerenciarAluno) {
        this.agendamentos = new ArrayList<>();
        this.gerenciarFuncionario = gerenciarFuncionario;
        this.gerenciarAluno = gerenciarAluno;
        this.balanço = new Balanço(); // Inicializa o Balanço
    }
    
    /**
     *
     */
    public void Exibiragendamento() {
        System.out.println(agendamentos);
    }
    
    /**
     *
     */
    public void salvarAgendamento(){
        Agendamentogson.salvarAgendamento(agendamentos);
    }

    /**
     *
     * @param dataAgendamento
     * @param numeroSala
     * @return
     */
    public boolean buscarVagaNaAgenda(Data dataAgendamento, int numeroSala) {
    // Ordena a lista de agendamentos pela data e sala antes de fazer a busca
    Collections.sort(agendamentos, new CompararAgendamentoId());
    
    int count = 0;
    // Conta o número de agendamentos para a mesma sala e data
    for (Agendamento agendamento : agendamentos) {
        if (agendamento.getDataAgendamento().equals(dataAgendamento) && 
            agendamento.getNumeroSala() == numeroSala) {
            count++;
        }
    }
    
    // Busca a sala pelo número
    Sala sala = Gerenciarsalas.buscarSalaPorNumero(numeroSala);
    if (sala == null) {
        System.out.println("Sala não encontrada.");
        return false; // Retorna false se a sala não for encontrada
    }
    
    // Verifica se a capacidade da sala já foi atingida
    return count < sala.getCapacidade();
}

    /**
     *
     * @param cpfAnonimoAluno
     * @param idFuncionario
     * @param numeroSala
     * @param idAula
     * @param dataAgendamento
     * @param preco
     * @param numeroCartaoCredito
     */
    public void realizarPreAgendamento(int cpfAnonimoAluno, int idFuncionario, int numeroSala, int idAula, Data dataAgendamento, 
                                   double preco, String numeroCartaoCredito) {
   
    // Busca o aluno pelo CPF anônimo
    Aluno aluno = gerenciarAluno.buscarAluno(cpfAnonimoAluno);
    if (aluno == null) {
        System.out.println("Aluno não encontrado.");
        return;
    }

    // Busca o funcionário pelo ID
    Funcionario funcionario = gerenciarFuncionario.buscarFuncionario(idFuncionario);
    if (funcionario == null) {
        System.out.println("Funcionário não encontrado.");
        return;
    }

    // Busca a sala pelo número
    Sala sala = Gerenciarsalas.buscarSalaPorNumero(numeroSala);
    if (sala == null) {
        System.out.println("Sala não encontrada.");
        return;
    }

    // Verifica se há vaga na agenda antes de realizar o agendamento
    boolean vagaDisponivel = buscarVagaNaAgenda(dataAgendamento, numeroSala);
    if (!vagaDisponivel) {
        System.out.println("Não há vagas disponíveis para esta sala na data informada.");
        return; // Se não houver vaga, retorna sem realizar o agendamento
    }

    // Cria um novo agendamento com as informações fornecidas
    Agendamento novoAgendamento = new Agendamento(
        aluno.getNomeAluno(),
        idAula,  // Agora passando o idAula corretamente
        dataAgendamento,
        preco,
        numeroCartaoCredito,
        funcionario.getNome(),
        sala.getNumeroDaSala() // Adicionando o número da sala
    );

    // Adiciona o agendamento à lista de agendamentos
    agendamentos.add(novoAgendamento);
    System.out.println("Pré-agendamento realizado com sucesso para o aluno: " + aluno.getNomeAluno() + 
                       ", Instrutor escolhido: " + funcionario.getNome() + 
                       ", Sala: " + sala.getNumeroDaSala() + 
                       ", Data: " + dataAgendamento + 
                       ", Aula ID: " + idAula); // Adicionando o aulaId na impressão
}

    /**
     *
     * @param cpfAnonimoAluno
     * @param idFuncionario
     * @param numeroSala
     * @param idAula
     * @param dataAgendamento
     * @param preco
     * @param numeroCartaoCredito
     */
    public void confirmarPreAgendamento(int cpfAnonimoAluno, int idFuncionario, int numeroSala, int idAula, Data dataAgendamento, 
                                     double preco, String numeroCartaoCredito) {
    // Busca o aluno pelo CPF anônimo
    Aluno aluno = gerenciarAluno.buscarAluno(cpfAnonimoAluno);
    if (aluno == null) {
        System.out.println("Aluno não encontrado.");
        return;
    }

    // Busca o funcionário pelo ID
    Funcionario funcionario = gerenciarFuncionario.buscarFuncionario(idFuncionario);
    if (funcionario == null) {
        System.out.println("Funcionário não encontrado.");
        return;
    }

    // Busca a sala pelo número
    Sala sala = Gerenciarsalas.buscarSalaPorNumero(numeroSala);
    if (sala == null) {
        System.out.println("Sala não encontrada.");
        return;
    }

    // Tenta localizar o pré-agendamento com base nas informações fornecidas
    Agendamento agendamentoExistente = null;
    for (Agendamento agendamento : agendamentos) {
        if (agendamento.getNomeAluno().equals(aluno.getNomeAluno()) &&
            agendamento.getAulaId() == idAula &&  // Comparando o idAula corretamente
            agendamento.getDataAgendamento().equals(dataAgendamento) &&
            agendamento.getFuncionario().equals(funcionario.getNome())) {
            agendamentoExistente = agendamento;
            break;
        }
    }

    if (agendamentoExistente != null) {
        // Confirma o agendamento
        System.out.println("Agendamento confirmado com sucesso para o aluno: " + aluno.getNomeAluno() + 
                           ", Instrutor: " + funcionario.getNome() + 
                           ", Sala: " + sala.getNomeDaSala() + 
                           ", Data: " + dataAgendamento + 
                           ", Preço: R$" + preco + 
                           ", Aula ID: " + agendamentoExistente.getAulaId()); // Imprimindo Aula ID
        // Salvar na lista de receita usando o método do Balanço
        if (this.balanço != null) { // Verifique se balanço foi inicializado
            balanço.ReceitaConfirmarPreAgendamento(agendamentoExistente);
        } else {
            System.out.println("Erro: Balanço não inicializado.");
        }
    } else {
        System.out.println("Pré-agendamento não encontrado para confirmação.");
    }
}

    // Método auxiliar para buscar um agendamento pela aulaId usando busca binária

    /**
     *
     * @param aulaId
     * @return
     */
    public Agendamento buscarAgendamento(int aulaId) {
    // Ordena a lista de agendamentos pelo aulaId antes da busca
    Collections.sort(agendamentos, new CompararAgendamentoId());
    // Criando um agendamento temporário com o aulaId
    Agendamento agendamentoBusca = new Agendamento(null, aulaId, null, 0, null, null, 0); 
    // Usando a busca binária com o CompararAgendamentoId
    int index = Collections.binarySearch(agendamentos, agendamentoBusca, new CompararAgendamentoId());

    // Verificando se o agendamento foi encontrado na lista
    if (index >= 0) {
        return agendamentos.get(index); // Retorna o agendamento encontrado
    } else {
        return null; // Retorna null se o agendamento não for encontrado
    }
}

    /**
     *
     * @param aulaId
     */
    public void desmarcarAgendamento(int aulaId) {
    // Busca o agendamento pelo ID
    Agendamento agendamento = buscarAgendamento(aulaId);

    if (agendamento != null) {
        // Remove o agendamento da lista de agendamentos
        agendamentos.remove(agendamento);
        System.out.println("Agendamento desmarcado com sucesso: " + agendamento.getNomeAluno() + 
                           ", Id da aula: " + agendamento.getAulaId() + 
                           ", Data: " + agendamento.getDataAgendamento());
        
        // Salva a lista atualizada de agendamentos
        salvarAgendamento();
    } else {
        System.out.println("Agendamento não encontrado para desmarcar.");
    }
}

}
