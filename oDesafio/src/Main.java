import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import models.ConsultaCep;
import models.Endereco;
import models.GeradorDeArquivo;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);

        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        ConsultaCep consultaCep = new ConsultaCep(gson);
        GeradorDeArquivo gerador = new GeradorDeArquivo(gson);
        List<Endereco> enderecos = new ArrayList<>();

        while (true) {
            System.out.println("Digite seu CEP (ou 'sair' para encerrar):");
            String cep = scanner.nextLine();

            if (cep.equalsIgnoreCase("sair")) {
                break;
            }

            Endereco endereco = consultaCep.buscar(cep);
            System.out.println(endereco);
            enderecos.add(endereco);
        }

        gerador.salvar(enderecos);
        System.out.println("Programa finalizado!");
    }
}
