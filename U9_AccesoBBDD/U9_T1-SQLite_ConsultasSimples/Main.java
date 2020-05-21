import java.sql.*;

public class Main {
    public static void main(String[] args) {
        Connection connection = null;

        try {
            //Primero creamos la conexion a la base de datos
            connection = DriverManager.getConnection("jdbc:sqlite:metadata.db");
            Statement statement = connection.createStatement();
            statement.setQueryTimeout(30); //Tiempo de respuesta de 30 segundos

            //Guardamos el resultado de la consulta
            ResultSet rs = statement.executeQuery("select * from customers where state = null");
            while (rs.next()) {
                System.out.println("Nombre: "+rs.getString("customerName"));
            }

            rs = statement.executeQuery("select * from payments where amount > 30000");
            while (rs.next()) {
                System.out.println("Cliente: "+rs.getString("customerName")+", cantidad:"+rs.getString("amount"));
            }

            rs = statement.executeQuery("select * from employees reportsTo = 1143");
            while (rs.next()) {
                System.out.println("Nombre: "+rs.getString("lastName")+" "+rs.getString("firstName"));
            }

        } catch(SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
