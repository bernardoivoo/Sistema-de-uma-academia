/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gson;

import Academia.Agendamento;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author berna
 */
public class Agendamentogson {

    /**
     *
     */
    public static final String Agendamento = "C:/Users/berna/Documents/NetBeansProjects/Academia/src/main/java/Gson/Agendamentogson.json";

    /**
     *
     */
    public Agendamentogson () {}

    /**
     *
     * @param agendamentos
     */
    public static void salvarAgendamento(List<Agendamento> agendamentos) {
        // Configura a conversão para JSON com formatação legível
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(agendamentos);

        try (FileWriter writer = new FileWriter(Agendamento)) {
            writer.write(json);
            System.out.println("Agendamentos salvos com sucesso!");
        } catch (IOException e) {
            System.err.println("Erro ao salvar Agendamento! Verifique o caminho do arquivo e permissões.");
            e.printStackTrace();
        }
    }
}