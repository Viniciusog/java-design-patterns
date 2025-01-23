package org.viniciusog.patterns.structural.bridge.converter.converters;

import org.viniciusog.patterns.structural.bridge.converter.employees.Employee;

public class JSONConverter implements Converter {


    @Override
    public String getEmployeeFormated(Employee emp) {
        return String.format("""
                {
                    "name": "%s",
                    "age": %d,
                    "salary": %.2f
                }
                """, emp.getName(), emp.getAge(), emp.getSalary());
    }
}