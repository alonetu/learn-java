package com.example.learnjava2.mapper;

import com.example.learnjava2.domain.User;

import java.util.HashMap;
import java.util.Map;

public class UserMapper {

    private static Map<Integer, User> userMap = new HashMap<>();

    static {
        userMap.put(1, new User(1, "jack1", "123"));
        userMap.put(2, new User(2, "jack2", "1234"));
        userMap.put(3, new User(3, "jack3", "12345"));
    }
}
