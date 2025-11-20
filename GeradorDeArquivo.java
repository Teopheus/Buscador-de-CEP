import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class GeradorDeArquivo {

    public void salvaJson(Endereco endereco) throws IOException {
        // O setPrettyPrinting deixa o JSON formatado bonitinho (indentado)
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        // Cria o arquivo com o nome do CEP (ex: 01001000.json)
        FileWriter escrita = new FileWriter(endereco.cep() + ".json");
        escrita.write(gson.toJson(endereco));
        escrita.close();
    }
}