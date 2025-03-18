/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Comparator;


import Academia.Vendaplano;
import java.util.Comparator;

/**
 *
 * @author berna
 */
public class ComparatorVendaplanoid implements Comparator<Vendaplano> {

    /**
     *
     * @param vendaplano1
     * @param vendaplano2
     * @return
     */
    @Override
     public int compare( Vendaplano vendaplano1, Vendaplano vendaplano2)
    {
        int Idcompare = vendaplano1.getId() - vendaplano2.getId();

        if(Idcompare>0){
            return 1;// v1 tem id maior que v2
        }else if(Idcompare <0){
            return -1;// v1 tem id menor que v2
        }else{
            return 0;// v1 e v2 é igual
        }
        
    }
    
}
    

