/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Comparator;

import Academia.Sala;
import java.util.Comparator;

/**
 *
 * @author berna
 */
public class CompararSalaNumero implements Comparator<Sala> {

    /**
     *
     * @param sala1
     * @param sala2
     * @return
     */
    public int compare( Sala sala1, Sala sala2)
    {
        int CpfCompare = sala1.getNumeroDaSala() - sala2.getNumeroDaSala();

        if(CpfCompare>0){
            return 1;// s1 tem numero da sala maior que a2
        }else if(CpfCompare <0){
            return -1;// s1 tem numero da sala menor que a2
        }else{
            return 0;// s1 e s2 é igual
        }


    }
}
    

