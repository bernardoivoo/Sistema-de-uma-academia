package Comparator;


import Academia.Aluno;
import java.util.Comparator;

/**
 *
 * @author berna
 */
public class CompararAlunosTelefone implements Comparator<Aluno> {

    /**
     *
     * @param a1
     * @param a2
     * @return
     */
    @Override
    public int compare(Aluno a1, Aluno a2) {
        return compareStrings(a1.getTelefone(), a2.getTelefone());
    }

    /**
     *
     * @param s1
     * @param s2
     * @return
     */
    private static int compareStrings(String s1, String s2) {
        int len1 = s1.length(); // Recebe o comprimento da primeira string
        int len2 = s2.length(); // Recebe o comprimento da segunda string
        int lim = Math.min(len1, len2); // Determina o menor comprimento entre as duas strings

        for (int i = 0; i < lim; i++) { // Percorre pelos caracteres das duas strings até o menor comprimento
            char c1 = s1.charAt(i); // Recebe o caractere na posição i da primeira string
            char c2 = s2.charAt(i); // Recebe o caractere na posição i da segunda string
            if (c1 != c2) { // Compara os caracteres; se forem diferentes, retorna a diferença
                return c1 - c2;
            }
        }
        // Se todos os caracteres até o menor comprimento são iguais,
        // retorna a diferença dos comprimentos das strings
        return len1 - len2;
    }
}

