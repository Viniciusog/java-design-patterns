package org.viniciusog.patterns.factory.apple.MultiFactory.dbAdapter.factory;

import org.viniciusog.patterns.factory.apple.MultiFactory.dbAdapter.db.DB;

public interface DBFactory {
    DB createDatabase();
}
