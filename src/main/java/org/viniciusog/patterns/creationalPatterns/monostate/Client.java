package org.viniciusog.patterns.creationalPatterns.monostate;

import org.viniciusog.patterns.creationalPatterns.monostate.connection.Connection;
import org.viniciusog.patterns.creationalPatterns.monostate.connection.ConnectionPool;

public class Client {

    // MAX_CONNECTIONS is 2, query3 will not work since all connections are being used
    public static void main(String[] args) {
        query1();
        query2();
        query3();
    }

    public static void query1() {
        ConnectionPool connectionPool = new ConnectionPool();
        Connection con = connectionPool.getConnection();
        if (con != null)
            con.query("SELECT * FROM a1");
    }

    public static void query2() {
        ConnectionPool connectionPool = new ConnectionPool();
        Connection con = connectionPool.getConnection();
        if (con != null)
            con.query("SELECT * FROM a2");
    }

    public static void query3() {
        ConnectionPool connectionPool = new ConnectionPool();
        Connection con = connectionPool.getConnection();
        if (con != null)
            con.query("SELECT * FROM a3");
    }
}
