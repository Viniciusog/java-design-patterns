package org.viniciusog.patterns.behavioral.chain.process.steps;

import org.viniciusog.patterns.behavioral.chain.process.service.ProcessContext;

public class ValidateMandatoryField extends ProcessStep {

    public ValidateMandatoryField(Object... args) {
        super(args);
    }

    @Override
    public ProcessContext execute(ProcessContext context) throws Exception {
        String fieldName = args[0].toString();
        Object field = context.get(fieldName);

        if (field == null) throw new Exception(String.format("%s is empty", args[0]));

        return next(context, true);
    }
}