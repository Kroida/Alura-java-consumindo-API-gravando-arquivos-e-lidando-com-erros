import Livro.Livro;
import Pessoa.Pessoa;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {
    static void main(String[] args) {
        // 1, 2
        String jsonPessoa = "{" +
                "\"nome\":\"Rodrigo\"," +
                "\"cidade\":\"Brasília\"" +
                "}";

        Gson gsonPessoa = new GsonBuilder().setLenient().create();
        Pessoa pessoa = gsonPessoa.fromJson(jsonPessoa, Pessoa.class);

        System.out.println(pessoa);

        // 3
        String jsonLivro = "{" +
                "\"titulo\":\"Harry Porra\"," +
                "\"autor\":\"MC Maha\"," +
                "\"editora\":{\"nome\":\"Youtube\"" +
                "}}";

        Gson gsonLivro = new Gson();
        Livro livro = gsonLivro.fromJson(jsonLivro, Livro.class);

        System.out.println(livro);
    }
}
