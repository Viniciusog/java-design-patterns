package org.viniciusog.patterns.creationalPatterns.factory.MultiFactory.dbAdapter;

import org.viniciusog.patterns.creationalPatterns.factory.MultiFactory.dbAdapter.db.DB;
import org.viniciusog.patterns.creationalPatterns.factory.MultiFactory.dbAdapter.factory.DBFactory;
import org.viniciusog.patterns.creationalPatterns.factory.MultiFactory.dbAdapter.factory.OracleFactory;
import org.viniciusog.patterns.creationalPatterns.factory.MultiFactory.dbAdapter.factory.PostgresFactory;

public class Client {

    public static void main(String[] args) {

        DBFactory factory = new OracleFactory();
        DB oracleDatabase = factory.createDatabase();
        oracleDatabase.query("SELECT * FROM User");
        oracleDatabase.update("UPDATE User SET name = 'New name' WHERE id = 1");
        System.out.println();

        DBFactory postgresFactory = new PostgresFactory();
        DB postgresDatabase = postgresFactory.createDatabase();
        postgresDatabase.query("SELECT * FROM User");
        postgresDatabase.update("UPDATE User SET name = 'New name' WHERE id = 1");
    }
}
