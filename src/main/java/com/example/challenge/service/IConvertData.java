package com.example.challenge.service;

public interface IConvertData {
    <T> T getData(String json, Class<T> clase);

}
