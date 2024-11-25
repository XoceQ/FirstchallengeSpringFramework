package com.example.challenge.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)


public record StockData(
        @JsonAlias("ticker") String ticker,
        @JsonAlias("name") String name,
        @JsonAlias("currency") String currency,
        @JsonAlias("price") double price

) {
}
