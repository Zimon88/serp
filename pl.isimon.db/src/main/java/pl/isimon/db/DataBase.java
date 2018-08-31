package pl.isimon.db;

import org.pmw.tinylog.Configurator;
import org.pmw.tinylog.Level;
import org.pmw.tinylog.writers.FileWriter;

import java.sql.Connection;

public abstract class DataBase {

    private static final String DB_DRIVER = "";
    private static final String DB_CONNECTION = "";
    private static final String DB_USER = "";
    private static final String DB_PASSWORD = "";

    DataBase() {
        Configurator.defaultConfig()
            .writer(new FileWriter("log.txt"))
            .level(Level.DEBUG)
            .activate();
    }

    public abstract Connection getDBConnection();

    public void select() {

    }

    public void insert() {

    }

    public void update() {

    }

    public void delete() {

    }
}
