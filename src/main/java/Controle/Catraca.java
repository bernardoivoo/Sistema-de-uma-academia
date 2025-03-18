package Controle;

import Academia.Aluno;
import Academia.Horario;
import Controle.Gerenciaraluno;
import Gson.Catracagson;
import java.time.LocalTime;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author berna
 */
//Classe que gerencia os acessos na catraca
public class Catraca {

    /**
     *
     */
    private Gerenciaraluno gerenciarAluno;

    /**
     *
     */
    private List<Horario> registros; // Lista para armazenar os horários de entrada e saída

    /**
     *
     * @param gerenciarAluno
     */
    public Catraca(Gerenciaraluno gerenciarAluno) {
        this.gerenciarAluno = gerenciarAluno;
        this.registros = new ArrayList<>(); // Inicializa a lista de registros
    }
    
    /**
     *
     */
    public void salvarRegistros(){
        Catracagson.salvarRegistros(registros);
    }

    /**
     *
     * @param cpfAnonimo
     * @param horario
     */
    public void registrarEntrada(int cpfAnonimo, Horario horario) {
    Aluno aluno = gerenciarAluno.buscarAluno(cpfAnonimo); // Busca o aluno pelo CPF

    if (aluno != null) {
        registros.add(horario); // Adiciona o horário de entrada à lista de registros
        System.out.println("Entrada autorizada para o aluno: " + aluno.getNomeAluno() + " às " + horario.getHorarioEntrada());
    } else {
        System.out.println("Aluno não encontrado. Entrada não autorizada.");
    }
}

    /**
     *
     * @param cpfAnonimo
     * @param horario
     */
    public void registrarSaida(int cpfAnonimo, Horario horario) {
    Aluno aluno = gerenciarAluno.buscarAluno(cpfAnonimo); // Busca o aluno pelo CPF

    if (aluno != null) {
        registros.add(horario); // Adiciona o horário de saída à lista de registros
        System.out.println("Saída registrada para o aluno: " + aluno.getNomeAluno() + " às " + horario.getHorarioSaida());
    } else {
        System.out.println("Aluno não encontrado. Saída não registrada.");
    }
}




    // Método para acessar os registros de entrada e saída, se necessário

    /**
     *
     * @return
     */
    public List<Horario> getRegistros() {
        return registros;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Catraca{" + "gerenciarAluno=" + gerenciarAluno + ", registros=" + registros + '}';
    }
    
    
}
