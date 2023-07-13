
package ar.com.disney.desafio.entities;

import ar.com.disney.desafio.enums.Genero;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public class Pelicula {
   
     private int id;   
     private String titulo;
     private LocalDate fecha;
     private Integer calificacion;
     private String personaje;
     private String imagen;
     private List< Personaje> personajes;
    

    public Pelicula() {
    }

    public Pelicula(int id, String titulo, LocalDate fecha, Integer calificacion, String personaje, String imagen) {
        this.id = id;
        this.titulo = titulo;
        this.fecha = fecha;
        this.calificacion = calificacion;
        this.personaje = personaje;
        this.imagen = imagen;
    }

    public Pelicula(String titulo, LocalDate fecha, Integer calificacion, String personaje, String imagen) {
        this.titulo = titulo;
        this.fecha = fecha;
        this.calificacion = calificacion;
        this.personaje = personaje;
        this.imagen = imagen;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

       

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public String getPersonaje() {
        return personaje;
    }

    public void setPersonaje(String personaje) {
        this.personaje = personaje;
    }
    
    

    public List getPersonajes() {
        return personajes;
    }

    public void setPersonajes(List personaje) {
        this.personajes = personaje;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "idPelicula=" + id + ", titulo=" + titulo + ", fecha=" + fecha + ", calificacion=" + calificacion + ", personaje=" + personaje + ", imagen=" + imagen + '}';
    }

   

 
    

   
}

