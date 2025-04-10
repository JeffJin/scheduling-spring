package io.eworks.scheduling.repositories;

import org.springframework.stereotype.Repository;

@Repository
public class AwsDataRepository implements DataRepository {
    public AwsDataRepository() {
        System.out.println("AwsDataRepository");
    }
}
