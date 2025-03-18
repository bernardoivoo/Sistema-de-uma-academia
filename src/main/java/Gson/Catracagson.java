/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gson;

import Academia.Horario;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author berna
 */
public class Catracagson {
    
    /**
     *
     */
    public static final String Horario = "C:/Users/berna/Documents/NetBeansProjects/Academia/src/main/java/Gson/Catracagson.json";

    /**
     *
     */
    public Catracagson () {}

    /**
     *
     * @param registros
     */
    public static void salvarRegistros(List<Horario> registros) {
        // Configura a conversão para JSON com formatação legível
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(registros);

        try (FileWriter writer = new FileWriter(Horario)) {
            writer.write(json);
            System.out.println("Registros de entrada e saída salvos com sucesso!");
        } catch (IOException e) {
            System.err.println("Erro ao salvar registros de entrada e saída ! Verifique o caminho do arquivo e permissões.");
            e.printStackTrace();
        }
    }
}
    

