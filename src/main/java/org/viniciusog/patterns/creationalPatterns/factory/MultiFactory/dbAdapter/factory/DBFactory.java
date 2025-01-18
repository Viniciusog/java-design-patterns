package org.viniciusog.patterns.creationalPatterns.factory.MultiFactory.dbAdapter.factory;

import org.viniciusog.patterns.creationalPatterns.factory.MultiFactory.dbAdapter.db.DB;

public interface DBFactory {
    DB createDatabase();
}
