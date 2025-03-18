/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controle;

import Academia.Funcionario;
import Comparator.CompararFuncionarioId;
import Gson.Funcionariogson;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author berna
 */ 
//Classe responsável por gerenciar funcionario
    //Questão 6:
    public class Gerenciarfuncionario {

    /**
     *
     */
    private List<Funcionario> funcionarios;
    
    /**
     *
     */
    public Gerenciarfuncionario () {
      this.funcionarios = new ArrayList<>();
    }
    
    
  
    // métodos para gerenciar funcionários

    /**
     *
     * @param f
     */
    public void cadastrarFuncionario(Funcionario f) {
        this.funcionarios.add(f);
    }
    
    /**
     *
     */
    public void salvarFuncionario(){
        Funcionariogson.salvarProduto(funcionarios);
        
    }
    
    // Método para buscar um funcionário usando busca binária pelo ID

    /**
     *
     * @param id
     * @return
     */
    public Funcionario buscarFuncionario(int id) {
    // Ordena a lista de funcionários pelo ID antes da busca
    Collections.sort(funcionarios, new CompararFuncionarioId());
    
    // Cria um funcionário temporário com o ID para a busca
    Funcionario funcionarioBusca = new Funcionario(null, id, 0);
    
    // Usa o método binarySearch da classe Collections para buscar o índice do funcionário
    int index = Collections.binarySearch(funcionarios, funcionarioBusca, new CompararFuncionarioId());
    
    if (index >= 0) {
        // Se o índice é válido (maior ou igual a 0), retorna o funcionário encontrado
        return funcionarios.get(index);
    } else {
        // Se o índice é negativo, o funcionário não foi encontrado
        return null;
    }
}



        // Método para excluir um funcionário usando o ID

    /**
     *
     * @param id
     */
    public void excluirFuncionario(int id) {
        Funcionario funcionario = buscarFuncionario(id); // Busca o funcionário pelo ID

    if (funcionario != null) {
        funcionarios.remove(funcionario); // Remove o funcionário da lista
        System.out.println("Funcionário excluído com sucesso: " + funcionario.getNome());
    } else {
        System.out.println("Funcionário não encontrado.");
    }
}

    // Método para alterar um funcionário

    /**
     *
     * @param id
     * @param novoNome
     */
    public void alterarFuncionario(int id, String novoNome) {
       Funcionario funcionario = buscarFuncionario(id); // Busca o funcionário pelo ID

    if (funcionario != null) {
        funcionario.setNome(novoNome); // Altera o nome do funcionário
        System.out.println("Funcionário alterado com sucesso: " + funcionario.getNome());
    } else {
        System.out.println("Funcionário não encontrado.");
    }
}
    
 

    }
    
    


