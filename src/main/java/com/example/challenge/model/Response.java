package com.example.challenge.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)


public record Response(


    @JsonAlias("meta") Meta meta,
    @JsonAlias("data") List<StockData> data

) {

}