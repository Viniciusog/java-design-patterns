package org.viniciusog.patterns.creationalPatterns.singleton.connection;

import java.util.ArrayList;
import java.util.List;

public class ConnectionPool {

    private static ConnectionPool singleton = new ConnectionPool();
    private List<Connection> connections = new ArrayList<>();
    private final Integer MAX_CONNECTIONS = 2;

    private ConnectionPool() {
        for (int i = 0; i < MAX_CONNECTIONS; i++) {
            connections.add(new Connection());
        }
    }

    public static ConnectionPool getInstance() {
        return singleton;
    }

    public Connection getConnection() {
        Connection connection = null;

        for (Connection conn : connections) {
            if (!conn.isInUse()) {
                connection = conn;
                break;
            }
        }

        if (connection == null) {
            System.out.println("No connection available.");
            return connection;
        }
        connection.setInUse(true);
        return connection;
    }
}
