package com.example.challenge.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public record Meta (
    @JsonAlias("requested") int requested,
    @JsonAlias("returned") int returned
    ) {
}
