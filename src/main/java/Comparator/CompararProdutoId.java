/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Comparator;

import Academia.Produto;
import java.util.Comparator;

/**
 *
 * @author berna
 */
public class CompararProdutoId implements Comparator<Produto> {

    /**
     *
     * @param produto1
     * @param produto2
     * @return
     */
    @Override
     public int compare( Produto produto1, Produto produto2)
    {
        int Idcompare = produto1.getId() - produto2.getId();

        if(Idcompare>0){
            return 1;
        }else if(Idcompare <0){
            return -1;
        }else{
            return 0;
        }
        
    }
}