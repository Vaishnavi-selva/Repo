package com.stublab.Repository;

import com.stublab.Entity.StubEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StubRepository extends MongoRepository<StubEntity, String> {

    StubEntity findByName(String name);
    StubEntity findByPath(String path);
    StubEntity findByDescription(String description);
}

