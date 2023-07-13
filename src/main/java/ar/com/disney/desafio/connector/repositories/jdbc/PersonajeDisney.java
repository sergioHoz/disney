package ar.com.disney.desafio.connector.repositories.jdbc;

import ar.com.disney.desafio.entities.Pelicula;
import ar.com.disney.desafio.entities.Personaje;
import ar.com.disney.desafio.repositories.interfaces.IPersonaje;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class PersonajeDisney implements IPersonaje {

    private Connection conn;

    public PersonajeDisney(Connection conn) {
        this.conn = conn;
    }

    @Override
    public void creacion(Personaje personaje) {


        if (personaje == null) {
            return;
        }

        try {

            PreparedStatement ps = conn.prepareStatement("insert into personaje(nombre,edad,peso,historia,pelicula,imagen) values (?,?,?,?,?,?)",
                    PreparedStatement.RETURN_GENERATED_KEYS);

            ps.setString(1, personaje.getNombre());
            ps.setInt(2, personaje.getEdad());
            ps.setInt(3, personaje.getPeso());
            ps.setString(4, personaje.getHistoria());
            ps.setString(5, personaje.getPeli());
            ps.setString(6, personaje.getImagen());

            ps.execute();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                personaje.setId(rs.getInt(1));
            }

            rs.close();

        } catch (Exception e) {
            System.out.println("*********************************************");
            e.printStackTrace();
            System.out.println("*********************************************");
        }

    }

    @Override
    public void eiminacion(Personaje personaje) {

        if (personaje == null) {
            return;
        }
        try {

            PreparedStatement ps = conn.prepareStatement("DELETE from personaje where nombre=?");

            ps.setString(1, personaje.getNombre());

            ps.execute();

        } catch (Exception e) {
            System.out.println("*********************************************");
            e.printStackTrace();
            System.out.println("*********************************************");
        }

    }

    @Override
    public void edicion(Personaje personaje) {

        
        if(personaje == null) return;
                try (PreparedStatement ps=conn.prepareStatement(
                        "update personaje set edad=?, peso=?, historia=?, pelicula=?, imagen=? where nombre=?"
                )){
            
            ps.setInt(1, personaje.getEdad());
            ps.setInt(2, personaje.getPeso());
            ps.setString(3, personaje.getHistoria());
            ps.setString(4,personaje.getPeli());
            ps.setString(5, personaje.getImagen());
            ps.setString(6, personaje.getNombre());
            ps.execute();
        } catch (Exception e) {
            System.out.println("*********************************************");
            System.out.println(e);
            System.out.println("*********************************************");
        }
        
         
    }

   
    
    @Override
    public List<Personaje> getAllPersonajes() {
        
          List<Personaje> list=new ArrayList();
           Pelicula pelicula = new Pelicula();       
        try (ResultSet rs=conn.createStatement().executeQuery("select nombre,edad,peso,historia,pelicula,imagen from personaje")){
            while(rs.next()){
                list.add(new Personaje(
                        rs.getString("nombre"), 
                        rs.getInt("edad"), 
                        rs.getInt("peso"), 
                        rs.getString("historia"), 
                        rs.getString("pelicula"), 
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
