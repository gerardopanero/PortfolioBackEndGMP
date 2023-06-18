
package com.portfolioweb.gmp.Interface;

import com.portfolioweb.gmp.Entity.Persona;
import java.util.List;



public interface IPersonaService {
    //Traer una lista de Personas
    public List<Persona> getPersona();
    
    //Guardar un objeto de tipo Persona
    public void savePersona(Persona persona);
    
    //Eliminar un objeto pero lo buscamos por id
    public void deletePersona(Long id);
    
    //Buscar una Persona por id
    public Persona findPersona(Long id);
    
}
