package edu.escuelaing.arep.laboratorio06.datos;



public class Trabajador{

    //atributos
    public String nombre;
    public String tarea;
    public String descripcion;

    public Trabajador(){}

    /**
     * Metodo constructor de un trabajador
     * @param nombre
     * @param tarea
     * @param descripcion
     */
    public Trabajador(String nombre, String tarea, String descripcion){
        super();
        this.nombre = nombre;
        this.tarea = tarea;
        this.descripcion = descripcion;
    }

    /**
     * Metodo get para el nombre de un trabajador
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo de asignar un nombre para un trabajador
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo get pata obtener la tarea del trabajador
     * @return
     */
    public String getTarea() {
        return tarea;
    }

    /**
     * Metodo de asignar una tarea a un trabajador
     * @param tarea
     */
    public void setTarea(String tarea) {
        this.tarea = tarea;
    }


    /**
     * Metodo get para obtener la descripcion de la tarea del trabajador
     * @return descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Metodo set para asignar una descripcion de una tarea al trabajador
     * @param descripcion
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


    
















}