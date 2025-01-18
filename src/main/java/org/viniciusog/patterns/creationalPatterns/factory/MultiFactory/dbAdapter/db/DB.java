package org.viniciusog.patterns.creationalPatterns.factory.MultiFactory.dbAdapter.db;

public interface DB {
    void query(String sql);
    void update(String sql);
}
