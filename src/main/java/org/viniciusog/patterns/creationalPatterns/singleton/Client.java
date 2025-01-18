package org.viniciusog.patterns.creationalPatterns.singleton;

import org.viniciusog.patterns.creationalPatterns.singleton.connection.Connection;
import org.viniciusog.patterns.creationalPatterns.singleton.connection.ConnectionPool;

public class Client {

    public static void main(String[] args) {
        query1();
        query2();
        query3();
    }

    public static void query1() {
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        connection.query("SELECT * FROM car");
    }

    public static void query2() {
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        connection.query("SELECT * FROM customer");
    }

    public static void query3() {
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        connection.query("SELECT * FROM sales");
    }
}
