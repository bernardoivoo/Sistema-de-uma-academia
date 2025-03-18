/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Comparator;

import Academia.Aluno;
import java.util.Comparator;

/**
 *
 * @author berna
 */
public class CompararAlunosCpf implements Comparator<Aluno> {

    /**
     *
     * @param aluno1
     * @param aluno2
     * @return
     */
    public int compare( Aluno aluno1, Aluno aluno2)
    {
        int CpfCompare = aluno1.getCpfAnonimo() - aluno2.getCpfAnonimo();

        if(CpfCompare>0){
            return 1;// a1 tem cpf maior que a2
        }else if(CpfCompare <0){
            return -1;// a1 tem cpf menor que a2
        }else{
            return 0;// a1 e a2 é igual
        }


    }
}

