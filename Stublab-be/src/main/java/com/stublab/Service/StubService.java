package com.stublab.Service;
import com.stublab.Entity.StubEntity;
import com.stublab.Repository.StubRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StubService {
    @Autowired
    private StubRepository userRepository;

    public List<StubEntity> getAllUsers() {
        return userRepository.findAll();
    }

    public StubEntity saveUser(StubEntity user) {
        return userRepository.save(user);
    }
}

