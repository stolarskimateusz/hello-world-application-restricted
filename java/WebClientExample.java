
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;


public class WebClientExample {

    // replace with your actual key
    private static String API_KEY = "YOUR-APIKEY";

    private static String BASE_URL = "https://sandbox.api.service.nhs.uk/hello/application";

    public static void main(String[] args) throws IOException {
		URL obj = new URL(BASE_URL);

		HttpURLConnection connection = (HttpURLConnection) obj.openConnection();
		connection.setRequestMethod("GET");
        connection.setRequestProperty("Accept", "application/json");
        connection.setRequestProperty("apikey", API_KEY);
        
		int responseCode = connection.getResponseCode();

		if (responseCode == HttpURLConnection.HTTP_OK) {
			BufferedReader in = new BufferedReader(new InputStreamReader(
					connection.getInputStream()));
			String inputLine;
			StringBuffer response = new StringBuffer();

			while ((inputLine = in.readLine()) != null) {
				response.append(inputLine);
			}
			in.close();

			System.out.println(response.toString());
		} else {
			System.out.println(
                "GET request not worked, response code: "+responseCode
            );
		}

	}

}

