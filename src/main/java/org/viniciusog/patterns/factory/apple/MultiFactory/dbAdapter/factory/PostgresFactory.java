package org.viniciusog.patterns.factory.apple.MultiFactory.dbAdapter.factory;

import org.viniciusog.patterns.factory.apple.MultiFactory.dbAdapter.db.DB;
import org.viniciusog.patterns.factory.apple.MultiFactory.dbAdapter.db.PostgresDB;

public class PostgresFactory implements DBFactory {

    @Override
    public DB createDatabase() {
        return new PostgresDB();
    }
}