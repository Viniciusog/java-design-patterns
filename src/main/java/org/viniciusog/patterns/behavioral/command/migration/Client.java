package org.viniciusog.patterns.behavioral.command.migration;

import org.viniciusog.patterns.behavioral.command.migration.commands.ProductTable;
import org.viniciusog.patterns.behavioral.command.migration.commands.UserTable;
import org.viniciusog.patterns.behavioral.command.migration.commands.UserTableRoleColumn;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Client {

    public static void main(String[] args) {

        Map<String, List<String>> database = new HashMap<>();
        MigrationTool migrationTool = new MigrationTool();
        migrationTool.addMigration(new UserTable(database));
        migrationTool.addMigration(new ProductTable(database));
        migrationTool.addMigration(new UserTableRoleColumn(database));

        System.out.println(database);

        migrationTool.up();
        System.out.println(database);

        migrationTool.up();
        System.out.println(database);

        migrationTool.up();
        System.out.println(database);

        migrationTool.up();
        System.out.println(database);

        migrationTool.down();
        System.out.println(database);

        migrationTool.down();
        System.out.println(database);

        migrationTool.down();
        System.out.println(database);

        migrationTool.down();
        System.out.println(database);

        migrationTool.latest();
        System.out.println(database);

        migrationTool.roolback();
        System.out.println(database);
    }
}
