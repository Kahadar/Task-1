package jm.task.core.jdbc.util;

//import com.sun.jdi.connect.spi.Connection;
//import org.hibernate.hql.internal.ast.tree.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class Util {
    public static final String USER_NAME = "postgres";
    public static final String PASSWORD = "root";
    public static final String URL = "jdbc:postgresql://localhost:5432/testTask";
    private static final String DRIVER = "org.postgresql.Driver";

    public static Statement statement;
    public static Connection connection;


    public Util(){};


    public static Connection getConnection() {
        try{
            Class.forName(DRIVER);
            connection =
                    DriverManager.getConnection(URL,USER_NAME,PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
        return connection;
    }

    public static void setConnection(Connection connection) {
        Util.connection = connection;
    }


    // реализуйте настройку соеденения с БД
}
