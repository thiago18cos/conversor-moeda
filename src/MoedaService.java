
import com.google.gson.Gson;

import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;


public class MoedaService {
    private final String API_KEY = "b0b771dbb11b1d8b910ff423";
    private final String BASE_URL = "https://v6.exchangerate-api.com/v6/";

    public double converterMoeda(String from, String to, double amount) {
        try {
            String urlStr = BASE_URL + API_KEY + "/pair/" + from + "/" + to + "/" + amount;
            URL url = new URL(urlStr);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            Gson gson = new Gson();
            InputStreamReader reader = new InputStreamReader(connection.getInputStream());
            ConversaoResponse response = gson.fromJson(reader, ConversaoResponse.class);

            return response.getConversion_result();
        } catch (Exception e) {
            System.out.println("Erro ao converter moeda: " + e.getMessage());
            return 0;
        }
    }
}

