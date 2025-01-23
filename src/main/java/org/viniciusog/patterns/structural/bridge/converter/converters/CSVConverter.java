package org.viniciusog.patterns.structural.bridge.converter.converters;

import org.viniciusog.patterns.structural.bridge.converter.employees.Employee;

public class CSVConverter implements Converter {

    @Override
    public String getEmployeeFormated(Employee emp) {
        return String.format("%s,%d,%.2f", emp.getName(), emp.getAge(), emp.getSalary());
    }
}