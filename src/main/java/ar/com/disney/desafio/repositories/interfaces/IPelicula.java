
package ar.com.disney.desafio.repositories.interfaces;

import ar.com.disney.desafio.entities.Pelicula;
import ar.com.disney.desafio.entities.Personaje;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public interface IPelicula {
    
    void creacion(Pelicula pelicula);
    void eiminacion(Pelicula pelicula);
    void edicion(Pelicula pelicula);
    List<Pelicula> getAllPeliculas();
    List<Personaje> getAllPersonaje();
    
     default List<Personaje> getLikePersonaje(String personaje){
        if(personaje==null) return new ArrayList<Personaje>();
        return getAllPersonaje()
                .stream()
                .filter(c->c.getNombre().toLowerCase().contains(personaje.toLowerCase()))
                .collect(Collectors.toList());
    }
     
    
}
    

