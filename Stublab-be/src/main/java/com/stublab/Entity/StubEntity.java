package com.stublab.Entity;

import com.fasterxml.jackson.annotation.JsonTypeId;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.beans.Transient;

@Builder
@Data
@AllArgsConstructor
public class StubEntity {
 String name;
 String path;
 String description;

}

