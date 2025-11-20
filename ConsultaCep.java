import com.google.gson.Gson;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaCep {

    public Endereco buscaEndereco(String cep) {
        // Cria o endereço URL para onde vamos ligar
        URI endereco = URI.create("https://viacep.com.br/ws/" + cep + "/json/");

        // Configura a requisição (o pedido)
        HttpRequest request = HttpRequest.newBuilder()
                .uri(endereco)
                .build();

        try {
            // Envia a requisição e espera a resposta
            HttpResponse<String> response = HttpClient
                    .newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());

            // Transforma o JSON (String) em um Objeto Endereco usando a biblioteca Gson
            return new Gson().fromJson(response.body(), Endereco.class);

        } catch (Exception e) {
            throw new RuntimeException("Não consegui obter o endereço a partir desse CEP.");
        }
    }
}