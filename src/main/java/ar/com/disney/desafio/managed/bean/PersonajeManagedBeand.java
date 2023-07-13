
package ar.com.disney.desafio.managed.bean;

import ar.com.disney.desafio.connector.Connector;
import ar.com.disney.desafio.connector.repositories.jdbc.PersonajeDisney;
import ar.com.disney.desafio.entities.Personaje;
import ar.com.disney.desafio.repositories.interfaces.IPersonaje;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

 
@Named("personajeMB")
@SessionScoped
public class PersonajeManagedBeand implements Serializable {
   
    private IPersonaje mi_personaje = new  PersonajeDisney(Connector.conectar());
    
    private List<Personaje> characteres=  mi_personaje.getAllPersonajes();
    private Personaje personaje = new Personaje();
   
    

    public List<Personaje> getCharacteres() {
        return characteres;
    }

    public void setCharacteres(List<Personaje> characteres) {
        this.characteres = characteres;
    }
    

    public Personaje getPersonaje() {
        return personaje;
    }

    public void setPersonaje(Personaje personaje) {
        this.personaje = personaje;
    }
    
    public void Creacion(){
        
        mi_personaje.creacion(personaje);
    }
    
   
    
}
