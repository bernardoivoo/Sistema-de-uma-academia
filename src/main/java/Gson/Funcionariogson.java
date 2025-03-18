/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gson;

import Academia.Funcionario;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author berna
 */
public class Funcionariogson {

    /**
     *
     */
    public static final String Funcionario = "C:/Users/berna/Documents/NetBeansProjects/Academia/src/main/java/Gson/Funcionariogson.json";

    /**
     *
     */
    public Funcionariogson () {}

    /**
     *
     * @param funcionarios
     */
    public static void salvarProduto(List<Funcionario> funcionarios) {
        // Configura a conversão para JSON com formatação legível
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(funcionarios);

        try (FileWriter writer = new FileWriter(Funcionario)) {
            writer.write(json);
            System.out.println("Funcionários salvos com sucesso!");
        } catch (IOException e) {
            System.err.println("Erro ao salvar Funcionários! Verifique o caminho do arquivo e permissões.");
            e.printStackTrace();
        }
    }
}
