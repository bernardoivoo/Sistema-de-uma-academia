/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gson;


import Academia.Venda;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author berna
 */
public class Vendasgson {

    /**
     *
     */
    public static final String Venda = "C:/Users/berna/Documents/NetBeansProjects/Academia/src/main/java/Gson/Vendasgson.json";

    /**
     *
     */
    public Vendasgson () {}

    /**
     *
     * @param vendas
     */
    public static void salvarVendas(List<Venda> vendas) {
        // Configura a conversão para JSON com formatação legível
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(vendas);

        try (FileWriter writer = new FileWriter(Venda)) {
            writer.write(json);
            System.out.println("Venda salva com sucesso!");
        } catch (IOException e) {
            System.err.println("Erro ao salvar Venda! Verifique o caminho do arquivo e permissões.");
            e.printStackTrace();
        }
    }
}
