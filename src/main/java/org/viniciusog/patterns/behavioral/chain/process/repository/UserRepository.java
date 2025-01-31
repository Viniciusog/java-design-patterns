package org.viniciusog.patterns.behavioral.chain.process.repository;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class UserRepository {

    private Map<String, Object> memory;
    private static UserRepository instance = new UserRepository();

    public static UserRepository getInstance() {
        return instance;
    }

    private UserRepository() {
        Map<String, Object> user = new LinkedHashMap<>();
        user.put("name", "user #1");
        user.put("email", "user@email.com");
        user.put("password", "123456");

        memory = new LinkedHashMap<>();
        memory.put("user@email.com", user);
    }

    public Object getUserByEmail(String email) {
        return memory.get(email);
    }

    public List<Object> getUsers() {
        return new ArrayList<>(memory.values());
    }

    public void saveUser(Map<String, Object> user) {
        this.memory.put(user.get("email").toString(), user);
    }
}