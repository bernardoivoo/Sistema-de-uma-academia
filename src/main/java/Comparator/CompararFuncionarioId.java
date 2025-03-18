package Comparator;


import Academia.Funcionario;
import java.util.Comparator;

/**
 *
 * @author berna
 */
public class CompararFuncionarioId implements Comparator<Funcionario> {

    /**
     *
     * @param funcionario1
     * @param funcionario2
     * @return
     */
    @Override
     public int compare( Funcionario funcionario1, Funcionario funcionario2)
    {
        int Idcompare = funcionario1.getId() - funcionario2.getId();

        if(Idcompare>0){
            return 1;// a1 tem id maior que a2
        }else if(Idcompare <0){
            return -1;// a1 tem id menor que a2
        }else{
            return 0;// a1 e a2 é igual
        }
        
    }
}



