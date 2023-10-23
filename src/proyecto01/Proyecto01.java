package proyecto01;

import javax.swing.JOptionPane;


public class Proyecto01 {
    public static void main(String[] args) {
        Usuario usuario = new Usuario();

        while (true) {
            String opcion = JOptionPane.showInputDialog(
                    "Menú de Opciones:\n" +
                    "1. Agregar Usuario\n" +
                    "2. Consultar Usuarios\n" +
                    "3. Consultar Usuario Específico\n" +
                    "4. Inactivar Usuario\n" +
                    "5. Salir\n" +
                    "Ingrese el número de la opción deseada:"
            );

            switch (opcion) {
                case "1":
                    usuario.agregarU();
                    break;
                case "2":
                    usuario.consultarU();
                    break;
                case "3":
                    usuario.consultarUEspecifico();
                    break;
                case "4":
                    usuario.inactivarU();
                    break;
                case "5":
                    JOptionPane.showMessageDialog(null, "Saliendo del programa.");
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida. Ingrese un número del 1 al 5.");
                    break;
            }
        }
    }
    
}
