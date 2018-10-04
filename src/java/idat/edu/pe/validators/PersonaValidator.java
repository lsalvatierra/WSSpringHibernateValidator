/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idat.edu.pe.validators;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import idat.edu.pe.bean.*;


/**
 *
 * @author LuisAngel
 */
public class PersonaValidator implements Validator {

    @Override
    public boolean supports(Class<?> type) {
        return Persona.class.equals(type);
    }

    @Override
    public void validate(Object o, Errors errors) {
 
    }
    
}
