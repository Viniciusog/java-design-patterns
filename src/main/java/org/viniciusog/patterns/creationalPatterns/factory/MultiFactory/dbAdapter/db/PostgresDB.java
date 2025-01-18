package org.viniciusog.patterns.creationalPatterns.factory.MultiFactory.dbAdapter.db;

public class PostgresDB implements DB {
    @Override
    public void query(String sql) {
        System.out.println("Querying " + sql + " in Postgres database");
    }

    @Override
    public void update(String sql) {
        System.out.println("Updating " + sql + " in Postgres database");
    }
}
