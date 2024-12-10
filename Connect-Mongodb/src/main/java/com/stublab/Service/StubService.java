package com.stublab.Service;

import com.stublab.DTO.StubDto;
import com.stublab.Entity.StubEntity;
import com.stublab.Repository.StubRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class StubService {
    private static StubDBSequence stubEntitiy1;
    private static long Id;
    @Autowired

    private static StubRepository stubRepository;

    public static StubDto addStub(StubDto stubDto) {
        StubEntity stubEntity=StubEntity.builder()
                .name(stubDto.getName())
                .path(stubDto.getPath())
                .description(stubDto.getDescription())
                .build();
        StubEntity stubEntity1=stubRepository.save(stubEntity);
        return StubDto.builder().name(stubEntitiy1.getName()).build();
    }

    public static StubDto getStub(Long id) {

        StubEntity stubEntity = StubRepository.findById(Id);

        return StubDto.builder()
                .Id(stubEntity.getId())
                .name(stubEntity.getName())
                .path(stubEntity.getPath())
                .description(stubEntity.getDescription())

                .build();
    }
}