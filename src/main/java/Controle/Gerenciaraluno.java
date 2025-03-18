/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controle;

import Academia.Aluno;
import Comparator.CompararAlunosCpf;
import Comparator.CompararAlunosTelefone;
import Gson.Alunogson;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author berna
 */

//Classe responsável por gerenciar aluno
public class Gerenciaraluno {

    /**
     *
     */
    private List<Aluno> alunos;

    /**
     *
     */
    public Gerenciaraluno() {
        this.alunos = new ArrayList<>();
    }
    
    // Questão 7:
    // Método para cadastrar um novo aluno 

    /**
     *
     * @param a
     */
    public void cadastrarAluno (Aluno a) {
        this.alunos.add(a);
    }
    
    /**
     *
     */
    public void salvarAluno(){
        Alunogson.salvarAluno(alunos);
    }
       
    // Método para buscar um aluno usando busca binária pelo CPF

    /**
     *
     * @param cpfAnonimo
     * @return
     */
    public Aluno buscarAluno(int cpfAnonimo) {
    // Ordena a lista de alunos pelo CPF antes da busca
    Collections.sort(alunos, new CompararAlunosCpf());
    
    // Cria uma instância temporária de Aluno apenas com o CPF para a busca
    Aluno alunoBusca = new Aluno(null, null, null, null, cpfAnonimo);
    
    // Usa o método binarySearch da classe Collections para buscar o índice do aluno
    int index = Collections.binarySearch(alunos, alunoBusca, new CompararAlunosCpf());
    
    if (index >= 0) {
        // Se o índice é válido (maior ou igual a 0), retorna o aluno encontrado
        return alunos.get(index);
    } else {
        // Se o índice é negativo, o aluno não foi encontrado
        return null;
    }
}


    
    // Método find para buscar um aluno usando Iterator e Comparator
    //Questão 17:

    /**
     *
     * @param cpfAnonimo
     * @return
     */
    public Aluno find(int cpfAnonimo) {
        Iterator<Aluno> iterator = alunos.iterator();
        CompararAlunosCpf comparator = new CompararAlunosCpf();

        while (iterator.hasNext()) {
            Aluno aluno = iterator.next();
            if (comparator.compare(aluno, new Aluno(null, null, null, null, cpfAnonimo)) == 0) {
                return aluno; // Retorna o aluno encontrado
            }
        }

        return null; // Aluno não encontrado
    }
   

    // Método para excluir um aluno usando o CPF

    /**
     *
     * @param cpfAnonimo
     */
    public void excluirAluno(int cpfAnonimo) {
        Aluno aluno = buscarAluno(cpfAnonimo); // Busca o aluno pelo CPF

        if (aluno != null) {
            alunos.remove(aluno); // Remove o aluno da lista
            System.out.println("Aluno excluído com sucesso: " + aluno.getNomeAluno());
        } else {
            System.out.println("Aluno não encontrado.");
        }
    }
    
   // Método para alterar um aluno

    /**
     *
     * @param cpfAnonimo
     * @param novoNome
     */
    public void alterarAluno(int cpfAnonimo, String novoNome) {
        Aluno aluno = buscarAluno(cpfAnonimo); // Busca o aluno pelo CPF

        if (aluno != null) {
            aluno.setNomeAluno(novoNome); // Altera o nome do aluno
            System.out.println("Aluno alterado com sucesso: " + aluno.getNomeAluno());
        } else {
            System.out.println("Aluno não encontrado.");
        }
    }
    
    // Método para imprimir a lista de alunos utilizando um Iterator
    //Questão 15:

    /**
     *
     */
    public void imprimirAlunos() {
        Iterator<Aluno> iterator = alunos.iterator();
        System.out.println("Lista de Alunos:");

        if (!iterator.hasNext()) {
        System.out.println("Nenhum aluno cadastrado.");
    } else {
        while (iterator.hasNext()) {
            Aluno aluno = iterator.next();
            System.out.println(aluno); // Chama o método toString da classe Aluno
        }
    }
    }
    
    // Método para imprimir a lista de alunos utilizando um loop foreach

    /**
     *
     */
    public void imprimirAlunosForeach() {
        System.out.println("Lista de Alunos:");

        if (alunos.isEmpty()) {
        System.out.println("Nenhum aluno cadastrado.");
    } else {
        // Loop foreach para percorrer cada aluno na lista de alunos
        for (Aluno aluno : alunos) { // Aqui é o foreach loop
            System.out.println(aluno); // Chama o método toString da classe Aluno para imprimir os dados
        }
    }
    }


    
   //Questão 16:
   // Método para ordenar a lista de alunos por CPF usando o Comparator

    /**
     *
     */
    public void ordenarAlunosPorCpf() {
        Collections.sort(alunos, new CompararAlunosCpf());
        System.out.println("Lista de alunos ordenada por CPF.");
        for (Aluno aluno : alunos) {
        System.out.println("Nome: " + aluno.getNomeAluno() + ", CPF Anônimo: " + aluno.getCpfAnonimo());
    }
    }
     // Método para ordenar a lista de alunos por telefone usando o Comparator

    /**
     *
     */
    public void ordenarAlunosPorTelefone() {
        Collections.sort(alunos, new CompararAlunosTelefone());
        System.out.println("Lista de alunos ordenada por telefone.");
        for (Aluno aluno : alunos) {
            System.out.println("Nome: " + aluno.getNomeAluno() + ", Telefone: " + aluno.getTelefone());
        }
    }

    }




