/*
MÓDULO 1: REGISTRO DE USUARIOS 
 */
package proyecto01;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Usuario {

//-.-.-.-.-.-.-.-.-.-.--.-.ATRIBUTOS-.-.-.-.-.-.-.-.-.-.-.-.-.--.
    protected String nombre;
    protected String apellidos;
    protected String nickname;
    protected String password;
    protected Estado estado;
    protected TipoUsuario tipo;

//-.-.-.-.-.-.-.-.-.-.--.-.ARRAYlIST-.-.-.-.-.-.-.-.-.-.-.-.-.--.
    private List usuarios = new ArrayList();

//-.-.-.-.-.-.-.-.-.-.--.-.CONSTRUCTOR-.-.-.-.-.-.-.-.-.-.-.-.-.--.
    public Usuario() {
        this.nombre = "";
        this.apellidos = "";
        this.nickname = "";
        this.password = "";
        this.estado = null;
        this.tipo = null;

    }

//-.-.-.-.-.-.-.-.-.-.--.-.FUNCIONES-.-.-.-.-.-.-.-.-.-.-.-.-.--.
    public void agregarU() {
        nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre:");
        apellidos = JOptionPane.showInputDialog(null, "Ingrese los apellidos:");
        nickname = JOptionPane.showInputDialog(null, "Ingrese el nombre de usuario:");
        password = JOptionPane.showInputDialog(null, "Ingrese la contraseña:");
        //Mostrar un cuadro de diálogo para elegir el tipo de usuario
        //Pobablemente esto se cambie, tampoco estoy seguro si así esta bien, no lo probe 
        TipoUsuario[] tipos = TipoUsuario.values();
        tipo = (TipoUsuario) JOptionPane.showInputDialog(
                null, "Seleccione el tipo de usuario:",
                "Tipo de Usuario",
                JOptionPane.QUESTION_MESSAGE,
                null,
                tipos,
                tipos[0]
        );
        //FALTA LO DEL ESTADO
        
        //Preguntarle al profe como se agrega en este caso
//        Usuario nuevoUsuario = new Usuario(nombre, apellidos, nickname, password, tipo);
//        usuarios.add(nuevoUsuario);
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
