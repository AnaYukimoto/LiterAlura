package Service;

import com.google.gson.Gson;
import java.util.List;

import Model.Book;  // Certifique-se de ter a classe Book definida no pacote model

public class BookService {

    // Método para analisar a resposta JSON e retornar uma lista de livros
    public List<Book> parseBooksJson(String json) {
        Gson gson = new Gson();
        BookResponse response = gson.fromJson(json, BookResponse.class);
        return response.getResults();
    }

    // Modelo para a resposta da API
    class BookResponse {
        private List<Book> results;

        public List<Book> getResults() {
            return results;
        }

        public void setResults(List<Book> results) {
            this.results = results;
        }
    }
}
