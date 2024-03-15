package org.citas2902082.java;

import org.citas2902082.java.entities.Medico;
import org.citas2902082.java.entities.enums.Especialidad;
import org.citas2902082.java.entities.enums.TipoIdentificacion;
public class Main {
    public static void main(String[] args) {
        
        Medico m = new Medico(1,  
                             "Valery", 
                             "Araque",
                             TipoIdentificacion.TI, 
                             1014667051l, 
                             12345657l, 
                             Especialidad.DERMATOLOGIA);
    System.out.println(m.toString());
    }
}