/*
MÓDULO 3: FACTURA 
 */
package proyecto01;

public class Factura {
//-.-.-.-.-.-.-.-.-.-.--.-.ATRIBUTOS-.-.-.-.-.-.-.-.-.-.-.-.-.--.

    private String fecha; //esto de fecha y hora se puede hacer diferente
    private String hora;
    private String descripcion; //esto de descripción y cliente creo que se puede hacer mejor
    private String cliente;

//-.-.-.-.-.-.-.-.-.-.--.-.CONSTRUCTOR-.-.-.-.-.-.-.-.-.-.-.-.-.--.
    public Factura() {
        this.fecha = "";
        this.hora = "";
        this.descripcion = "";
        this.cliente = "";
    }

//-.-.-.-.-.-.-.-.-.-.--.-.FUNCIONES-.-.-.-.-.-.-.-.-.-.-.-.-.--.
    public void facturar() {

    }

    public void anularFactura() {

    }

    public void mostrarBD() {
        //método para mostrar todos los elementos almacenados en la base de datos. 
        //java interfaces
    }

//-.-.-.-.-.-.-.-.-.-.--.-.GETTERS Y SETTERS-.-.-.-.-.-.-.-.-.-.-.-.-.--.    
    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
    //Fin
}
