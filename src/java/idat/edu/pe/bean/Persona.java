/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idat.edu.pe.bean;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlRootElement;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

/**
 *
 * @author LuisAngel
 */
@XmlRootElement(name = "persona")
public class Persona implements Serializable {
    private static final long serialVerisionUID = 1L;
    
    @NotEmpty
    @Length(min = 3, max = 10)
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
