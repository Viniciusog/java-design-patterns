package org.viniciusog.patterns.creationalPatterns.monostate.connection;

import java.util.ArrayList;
import java.util.List;

public class ConnectionPool {

    private static final Integer MAX_CONNECTIONS = 2;
    private static List<Connection> connections = new ArrayList<>();

    static {
        for (int i = 0; i < MAX_CONNECTIONS; i++) {
            connections.add(new Connection());
        }
    }

    public ConnectionPool() {
        System.out.println("New ConnectionPool instance created");
    }

    public Connection getConnection() {
        Connection connection = null;

        for (Connection conn : connections) {
            if (!conn.inUse()) {
                connection = conn;
                break;
            }
        }

        if (connection == null) {
            System.out.println("No connection available.");
            return null;
        }

        connection.setInUse(true);
        return connection;
    }
}
