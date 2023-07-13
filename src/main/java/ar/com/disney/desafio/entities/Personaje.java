
package ar.com.disney.desafio.entities;

import java.util.List;

public class Personaje {
    
    private int id;
    private String nombre;
    private int edad;
    private int peso;
    private String historia; 
    private String peli;
    private Pelicula pelicula;
    private String imagen;
     private List<Pelicula> peliculas;
    

    public Personaje() {
    }

    public Personaje(String nombre, int edad, int peso, String historia, String peli, String imagen) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.historia = historia;
        this.peli = peli;
        this.imagen = imagen;
    }

   
    public Personaje(String nombre, int edad, int peso, String historia, Pelicula pelicula, String imagen) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.historia = historia;
        this.pelicula = pelicula;
        this.imagen = imagen;
    }

    public Personaje(int id, String nombre, int edad, int peso, String historia, String peli, String imagen) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.historia = historia;
        this.peli = peli;
        this.imagen = imagen;
       
    }

    public int getId() {
        return id;
    }

    public void setId(int idPersonaje) {
        this.id = idPersonaje;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getHistoria() {
        return historia;
    }

    public void setHistoria(String historia) {
        this.historia = historia;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public List<Pelicula> getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(List<Pelicula> peliculas) {
        this.peliculas = peliculas;
    }

    public String getPeli() {
        return peli;
    }

    public void setPeli(String peli) {
        this.peli = peli;
    }
    
    



    @Override
    public String toString() {
        return "Personaje{" + "idPersonaje=" + id + ", nombre=" + nombre + ", edad=" + edad + ", peso=" + peso + ", historia=" + historia + ", pelicula=" + pelicula + ", imagen=" + imagen + '}';
    }
    
    
    
    

   
    


    
    


   
    
    
    
}
