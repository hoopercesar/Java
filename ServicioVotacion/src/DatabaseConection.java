import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConection {

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
            Connection conexion = DriverManager.getConnection(url, usuario, password);

            // Realizar operaciones en la base de datos aquí...

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
