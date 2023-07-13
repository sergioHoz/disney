
package ar.com.disney.desafio.test;

import ar.com.disney.desafio.connector.Connector;
import ar.com.disney.desafio.connector.repositories.jdbc.PeliculasDisney;
import ar.com.disney.desafio.connector.repositories.jdbc.PersonajeDisney;
import ar.com.disney.desafio.entities.Imagen;
import ar.com.disney.desafio.entities.Pelicula;
import ar.com.disney.desafio.entities.Personaje;
import ar.com.disney.desafio.repositories.interfaces.IPelicula;
import ar.com.disney.desafio.repositories.interfaces.IPersonaje;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

public class Test {

    public static void main(String[] args) {
       
        
       /* IPelicula pe = new PeliculasDisney(Connector.conectar());
        
        
        Pelicula peli = new Pelicula("Hercules", LocalDate.now(),5, "Zeus", "C:\\\\Users\\\\sergi\\\\programando\\\\imagenes\\\\Mike1.jpg");
        
       // pe.creacion(peli);
        
        List<Pelicula> pelis = pe.getAllPeliculas();
        
        */
        
        
        /*for (Pelicula p: pelis) {
            
            System.out.println(p);
            
        }*/
        
        
        IPersonaje personajes = new PersonajeDisney(Connector.conectar());
        
                
                 Personaje personaje1=  new Personaje("Randall Boggs", 6, 42, "Randall es un monstruo que tiene la capacidad de camuflarse como un camaleón.", "Monsters, Inc.", "img/Randall_Boggs.jpg");
        
                 Personaje personaje2 = new Personaje( "James P. Sullivan", 6, 42, "Sulley es uno de los mejores asustadores bajo su jefe Henry J. Waternoose,",  "Monsters, Inc.","img/Sulley.jpg" );
       
                 
                Personaje personaje4 = new Personaje( "Mike Wazowski", 6, 42, "Es un vivaraz monstruo verde de un solo ojo. Es el mejor amigo de Sulley",  "Monsters, Inc.","img/Mike1.jpg" );
                
                Personaje personaje3 =  new Personaje("BOO", 6, 42, "Boo es una niña que, un día, entró a Monstruópolis, el mundo de los monstruos", "Monsters, Inc.", "img/Boo.jpg");
                
                
                
                personajes.creacion(personaje2);
                personajes.creacion(personaje4);
                personajes.creacion(personaje1);
                
              /* List<Personaje> mis_personajes = personajes.getAllPersonajes();
               
               
        for (Personaje p: mis_personajes) {
            
            
                System.out.println( p.getImagen());
        }*/
               
               
                
        
        /* Personaje personaje2 =  new Personaje("BOO", 6, 42, "Boo es una niña que, un día, entró a Monstruópolis, el mundo de los monstruos", "Monsters, Inc.", "C:\\Users\\sergi\\programando\\imagenes\\Boo.jpg");
                
                 personajes.creacion(personaje4);
                 
                 
         /*IPersonaje personaje = new PersonajeDisney(Connector.conectar());
         
         Personaje batman = new Personaje("batman", 23, 98,"heroe","Batman", "C:\\Users\\sergi\\programando\\imagenes\\Mike1.jpg");
         
        // personaje.creacion(batman);
         
          List<Personaje> personajes = personaje.getLikePersonajes("b");
         
          
          
          for (Personaje p: personajes) {
            
              System.out.println(p);
        }*/
          
        
        /*
        IPersonaje personaje = new PersonajeDisney(Connector.conectar());
        
        Personaje batman = new Personaje("batman", 23, 98,"heroe", new Pelicula(), "C:\\Users\\sergi\\programando\\imagenes\\Mike1.jpg");
        
        batman.setNombre("batman");
        
        personaje.eiminacion(batman);
        
        personaje.creacion(batman);*/
        
        
        
        
        
      
        /*
         List<Personaje> personajes = new ArrayList();
         List<Pelicula> pelicula = new ArrayList();
         
         pelicula.add( new Pelicula("Batman y el caballero de la noche ",  LocalDate.of(2012, Month.SEPTEMBER, 3), 5, null,""));
         
                
        Personaje per = new Personaje("Batman", 32, 80, "super heroe", null, "");
        
        System.out.println(per.toString());*/
        
        
        /*
        try {
            
           BufferedImage imagen = ImageIO.read(new FileInputStream("C:\\Users\\sergi\\programando\\imagenes\\Mike1.jpg"));
           
           img.setImagen(imagen);
           
            Personaje personaje2 =  new Personaje("BOO", 6, 42, "Boo es una niña que, un día, entró a Monstruópolis, el mundo de los monstruos", "Monsters, Inc.","");
            IPersonaje mi_personaje = new PersonajeDisney(Connector.conectar());
            
            mi_personaje.creacion(personaje2);
            
        } catch (IOException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        }*/
        
        
       // IPelicula mi_pelicula = new PeliculasDisney(Connector.conectar());
        
       
        
        //Pelicula pelicula = new Pelicula();
        
        //pelicula.setTitulo("Monsters, Inc.");
        
       // Personaje personaje1 = new Personaje( "Mike Wazowski", 6, 42, "Es un vivaraz monstruo verde de un solo ojo. Es el mejor amigo de Sulley",  "Monsters, Inc.",img );
        
        /* Personaje personaje2 =  new Personaje("BOO", 6, 42, "Boo es una niña que, un día, entró a Monstruópolis, el mundo de los monstruos", "Monsters, Inc.", "C:\\Users\\sergi\\programando\\imagenes\\Boo.jpg");
        
          Personaje personaje3 = new Personaje( "James P. Sullivan", 6, 42, "Sulley es uno de los mejores asustadores bajo su jefe Henry J. Waternoose,",  "Monsters, Inc.","C:\\Users\\sergi\\programando\\imagenes\\Sulley.jpg" );
        
         Personaje personaje4=  new Personaje("Randall Boggs", 6, 42, "Randall es un monstruo que tiene la capacidad de camuflarse como un camaleón.", "Monsters, Inc.", "C:\\Users\\sergi\\programando\\imagenes\\Randall_Boggs.jpg");
         */
                                                                                                        
        //Personaje personaje2 = new Personaje("Monsters, Inc.","Mike Wazowski", 26, 47, "Es un vivaraz monstruo verde de un solo ojo. Es el mejor amigo de Sulley", "C:\\Users\\sergi\\programando\\imagenes\\Mike1.jpg");
        
      /* mi_personaje.creacion(personaje1);
       mi_personaje.creacion(personaje2);
       mi_personaje.creacion(personaje3);
       mi_personaje.creacion(personaje4);*/
      
      //personaje1.setImagen("C:\\Users\\sergi\\programando\\imagenes\\Mike1.jpg");
      
      //mi_personaje.edicion(personaje1);
      
      
      
      
      //mi_personaje.eiminacion(personaje2);
      
        //Pelicula pelicula2 = new Pelicula("Monsters, Inc.", LocalDate.of(2001, Month.JUNE, 12), 4, "Mike WazowskiMike", "C:\\Users\\sergi\\programando\\imagenes\\Monstruos_sa.jpg");
        
         //mi_pelicula.creacion(pelicula2);
         
         
        
        
    }
    
}
