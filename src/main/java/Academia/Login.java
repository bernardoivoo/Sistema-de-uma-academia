package Academia;

import Controle.Gerenciarfuncionario;
import Controle.Gerenciaradministrador;
import java.util.Scanner;

/**
 *
 * @author berna
 */
public class Login {

    /**
     *
     */
    private Gerenciarfuncionario gerenciarFuncionario;

    /**
     *
     */
    private Gerenciaradministrador gerenciarAdmin;

    /**
     *
     * @param gerenciarFuncionario
     * @param gerenciarAdmin
     */
    public Login(Gerenciarfuncionario gerenciarFuncionario, Gerenciaradministrador gerenciarAdmin) {
        this.gerenciarFuncionario = gerenciarFuncionario;
        this.gerenciarAdmin = gerenciarAdmin;
    }
    //Questão 2:
    // Método para realizar login de funcionário

    /**
     *
     * @param id
     * @param senha
     * @return
     */
    public boolean realizarLoginFuncionario(int id, int senha) {
        Funcionario funcionario = gerenciarFuncionario.buscarFuncionario(id); // Buscar pelo ID
        if (funcionario != null && funcionario.getSenha() == senha) {
            return true; // Senha correta
        }
        return false; // Funcionário não encontrado ou senha incorreta
    }

    // Método para realizar login de administrador

    /**
     *
     * @param id
     * @param senha
     * @return
     */
    public boolean realizarLoginAdmin(int id, int senha) {
        Administrador admin = gerenciarAdmin.buscarAdmin(id); // Buscar pelo ID
        if (admin != null && admin.getSenha() == senha) {
            return true; // Senha correta
        }
        return false; // Admin não encontrado ou senha incorreta
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Login{" + "gerenciarFuncionario=" + gerenciarFuncionario + ", gerenciarAdmin=" + gerenciarAdmin + '}';
    }
    
    
}

