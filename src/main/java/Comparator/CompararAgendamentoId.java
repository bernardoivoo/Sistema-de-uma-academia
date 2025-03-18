/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Comparator;

import Academia.Agendamento;
import java.util.Comparator;

/**
 *
 * @author berna
 */
public class CompararAgendamentoId implements Comparator<Agendamento> {

    /**
     *
     * @param agendamento1
     * @param agendamento2
     * @return
     */
    @Override
     public int compare( Agendamento agendamento1, Agendamento agendamento2)
    {
        int Idcompare = agendamento1.getAulaId() - agendamento2.getAulaId();

        if(Idcompare>0){
            return 1;// a1 tem id maior que a2
        }else if(Idcompare <0){
            return -1;// a1 tem id menor que a2
        }else{
            return 0;// a1 e a2 é igual
        }
        
    }
}
