package org.viniciusog.patterns.behavioral.chain.process.service;

import org.viniciusog.patterns.behavioral.chain.process.steps.ProcessStep;
import org.viniciusog.patterns.behavioral.chain.process.steps.SaveUser;
import org.viniciusog.patterns.behavioral.chain.process.steps.ValidateMandatoryField;

public class ServicesCatalog {

    public static ProcessStep saveUserProcess = buildChain(
            new ValidateMandatoryField("name"),
            new ValidateMandatoryField("email"),
            new ValidateMandatoryField("password"),
            new SaveUser()
    );

    private static ProcessStep buildChain(ProcessStep... steps) {
        for (int index = 0; index < steps.length - 1; index++) {
            steps[index].setNextStep(steps[index+1]);
        }
        return steps[0];
    }
}
