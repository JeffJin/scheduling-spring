package io.eworks.scheduling.repositories;

import org.springframework.stereotype.Repository;

@Repository
public class SqlDataRepository implements DataRepository {
    public SqlDataRepository() {
        System.out.println("SqlDataRepository");
    }
}
