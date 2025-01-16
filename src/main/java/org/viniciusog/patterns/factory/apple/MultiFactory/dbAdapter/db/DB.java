package org.viniciusog.patterns.factory.apple.MultiFactory.dbAdapter.db;

public interface DB {
    void query(String sql);
    void update(String sql);
}
