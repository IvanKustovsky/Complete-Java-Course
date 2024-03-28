package com.example.learnspringframework.examples.a2;

import org.springframework.stereotype.Component;

@Component
public class MySQLDataService implements DataService{
    @Override
    public int[] retrieveData() {
        return new int[] {1, 76,21, 33, 65, 19, 233};
    }
}
