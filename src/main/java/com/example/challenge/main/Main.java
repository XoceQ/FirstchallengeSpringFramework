package com.example.challenge.main;

import com.example.challenge.model.Response;
import com.example.challenge.service.ConsumeAPI;
import com.example.challenge.service.ConvertData;

public class Main {

    private static final String URL = "https://api.stockdata.org/v1/data/quote?symbols=AAPL%2CTSLA%2CMSFT&api_token=zGrtg63g0SXfURTIUtKrkyJ5oObWUh2M270IdJXU";
    private ConsumeAPI consumeAPI = new ConsumeAPI();

    private ConvertData converter = new ConvertData();

    public void showMenu() {
        try {
            // Obtén el JSON desde la API
            var json = consumeAPI.obtainData(URL);

            // Usa el converter para convertir el JSON a un objeto Response
            Response response = converter.getData(json, Response.class);
            System.out.println("---------Top 3 Stock Data Prices-------------");


            // Imprime los datos de las acciones
            response.data().forEach(stock -> {
                System.out.println("Ticker: " + stock.ticker());
                System.out.println("Name: " + stock.name());
                System.out.println("Currency: " + stock.currency());
                System.out.println("Price: " + stock.price());
                System.out.println("-------------");
            });

        } catch (Exception e) {
            System.err.println("Error processing data: " + e.getMessage());
        }

    }
}
