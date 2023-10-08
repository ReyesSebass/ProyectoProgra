/*
MÓDULO 1: REGISTRO DE USUARIOS 
*/
package proyecto01;

public class Usuario {

//-.-.-.-.-.-.-.-.-.-.--.-.ATRIBUTOS-.-.-.-.-.-.-.-.-.-.-.-.-.--.
    protected String nombre;
    protected String apellidos;
    protected String nickname;
    protected String password;
    protected Estado estado;
    protected TipoUsuario tipo;

//-.-.-.-.-.-.-.-.-.-.--.-.CONSTRUCTOR-.-.-.-.-.-.-.-.-.-.-.-.-.--.
    public Usuario() {
        this.nombre = "";
        this.apellidos = "";
        this.nickname = "";
        this.password = "";
        this.estado = null;
        this.tipo=null;
        
    }

//-.-.-.-.-.-.-.-.-.-.--.-.FUNCIONES-.-.-.-.-.-.-.-.-.-.-.-.-.--.
    public void agregarU() {
        //arrayList
    }

    public void consultarU() {
        //arrayList 
    }

    public void inactivarU() {
        //arrayList . verificar que el usario no tenga datos relacionados en ninguno 
        //de los otros catálogos antes de inactivar 
    }
//-.-.-.-.-.-.-.-.-.-.-.--GETTER Y SETTER-.-.-.-.-.-.-.-.-.-.-.-.-

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public TipoUsuario getTipo() {
        return tipo;
    }

    public void setTipo(TipoUsuario tipo) {
        this.tipo = tipo;
    }
    
}
