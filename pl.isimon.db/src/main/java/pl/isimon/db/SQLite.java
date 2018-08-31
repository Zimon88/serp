package pl.isimon.db;

import java.sql.Connection;

public class SQLite extends DataBase {

    private SQLite() {
        super();
    }

    @Override
    public Connection getDBConnection() {
        return null;
    }
}
