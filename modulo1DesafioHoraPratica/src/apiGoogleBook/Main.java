package apiGoogleBook;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Main {
    static void main(String[] args) throws IOException, InterruptedException {
        // 1
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um livro para busca");
        var busca = scanner.nextLine();

        String endereco = "https://www.googleapis.com/books/v1/volumes/?q=" + busca.replace(" ", "+") + "&key=AIzaSyCkpmIw3vJCv1S5eXscrKrqoyQ6mxRk_0U";;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());

        // 2

    }
}
