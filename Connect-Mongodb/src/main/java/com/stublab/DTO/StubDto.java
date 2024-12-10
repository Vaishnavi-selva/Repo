package com.stublab.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class StubDto {
    long Id;
    String name;
    String path;
    String description;
}
