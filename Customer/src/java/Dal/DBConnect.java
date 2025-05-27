package dal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
    protected Connection c;

    public DBConnect() {
        try {
            String url = "jdbc:mysql://localhost:3306/customer?useSSL=false&serverTimezone=UTC";
            String username = "root"; // hoặc user MySQL của bạn
            String pass = "123";      // mật khẩu tương ứng
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection(url, username, pass);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void closeConnection() {
        try {
            if (c != null && !c.isClosed()) {
                c.close();
                System.out.println("Connection closed successfully.");
            }
        } catch (SQLException e) {
            System.out.println("Error closing connection: " + e.getMessage());
        }
    }
}
