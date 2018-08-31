package pl.isimon.db;

import org.pmw.tinylog.Logger;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class H2 extends DataBase {

    private static final String DB_DRIVER = "";
    private static final String DB_CONNECTION = "";
    private static final String DB_USER = "";
    private static final String DB_PASSWORD = "";

    private H2() {
        super();
    }

    @Override
    public Connection getDBConnection() {
        Connection dbConnection = null;
        try {
            Class.forName(DB_DRIVER);
        } catch (ClassNotFoundException e) {
            Logger.error(e.getMessage());
        }
        try {
            dbConnection = DriverManager.getConnection(DB_CONNECTION, DB_USER, DB_PASSWORD);
            return dbConnection;
        } catch (SQLException e) {
            Logger.error(e.getMessage());
        }
        return dbConnection;
    }
}
