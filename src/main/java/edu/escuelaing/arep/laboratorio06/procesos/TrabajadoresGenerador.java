package edu.escuelaing.arep.laboratorio06.procesos;

import java.sql.SQLException;
import java.util.*;
import org.springframework.stereotype.Service;

import edu.escuelaing.arep.laboratorio06.datos.Trabajador;


@Service
public interface TrabajadoresGenerador{
    public List<Trabajador> ObtenerTrabajadores() throws SQLException ;  
    public void CrearTrabajador(Trabajador trabajador) throws SQLException;
}