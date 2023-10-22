/*
MÓDULO 2: CATÁLOGOS  
 */
package proyecto01;

public class Rutina extends Deporte {
//-.-.-.-.-.-.-.-.-.-.--.-.ATRIBUTOS-.-.-.-.-.-.-.-.-.-.-.-.-.--.

    private String descripcion;
    private String duracion;
    private Dificultad nivel;

//-.-.-.-.-.-.-.-.-.-.--.-.CONSTRUCTOR-.-.-.-.-.-.-.-.-.-.-.-.-.--.
    public Rutina() {
        super();
        this.descripcion = "";
        this.duracion = "";
        this.nivel = null;
    }

//-.-.-.-.-.-.-.-.-.-.--.-.FUNCIONES-.-.-.-.-.-.-.-.-.-.-.-.-.--.
    public void agregarRutina() {
        //verificar exitencia de datos antes de agregar 
    }

    public void editarRutina() {

    }

    public void inactivarRutina() {
        //verificar exitencia de datos antes de inabilitar
    }

//-.-.-.-.-.-.-.-.-.-.--.-.GETTERS Y SETTERS-.-.-.-.-.-.-.-.-.-.-.-.-.--.    
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public Dificultad getNivel() {
        return nivel;
    }

    public void setNivel(Dificultad nivel) {
        this.nivel = nivel;
    }
    //Fin
}