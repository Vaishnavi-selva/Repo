package com.stublab.Entity;


import lombok.Builder;
import lombok.Data;

@Builder
@Data

public class StubEntity {

  private long Id;
   private String name;
   private String path;
   private String description;
    public StubEntity(){

    }
}
