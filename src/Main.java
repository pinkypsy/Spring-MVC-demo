import utils.ConnectionManager;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        Connection connection = ConnectionManager.getInstance().getConnection();
        System.out.println(connection);
//        System.out.println(connection.getMetaData().getDriverName());
    }
}
