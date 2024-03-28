package com.example.learnspringframework.examples.a2;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MongoDbDataService implements DataService{
    @Override
    public int[] retrieveData() {
        return new int[] {1, 643, 23, 87, 19};
    }
}
