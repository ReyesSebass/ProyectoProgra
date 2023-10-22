/*
MÓDULO 2: CATÁLOGOS 
 */
package proyecto01;

public class Deporte {

//-.-.-.-.-.-.-.-.-.-.--.-.ATRIBUTOS-.-.-.-.-.-.-.-.-.-.-.-.-.--.
    protected String nombre;
    protected String caracteristicas;
    protected TipoDeporte tipo;

//-.-.-.-.-.-.-.-.-.-.--.-.CONSTRUCTOR-.-.-.-.-.-.-.-.-.-.-.-.-.--.
    public Deporte() {
       this.caracteristicas="";
       this.nombre="";
       this.tipo=null;
    }

//-.-.-.-.-.-.-.-.-.-.--.-.FUNCIONES-.-.-.-.-.-.-.-.-.-.-.-.-.--.
    public void agregarDeporte() {
        //verificar exitencia de datos antes de agregar 
    }

    public void editarDeporte() {

    }

    public void inactivarDeporte() {
        //verificar exitencia de datos antes de inabilitar
    }

//-.-.-.-.-.-.-.-.-.-.--.-.GETTERS Y SETTERS-.-.-.-.-.-.-.-.-.-.-.-.-.--.    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public TipoDeporte getTipo() {
        return tipo;
    }

    public void setTipo(TipoDeporte tipo) {
        this.tipo = tipo;
    }
    //Fin
    
}