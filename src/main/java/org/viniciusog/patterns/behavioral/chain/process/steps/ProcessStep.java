package org.viniciusog.patterns.behavioral.chain.process.steps;

import org.viniciusog.patterns.behavioral.chain.process.service.ProcessContext;

public abstract class ProcessStep {
    protected ProcessStep nextStep;
    protected Object[] args;

    public ProcessStep(Object... args) {
       this.args = args;
    }

    public abstract ProcessContext execute(ProcessContext context) throws Exception;

    public void setNextStep(ProcessStep next) {
        this.nextStep = next;
    }

    protected ProcessContext next(ProcessContext context, Object currentResult) throws Exception {
        context.setProcessResult(currentResult);
        return nextStep != null ? nextStep.execute(context) : context;
    }
}
