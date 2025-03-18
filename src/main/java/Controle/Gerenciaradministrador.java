/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controle;

import Academia.Administrador;
import Comparator.CompararAdminid;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author berna
 */

//Classe responsável por gerenciar administrador
public class Gerenciaradministrador {

    /**
     *
     */
    private List<Administrador> administradores;

    /**
     *
     */
    public Gerenciaradministrador() {
        this.administradores = new ArrayList<>();
    }
    
    

    // Método para cadastrar um administrador

    /**
     *
     * @param admin
     */
    public void cadastrarAdmin(Administrador admin) {
        this.administradores.add(admin);
        Collections.sort(administradores, new CompararAdminid()); // Ordena a lista após adicionar
        System.out.println("Administrador cadastrado com sucesso: " + admin.getNome());
    }

    // Método para buscar um administrador usando busca binária pelo ID

    /**
     *
     * @param id
     * @return
     */
    public Administrador buscarAdmin(int id) {
    // Ordena a lista de administradores pelo ID antes da busca
    Collections.sort(administradores, new CompararAdminid());
    
    // Cria uma instância temporária de Administrador apenas com o ID para a busca
    Administrador adminBusca = new Administrador(null, id, 0);
    
    // Usa o método binarySearch da classe Collections para buscar o índice do administrador
    int index = Collections.binarySearch(administradores, adminBusca, new CompararAdminid());
    
    if (index >= 0) {
        // Se o índice é válido (maior ou igual a 0), retorna o administrador encontrado
        return administradores.get(index);
    } else {
        // Se o índice é negativo, o administrador não foi encontrado
        return null;
    }
}



    // Método para excluir um administrador usando o ID

    /**
     *
     * @param id
     */
    public void excluirAdmin(int id) {
        Administrador admin = buscarAdmin(id); // Busca o administrador pelo ID

        if (admin != null) {
            administradores.remove(admin); // Remove o administrador da lista
            System.out.println("Administrador excluído com sucesso: " + admin.getNome());
        } else {
            System.out.println("Administrador não encontrado.");
        }
    }

    // Método para alterar o nome de um administrador

    /**
     *
     * @param id
     * @param novoNome
     */
    public void alterarAdmin(int id, String novoNome) {
        Administrador admin = buscarAdmin(id); // Busca o administrador pelo ID

        if (admin != null) {
            admin.setNome(novoNome); // Altera o nome do administrador
            System.out.println("Administrador alterado com sucesso: " + admin.getNome());
        } else {
            System.out.println("Administrador não encontrado.");
        }
    }
    
}



   


    

