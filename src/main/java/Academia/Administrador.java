package Academia;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author berna
 */
public class Administrador extends Funcionario {

    /**
     *
     * @param nome
     * @param id
     * @param senha
     */
    public Administrador(String nome, int id, int senha) {
        super(nome, id, senha);
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Administrador{" + '}';
    }
    
    
}

