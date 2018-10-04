/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idat.edu.pe.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import idat.edu.pe.bean.*;
import javax.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import idat.edu.pe.validators.*;
import javax.ws.rs.core.MediaType;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author LuisAngel
 */
@RestController
@RequestMapping("persona")
public class PersonaController {
    
    @RequestMapping(value="crear", method = RequestMethod.POST)
    public ResponseEntity<Void> crear (@Valid @RequestBody Persona persona, 
            BindingResult bindingResult){
        try {
            PersonaValidator objValidacion = new PersonaValidator();
            objValidacion.validate(persona, bindingResult);
            if(bindingResult.hasErrors()){
                return new ResponseEntity<Void>(HttpStatus.BAD_REQUEST);            
            }else{
                return new ResponseEntity<Void>(HttpStatus.OK);
            }
        } catch (Exception e) {
            return new ResponseEntity<Void>(HttpStatus.BAD_REQUEST);
        }
        

    }
    
}
