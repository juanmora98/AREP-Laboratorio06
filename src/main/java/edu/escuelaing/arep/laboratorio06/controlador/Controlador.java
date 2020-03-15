package edu.escuelaing.arep.laboratorio06.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import edu.escuelaing.arep.laboratorio06.datos.Trabajador;
import edu.escuelaing.arep.laboratorio06.procesos.TrabajadoresGenerador;

@RestController
@RequestMapping("/paginainicial")
public class Controlador {

	@Autowired
	TrabajadoresGenerador trabajadoresGenerador;
	
	@RequestMapping(value="/trabajadores",method = RequestMethod.GET)
	public ResponseEntity<?> listAllTasks(){
	    try {
	        return new ResponseEntity<>(trabajadoresGenerador.ObtenerTrabajadores(),HttpStatus.ACCEPTED);
	    } catch (Exception ex) {
	        return new ResponseEntity<>("Lo sentimos, no se pudo obtener la lista.",HttpStatus.NOT_FOUND);
	    }
    }
	@PostMapping("/trabajadores")
    public ResponseEntity<?> createTask(@RequestBody Trabajador trabajador) {
        try {
        	trabajadoresGenerador.CrearTrabajador(trabajador);
            return new ResponseEntity<>(trabajador, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>("No se puede crear el trabajador o la tarea asignada", HttpStatus.FORBIDDEN);
        }
    }
}