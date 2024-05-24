import com.conversor.Conversor;
import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiRequest {
    public Conversor conversion (String baseConvert, String targetConvert){
        URI apiDirection = URI.create("https://v6.exchangerate-api.com/v6/77c6c01ad7eeeb6ea0e799ff/pair/"
                +baseConvert+"/"+targetConvert);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(String.valueOf((apiDirection))))
                .build();
        try {
            HttpResponse<String> response = null;
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Conversor.class);
        } catch (Exception e) {
            throw new RuntimeException("No encontre ese tipo de cambio");
        }
    }

}
