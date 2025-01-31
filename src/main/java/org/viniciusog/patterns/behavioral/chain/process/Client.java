package org.viniciusog.patterns.behavioral.chain.process;

import org.viniciusog.patterns.behavioral.chain.process.service.GenericService;
import org.viniciusog.patterns.behavioral.chain.process.service.ProcessContext;
import org.viniciusog.patterns.behavioral.chain.process.service.ServicesCatalog;

public class Client {
    public static void main(String[] args) {

        // returns 'password is empty' message
        ProcessContext context = new ProcessContext();
        context.put("name", "vinicius");
        context.put("email", "vinicius@email.com");
        Object result = GenericService.run(ServicesCatalog.saveUserProcess, context);
        System.out.println(result);

        // returns message "User 'pedro' saved!"
        context.reset();
        context.put("name", "pedro");
        context.put("email", "pedro@email.com");
        context.put("password", "123456");
        Object result2 = GenericService.run(ServicesCatalog.saveUserProcess, context);
        System.out.println(result2);
    }
}