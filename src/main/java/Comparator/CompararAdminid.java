/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Comparator;

import Academia.Administrador;
import java.util.Comparator;

/**
 *
 * @author berna
 */
public class CompararAdminid implements Comparator<Administrador> {

    /**
     *
     * @param admin1
     * @param admin2
     * @return
     */
    @Override
     public int compare( Administrador admin1, Administrador admin2)
    {
        int Idcompare = admin1.getId() - admin2.getId();

        if(Idcompare>0){
            return 1;// a1 tem id maior que a2
        }else if(Idcompare <0){
            return -1;// a1 tem id menor que a2
        }else{
            return 0;// a1 e a2 é igual
        }
        
    }
}

