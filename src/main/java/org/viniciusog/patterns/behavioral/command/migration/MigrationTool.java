package org.viniciusog.patterns.behavioral.command.migration;

import org.viniciusog.patterns.behavioral.command.migration.commands.MigrationCommand;

import java.util.ArrayList;
import java.util.List;

public class MigrationTool {

    List<MigrationCommand> migrations;
    // next migration to apply
    private int nextMigrationIndex;

    public MigrationTool() {
        migrations = new ArrayList<>();
        nextMigrationIndex = 0;
    }

    public void addMigration(MigrationCommand migration) {
        migrations.add(migration);
    }

    public void up() {
        if (migrations.size() > nextMigrationIndex) {
            migrations.get(nextMigrationIndex).execute();
            nextMigrationIndex++;
        } else {
            System.out.println("You are up to date!");
        }
    }

    public void down() {
        if (nextMigrationIndex > 0) {
            migrations.get(nextMigrationIndex - 1).undo();
            nextMigrationIndex--;
        } else {
            System.out.println("You don't have migrations left");
        }
    }

    public void latest() {
        while (nextMigrationIndex < migrations.size()) up();
    }

    public void roolback() {
        while (nextMigrationIndex > 0) down();
    }
}