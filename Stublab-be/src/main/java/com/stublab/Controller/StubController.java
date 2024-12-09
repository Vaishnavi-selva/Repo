package com.stublab.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
    @RequestMapping("/api")
    public class StubController {
        @GetMapping("/user")
        public Map<String, String> getUser() {
            Map<String, String> user = new HashMap<>();
            user.put("name", "abc");
            user.put("path", "https://xyz");
            user.put("description", "ssmfgfhjhk");
            return user;
        }

}
