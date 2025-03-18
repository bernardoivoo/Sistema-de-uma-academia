/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gson;

/**
 *
 * @author berna
 */

import Academia.Produto;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author berna
 */
public class Produtosgson {

    /**
     *
     */
    public static final String Produto = "C:/Users/berna/Documents/NetBeansProjects/Academia/src/main/java/Gson/Produtosgson.json";

    /**
     *
     */
    public Produtosgson () {}

    /**
     *
     * @param produtos
     */
    public static void salvarProduto(List<Produto> produtos) {
        // Configura a conversão para JSON com formatação legível
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(produtos);

        try (FileWriter writer = new FileWriter(Produto)) {
            writer.write(json);
            System.out.println("Produtos salvos com sucesso!");
        } catch (IOException e) {
            System.err.println("Erro ao salvar Produto! Verifique o caminho do arquivo e permissões.");
            e.printStackTrace();
        }
    }
}
