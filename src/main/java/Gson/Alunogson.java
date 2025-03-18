/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gson;

/**
 *
 * @author berna
 */

import Academia.Aluno;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author berna
 */
public class Alunogson {

    /**
     *
     */
    public static final String Aluno = "C:/Users/berna/Documents/NetBeansProjects/Academia/src/main/java/Gson/Alunogson.json";

    /**
     *
     */
    public Alunogson () {}

    /**
     *
     * @param alunos
     */
    public static void salvarAluno(List<Aluno> alunos) {
        // Configura a conversão para JSON com formatação legível
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(alunos);

        try (FileWriter writer = new FileWriter(Aluno)) {
            writer.write(json);
            System.out.println("Alunos salvos com sucesso!");
        } catch (IOException e) {
            System.err.println("Erro ao salvar Aluno! Verifique o caminho do arquivo e permissões.");
            e.printStackTrace();
        }
    }
}