package org.viniciusog.patterns.creationalPatterns.factory.MultiFactory.dbAdapter.factory;

import org.viniciusog.patterns.creationalPatterns.factory.MultiFactory.dbAdapter.db.DB;
import org.viniciusog.patterns.creationalPatterns.factory.MultiFactory.dbAdapter.db.OracleDB;

public class OracleFactory implements DBFactory {

    @Override
    public DB createDatabase() {
        return new OracleDB();
    }
}