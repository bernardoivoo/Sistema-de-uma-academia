package Controle;

import Academia.Sala;
import Comparator.CompararSalaNumero;
import java.util.Arrays;

//Questão 5:

/**
 *
 * @author berna
 */

//Classe responsavel por gerenciar salas:
public class Gerenciarsalas {
    // Vetor estático para armazenar as salas

    /**
     *
     */
    private static Sala[] salas = new Sala[4];
    
    // Método para inicializar as salas com capacidade

    /**
     *
     */
    public static void inicializarSalas() {
        salas[0] = new Sala("Sala de Spinning", 1, 101, 20); 
        salas[1] = new Sala("Sala de Musculação", 2, 102, 30);
        salas[2] = new Sala("Sala de Fit Dance", 3, 103, 25);
        salas[3] = new Sala("Sala de Pilates", 4, 104, 15);

        // Ordena o vetor de salas usando o CompararSalaNumero
        Arrays.sort(salas, new CompararSalaNumero());
    }
    
    // Método para buscar uma sala usando o número da sala com busca binária

    /**
     *
     * @param numeroSala
     * @return
     */
    public static Sala buscarSalaPorNumero(int numeroSala) {
        // Cria uma sala temporária com o número da sala a ser buscado
        Sala salaBusca = new Sala(null, 0, numeroSala, 0); // Passando capacidade 0 para não afetar busca
        
        // Realiza a busca binária usando o CompararSalaNumero
        int index = Arrays.binarySearch(salas, salaBusca, new CompararSalaNumero());
        
        if (index >= 0) {
            return salas[index]; // Retorna a sala encontrada
        } else {
            return null; // Retorna null se a sala não for encontrada
        }
    }
}
