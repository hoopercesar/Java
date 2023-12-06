package dao;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Connection {

    public static void conection() {
        // Configuración de la conexión
        String url = "jdbc:mysql://localhost:3306/sistema_votacion";
        String usuario = "root";
        String password = "Password123#@!";

        // Intentar establecer la conexión
        try {
            // Cargar el controlador JDBC
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establecer la conexión
            java.sql.Connection conexion = DriverManager.getConnection(url, usuario, password);

            // salida conexion exitosa
            if (conexion != null) {
                System.out.println("La conexión se estableció satisfactoriamente");
            }

            // Operaciones en la base de datos




            // Cerrar la conexión cuando hayas terminado
            conexion.close();
        } catch (ClassNotFoundException e) {
            System.err.println("Error al cargar el controlador JDBC: " + e.getMessage());
        } catch (
                SQLException e) {
            System.err.println("Error al conectar a la base de datos: " + e.getMessage());
        }
    }
}
