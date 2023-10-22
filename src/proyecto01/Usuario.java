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
    private List<Usuario> usuarios = new ArrayList<>();

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
        Usuario usuario = new Usuario();
        usuario.nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre:");
        usuario.apellidos = JOptionPane.showInputDialog(null, "Ingrese los apellidos:");
        usuario.nickname = JOptionPane.showInputDialog(null, "Ingrese el nombre de usuario:");
        usuario.password = JOptionPane.showInputDialog(null, "Ingrese la contraseña:");
        //Mostrar un cuadro de diálogo para elegir el tipo de usuario
        TipoUsuario[] tipos = TipoUsuario.values();
        usuario.tipo = (TipoUsuario) JOptionPane.showInputDialog(
                null, "Seleccione el tipo de usuario:",
                "Tipo de Usuario",
                JOptionPane.QUESTION_MESSAGE,
                null,
                tipos,
                tipos[0]
        );
        usuario.estado = Estado.Activo;

        usuarios.add(usuario);
    }

    public void consultarU() {
        // Verificar si la lista de usuarios está vacía
        if (usuarios.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay usuarios registrados.");
            return;
        }

        // Recorrer la lista de usuarios e imprimir la información de cada uno
        System.out.println("Lista de usuarios registrados:");
        for (Usuario usuario : usuarios) {
            System.out.println("Nombre: " + usuario.getNombre() + "\n"
                    + "Apellidos: " + usuario.getApellidos() + "\n"
                    + "Nickname: " + usuario.getNickname() + "\n"
                    + "Tipo de Usuario: " + usuario.getTipo() + "\n"
                    + "Estado: " + usuario.getEstado() + "\n"
                    + "-------------------------------------");
        }
    }

    public void consultarUEspecifico() {
        boolean encontrado = false;
        for (Usuario usuario : usuarios) {
            String buscado = JOptionPane.showInputDialog(null, "Ingrese el nombre de usuario a consultar:");
            if (usuario.getNickname().equals(buscado)) {
                JOptionPane.showMessageDialog(null, "Nombre: " + usuario.getNombre() + "\n"
                        + "Apellidos: " + usuario.getApellidos() + "\n"
                        + "Nickname: " + usuario.getNickname() + "\n"
                        + "Tipo de Usuario: " + usuario.getTipo() + "\n"
                        + "Estado: " + usuario.getEstado());
                encontrado = true;
                break; // Si encontramos al usuario, podemos salir del bucle.
            }
        }

        if (!encontrado) {
            JOptionPane.showMessageDialog(null, "Usuario no encontrado.");
        }
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
    //Fin

}
