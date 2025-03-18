package Controle;

import Academia.Produto;
import Comparator.CompararProdutoId;
import Gson.Produtosgson;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author berna
 */

//Classe responsável por gerenciar produto
public class Gerenciarproduto {

    /**
     *
     */
    private List<Produto> produtos;

    // Construtor da classe

    /**
     *
     */
    public Gerenciarproduto() {
        this.produtos = new ArrayList<>();
    }

  // Método para adicionar um produto

    /**
     *
     * @param produto
     */
    public void adicionarProduto(Produto produto) {
    this.produtos.add(produto);
    }
    
    /**
     *
     */
    public void salvarProdutos(){
        Produtosgson.salvarProduto(produtos);
    }

  
    // Método para buscar um produto usando busca binária pelo ID

    /**
     *
     * @param id
     * @return
     */
    public Produto buscarProduto(int id) {
        // Ordena a lista de produtos pelo ID antes da busca binária
        Collections.sort(produtos, new CompararProdutoId());
        Produto produtoBusca = new Produto(null, null, 0.0, id, 0);
        
        int index = Collections.binarySearch(produtos, produtoBusca, new CompararProdutoId());
        
        if (index >= 0) {
            return produtos.get(index); // Retorna o produto encontrado
        } else {
            return null; // Produto não encontrado
        }
    }

    // Método para excluir um produto usando o ID

    /**
     *
     * @param id
     */
    public void excluirProduto(int id) {
        Produto produto = buscarProduto(id); // Busca o produto pelo ID
        
        if (produto != null) {
            produtos.remove(produto); // Remove o produto da lista
            System.out.println("Produto excluído com sucesso: " + produto.getNomeDoProduto());
        } else {
            System.out.println("Produto não encontrado.");
        }
    }

    // Método para alterar um produto usando o ID

    /**
     *
     * @param id
     * @param novoNome
     * @param novoValor
     */
    public void alterarProduto(int id, String novoNome, double novoValor) {
        Produto produto = buscarProduto(id); // Busca o produto pelo ID
        
        if (produto != null) {
            produto.setNomeDoProduto(novoNome); // Altera o nome do produto
            produto.setValor(novoValor); // Altera o valor do produto
            System.out.println("Produto alterado com sucesso: " + produto.getNomeDoProduto());
        } else {
            System.out.println("Produto não encontrado.");
        }
    }
}
