
package ar.com.disney.desafio.repositories.interfaces;

import ar.com.disney.desafio.entities.Pelicula;
import ar.com.disney.desafio.entities.Personaje;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public interface IPersonaje {
    
    void creacion(Personaje personaje);
    void eiminacion(Personaje personaje);
    void edicion(Personaje personaje);
    List<Personaje> getAllPersonajes();
    //List<Pelicula> getAllPelicula();
    
    
    
     default List<Personaje> getLikePersonajes(String personaje){
        if(personaje==null) return new ArrayList<Personaje>();
        return getAllPersonajes()
                .stream()
                .filter(c->c.getNombre().toLowerCase().contains(personaje.toLowerCase()))
                .collect(Collectors.toList());
    }
     default List<Personaje> getLikeNombre(String personaje){
        if(personaje==null) return new ArrayList<Personaje>();
        return getAllPersonajes()
                .stream()
                .filter(c->c.getNombre().toLowerCase().contains(personaje.toLowerCase()))
                .collect(Collectors.toList());
    }
     
      default List<Personaje> getLikeEdad(String personaje){
        if(personaje==null) return new ArrayList<Personaje>();
        return getAllPersonajes()
                .stream()
                .filter(c->c.getNombre().toLowerCase().contains(personaje.toLowerCase()))
                .collect(Collectors.toList());
    }
      
       default List<Personaje> getLikePelicula(String personaje){
        if(personaje==null) return new ArrayList<Personaje>();
        return getAllPersonajes()
                .stream()
                .filter(c->c.getNombre().toLowerCase().contains(personaje.toLowerCase()))
                .collect(Collectors.toList());
    }
}
