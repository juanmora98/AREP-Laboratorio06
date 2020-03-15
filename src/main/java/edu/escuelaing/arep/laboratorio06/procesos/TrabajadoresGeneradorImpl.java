package edu.escuelaing.arep.laboratorio06.procesos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import edu.escuelaing.arep.laboratorio06.datos.*;


@Component
public class TrabajadoresGeneradorImpl implements TrabajadoresGenerador{
    
    //atributos
    public List<Trabajador> trabajadores;
    public Connection connection;
    public Statement statement;
    public ResultSet resultSet;


    @Autowired
	private DataSource dataSource;

    @Override
    public List<Trabajador> ObtenerTrabajadores() throws SQLException {
        String query = "SELECT * FROM trabajador";
	    IniciadorVariables();
		try {
			AsignacionVariablesConexion(query, 1);
			while (resultSet.next()) {
				Trabajador trabajador = new Trabajador(resultSet.getString("nombre"), resultSet.getString("tarea"), resultSet.getString("descripcion"));
				trabajadores.add(trabajador);
			}
			connection.close();
            return trabajadores;
            
		} catch (Exception e) {
			System.out.println(e.getMessage());
			throw new RuntimeException(e);
		}
    }

    @Override
    public void CrearTrabajador(Trabajador trabajador) throws SQLException {
        String query = "INSERT INTO trabajador VALUES ('"+ trabajador.getNombre()+
                    "','"+ trabajador.getTarea()+
                    "','"+ trabajador.getDescripcion()+"')";
	        IniciadorVariables();
	        try {
	            AsignacionVariablesConexion(query, 0);
	            statement.execute(query);
	            connection.close();
	            
	        } catch (SQLException e) {
	            System.err.println("Error al intentar crear el trabajador, Exception: " + e.getMessage());
	        } 

    }


    public void IniciadorVariables(){
        trabajadores = new ArrayList<Trabajador>();
        connection = null;
        statement = null;
        resultSet = null;
    }

    public void AsignacionVariablesConexion(String query, int bandera) throws SQLException {
        connection = dataSource.getConnection();
        statement = connection.createStatement();
        if(bandera == 1){
            resultSet = statement.executeQuery(query);
        }
		
    }

}