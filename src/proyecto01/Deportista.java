/*
MÓDULO 2: CATÁLOGOS 
 */
package proyecto01;

public class Deportista extends Usuario {

//-.-.-.-.-.-.-.-.-.-.--.-.ATRIBUTOS-.-.-.-.-.-.-.-.-.-.-.-.-.--.
    private String deporte;
    private String identificacion;
    private String ciudad;
    private String direccion;
    private String telefono;
    private String correo;

//-.-.-.-.-.-.-.-.-.-.--.-.CONSTRUCTOR-.-.-.-.-.-.-.-.-.-.-.-.-.--.
    public Deportista() {
        super.nombre="";
        super.apellidos="";
        super.estado=null;
        this.deporte = "";
        this.apellidos="";
        this.ciudad="";
        this.correo="";
        this.direccion="";
        this.telefono="";
        this.identificacion="";
    }

//-.-.-.-.-.-.-.-.-.-.--.-.FUNCIONES-.-.-.-.-.-.-.-.-.-.-.-.-.--.
    public void agregarDeportistas() {
        //verificar exitencia de datos antes de agregar 
    }

    public void editarDeportistas() {

    }

    public void inactivarDeportistas() {
        //verificar exitencia de datos antes de inabilitar
    }

//-.-.-.-.-.-.-.-.-.-.--.-.GETTERS Y SETTERS-.-.-.-.-.-.-.-.-.-.-.-.-.--.    
    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }
    //Fin
}