package edu.escuelaing.arep.laboratorio06.datos;



public class Trabajador{

    //atributos
    public String nombre;
    public String tarea;
    public String descripcion;

    public Trabajador(){}

    public Trabajador(String nombre, String tarea, String descripcion){
        super();
        this.nombre = nombre;
        this.tarea = tarea;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTarea() {
        return tarea;
    }

    public void setTarea(String tarea) {
        this.tarea = tarea;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


    
















}