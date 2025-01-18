package org.viniciusog.patterns.creationalPatterns.factory.MultiFactory.dbAdapter.db;

public class OracleDB implements DB {
    @Override
    public void query(String sql) {
        System.out.println("Querying " + sql + " in Oracle database");
    }

    @Override
    public void update(String sql) {
        System.out.println("Updating " + sql + " in Oracle database");
    }
}