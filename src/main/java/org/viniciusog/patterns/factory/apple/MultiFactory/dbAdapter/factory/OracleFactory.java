package org.viniciusog.patterns.factory.apple.MultiFactory.dbAdapter.factory;

import org.viniciusog.patterns.factory.apple.MultiFactory.dbAdapter.db.DB;
import org.viniciusog.patterns.factory.apple.MultiFactory.dbAdapter.db.OracleDB;

public class OracleFactory implements DBFactory {

    @Override
    public DB createDatabase() {
        return new OracleDB();
    }
}