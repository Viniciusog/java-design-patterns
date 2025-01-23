package org.viniciusog.patterns.structural.bridge.converter;

import org.viniciusog.patterns.structural.bridge.converter.converters.CSVConverter;
import org.viniciusog.patterns.structural.bridge.converter.converters.Converter;
import org.viniciusog.patterns.structural.bridge.converter.converters.JSONConverter;
import org.viniciusog.patterns.structural.bridge.converter.employees.Employee;
import org.viniciusog.patterns.structural.bridge.converter.employees.ITGuy;
import org.viniciusog.patterns.structural.bridge.converter.employees.ProjectManager;

import java.util.Locale;

public class Client {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Converter csvConverter = new CSVConverter();
        Converter jsonConverter = new JSONConverter();

        Employee itGuy = new ITGuy("Fernando", 20, 12000.0);
        Employee projectManager = new ProjectManager("Pedro", 20, 30000.0);

        System.out.println(csvConverter.getEmployeeFormated(itGuy));
        System.out.println(jsonConverter.getEmployeeFormated(itGuy));

        System.out.println(csvConverter.getEmployeeFormated(projectManager));
        System.out.println(jsonConverter.getEmployeeFormated(projectManager));
    }
}
