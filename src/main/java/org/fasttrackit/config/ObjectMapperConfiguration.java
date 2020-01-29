package org.fasttrackit.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

public class ObjectMapperConfiguration {
    public static final ObjectMapper objectMapper = new ObjectMapper();

    public static ObjectMapper ObjectMapper;

    // static block
    static {
        objectMapper.registerModule(new JavaTimeModule());


    }
}
