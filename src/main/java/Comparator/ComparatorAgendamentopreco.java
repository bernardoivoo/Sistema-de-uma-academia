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
public class ComparatorAgendamentopreco implements Comparator<Agendamento> {

    /**
     *
     * @param agendamento1
     * @param agendamento2
     * @return
     */
    @Override
     public int compare( Agendamento agendamento1, Agendamento agendamento2)
    {
        double Precocompare = agendamento1.getPreco() - agendamento2.getPreco();

        if(Precocompare>0){
            return 1;// a1 tem preço maior que a2
        }else if(Precocompare <0){
            return -1;// a1 tem preço menor que a2
        }else{
            return 0;// a1 e a2 é igual
        }
        
    }
    
}
