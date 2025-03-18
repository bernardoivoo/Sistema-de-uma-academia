/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gson;

import Academia.Vendaplano;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author berna
 */
public class Vendasplanogson {

    /**
     *
     */
    public static final String Vendaplano = "C:/Users/berna/Documents/NetBeansProjects/Academia/src/main/java/Gson/Vendasplanogson.json";

    /**
     *
     */
    public Vendasplanogson () {}

    /**
     *
     * @param vendasPlano
     */
    public static void salvarVendas(List<Vendaplano> vendasPlano) {
        // Configura a conversão para JSON com formatação legível
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(vendasPlano);

        try (FileWriter writer = new FileWriter(Vendaplano)) {
            writer.write(json);
            System.out.println("Venda de plano salva com sucesso!");
        } catch (IOException e) {
            System.err.println("Erro ao salvar Venda de plano! Verifique o caminho do arquivo e permissões.");
            e.printStackTrace();
        }
    }
}
