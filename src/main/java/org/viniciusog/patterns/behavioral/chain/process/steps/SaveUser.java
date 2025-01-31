package org.viniciusog.patterns.behavioral.chain.process.steps;

import org.viniciusog.patterns.behavioral.chain.process.repository.UserRepository;
import org.viniciusog.patterns.behavioral.chain.process.service.ProcessContext;

import java.util.HashMap;
import java.util.Map;

public class SaveUser extends ProcessStep {

    public SaveUser(Object... args) {
        super(args);
    }

    @Override
    public ProcessContext execute(ProcessContext context) throws Exception {
        Map<String, Object> user = new HashMap<>();
        user.put("name", context.get("name"));
        user.put("email", context.get("email"));
        user.put("password", context.get("password"));

        UserRepository.getInstance().saveUser(user);

        return next(context, String.format("User '%s' saved!", user.get("name")));
    }
}