/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Comparator;

import Academia.Venda;
import java.util.Comparator;

/**
 *
 * @author berna
 */
public class Compararvendaid implements Comparator<Venda> {

    /**
     *
     * @param vendaproduto1
     * @param vendaproduto2
     * @return
     */
    @Override
     public int compare( Venda vendaproduto1, Venda vendaproduto2)
    {
        int Idcompare = vendaproduto1.getId() - vendaproduto2.getId();

        if(Idcompare>0){
            return 1;// a1 tem id maior que a2
        }else if(Idcompare <0){
            return -1;// a1 tem id menor que a2
        }else{
            return 0;// a1 e a2 é igual
        }
        
    }
    
}
