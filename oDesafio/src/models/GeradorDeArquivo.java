package models;

import com.google.gson.Gson;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class GeradorDeArquivo {

    private final Gson gson;

    public GeradorDeArquivo(Gson gson) {
        this.gson = gson;
    }

    public void salvar(List<Endereco> enderecos) throws IOException {
        FileWriter writer = new FileWriter("enderecos.json");
        writer.write(gson.toJson(enderecos));
        writer.close();
        System.out.println("Arquivo gerado: enderecos.json");
    }
}
