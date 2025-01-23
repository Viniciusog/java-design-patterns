package org.viniciusog.patterns.structural.bridge.converter.converters;

// we can have many different Converters and each converter receives an Employee to be formated


import org.viniciusog.patterns.structural.bridge.converter.employees.Employee;

public interface Converter {
    String getEmployeeFormated(Employee emp);
}