package com.stublab.Controller;

import com.stublab.DTO.StubDto;
import com.stublab.Service.StubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController

public class StubController {
    @PostMapping("/add")
    public StubDto addStub(@RequestBody StubDto stubDto) {
        System.out.println("Data added: " + stubDto);
        return StubService.addStub(stubDto);
    }

    @GetMapping("/get/{id}")
    public StubDto getStub(@PathVariable Long id) {
        return StubService.getStub(id);
    }
}

