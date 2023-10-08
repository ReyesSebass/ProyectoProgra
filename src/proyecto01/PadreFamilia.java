/*
 MÓDULO 2: CATÁLOGOS 
 */
package proyecto01;

public class PadreFamilia extends Usuario {

//-.-.-.-.-.-.-.-.-.-.--.-.ATRIBUTOS-.-.-.-.-.-.-.-.-.-.-.-.-.--.
    private Deportista hijo;
    private String identificacion;
    private String ciudad;
    private String direccion;
    private String telefono;
    private String correo;

//-.-.-.-.-.-.-.-.-.-.--.-.CONSTRUCTOR-.-.-.-.-.-.-.-.-.-.-.-.-.--.
    public PadreFamilia() {
        super.nombre="";
        super.apellidos="";
        super.estado=null;
        this.apellidos="";
        this.ciudad="";
        this.correo="";
        this.direccion="";
        this.telefono="";
        this.identificacion="";
        this.hijo = null;
    }

//-.-.-.-.-.-.-.-.-.-.--.-.FUNCIONES-.-.-.-.-.-.-.-.-.-.-.-.-.--.
    public void agregarPadreFamilia() {
        //verificar exitencia de datos antes de agregar 
    }

    public void editarPadreFamilia() {

    }

    public void inactivarPadreFamilia() {
        //verificar exitencia de datos antes de inabilitar
    }

//-.-.-.-.-.-.-.-.-.-.--.-.GETTERS Y SETTERS-.-.-.-.-.-.-.-.-.-.-.-.-.--.    
    public Deportista getHijo() {
        return hijo;
    }

    public void setHijo(Deportista hijo) {
        this.hijo = hijo;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
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
}
