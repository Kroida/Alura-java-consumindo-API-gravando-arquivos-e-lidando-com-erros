package models;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaCep {

    private final Gson gson;

    public ConsultaCep(Gson gson) {
        this.gson = gson;
    }

    public Endereco buscar(String cep) throws IOException, InterruptedException {
        String url = "https://viacep.com.br/ws/" + cep.replace("-", "") + "/json/";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println("Status: " + response.statusCode());

        return gson.fromJson(response.body(), Endereco.class);
    }
}
