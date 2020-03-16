package edu.escuelaing.arep.laboratorio06.procesos;

import java.sql.SQLException;
import java.util.*;
import org.springframework.stereotype.Service;

import edu.escuelaing.arep.laboratorio06.datos.Trabajador;


/**
 * Interfaz creada para los distintos trabajos que tienen que ver con los trabajadores
 */
@Service
public interface TrabajadoresGenerador{
    /**
     * Metodo encargado de obtener todos los trabajadores que se encuentran en la lista
     */
    public List<Trabajador> ObtenerTrabajadores() throws SQLException ;  
    /**
     * Metodo encargado de crear un trabajador nuevo en la tabla
     * @param trabajador
     * @throws SQLException
     */
    public void CrearTrabajador(Trabajador trabajador) throws SQLException;
}