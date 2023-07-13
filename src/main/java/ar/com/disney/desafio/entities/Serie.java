
package ar.com.disney.desafio.entities;

import ar.com.disney.desafio.enums.Genero;
import java.time.LocalDate;

public class Serie {
    
     private String imagen;
     private String titulo;
     private LocalDate fecha;
     private byte calificacion;
     private Personaje personaje;
     private Genero genero;

    public Serie() {
    }

    public Serie(String imagen, String titulo, LocalDate fecha, byte calificacion, Personaje personaje, Genero genero) {
        this.imagen = imagen;
        this.titulo = titulo;
        this.fecha = fecha;
        this.calificacion = calificacion;
        this.personaje = personaje;
        this.genero = genero;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
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

    public byte getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(byte calificacion) {
        this.calificacion = calificacion;
    }

    public Personaje getPersonaje() {
        return personaje;
    }

    public void setPersonaje(Personaje personaje) {
        this.personaje = personaje;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Serie{" + "imagen=" + imagen + ", titulo=" + titulo + ", fecha=" + fecha + ", calificacion=" + calificacion + ", personaje=" + personaje + ", genero=" + genero + '}';
    }
     
     
     
    
}
