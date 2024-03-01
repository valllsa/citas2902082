package org.citas2902082.java.entities;

import org.citas2902082.java.entities.enums.Especialidad;
import org.citas2902082.java.entities.enums.TipoIdentificacion;

public class Medico {

    public Integer id;
    public String nombres;
    public String apellidos;
    public TipoIdentificacion tipoIdentificacion;
    public Integer numeroIdentificacion;
    public Integer resgistroMedico;
    public Especialidad especialidad;
    public Medico(String nombres, String apellidos, TipoIdentificacion tipoIdentificacion, Integer numeroIdentificacion,
            Integer resgistroMedico, Especialidad especialidad) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.tipoIdentificacion = tipoIdentificacion;
        this.numeroIdentificacion = numeroIdentificacion;
        this.resgistroMedico = resgistroMedico;
        this.especialidad = especialidad;
    }

    
    
}
