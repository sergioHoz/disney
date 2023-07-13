
package ar.com.disney.desafio.connector.repositories.jdbc;

import ar.com.disney.desafio.entities.Pelicula;
import ar.com.disney.desafio.entities.Personaje;
import ar.com.disney.desafio.repositories.interfaces.IPelicula;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class PeliculasDisney implements IPelicula {
    
    
     private Connection conn;
  

    public PeliculasDisney(Connection conn) {
        this.conn = conn;
    }
    

    @Override
    public void creacion(Pelicula pelicula) {
       
       
          if(pelicula == null) return;
        try{
            
            
            PreparedStatement ps=conn.prepareStatement("insert into peliculas(titulo,fecha,calificacion,personaje,imagen) values (?,?,?,?,?)",
                                                         PreparedStatement.RETURN_GENERATED_KEYS);
                   
            
            ps.setString(1,pelicula.getTitulo());
            ps.setDate(2,Date.valueOf(pelicula.getFecha()));
            ps.setInt(3, pelicula.getCalificacion());
            ps.setString(4, pelicula.getPersonaje());
            ps.setString(5,pelicula.getImagen());
            ps.execute();
            
             ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                pelicula.setId(rs.getInt(1));
            }

            rs.close();
            
        
        } catch (Exception e) {
            System.out.println("*********************************************");
            e.printStackTrace();
            System.out.println("*********************************************");
        }
    }

    @Override
    public void eiminacion(Pelicula pelicula) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void edicion(Pelicula pelicula) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    @Override
    public List<Personaje> getAllPersonaje() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Pelicula> getAllPeliculas() {
        
         List<Pelicula> list=new ArrayList();
         
        try (ResultSet rs=conn.createStatement().executeQuery("select titulo,fecha,calificacion,personaje,imagen from peliculas")){
            while(rs.next()){
                
                Date f = rs.getDate("fecha");
       
                list.add(new Pelicula(
                        rs.getString("titulo"), 
                         f.toLocalDate() , 
                        rs.getInt("calificacion"),
                        rs.getString("personaje"), 
                        rs.getString("imagen")
                ));
            }
        } catch (Exception e) {
            System.out.println("*********************************************");
            System.out.println(e);
            System.out.println("*********************************************");
        }
        return list;
    }
    
}
