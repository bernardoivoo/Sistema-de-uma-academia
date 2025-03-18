/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Comparator;

/**
 *
 * @author berna
 */
import Academia.Aula;
import java.util.Comparator;

/**
 *
 * @author berna
 */
public class CompararAulaid implements Comparator<Aula> {

    /**
     *
     * @param aula1
     * @param aula2
     * @return
     */
    @Override
     public int compare( Aula aula1, Aula aula2)
    {
        int Idcompare = aula1.getId() - aula2.getId();

        if(Idcompare>0){
            return 1;// a1 tem id maior que a2
        }else if(Idcompare <0){
            return -1;// a1 tem id menor que a2
        }else{
            return 0;// a1 e a2 é igual
        }
        
    }
}
