package com.stublab.Repository;

import com.stublab.Entity.StubEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StubRepository extends MongoRepository<StubEntity,String> {
    static StubEntity findById(long Id) {
        return null;
    }

}
