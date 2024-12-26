import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.io.InputStreamReader;
import java.io.BufferedReader;


public class Connection {

    public void enviarMsg(String token, String chatID, String msg){
        try {
            // Construindo a URL para enviar a mensagem
            String urlString = "https://api.telegram.org/bot" + token + "/sendMessage";

            // Criando uma conexão HTTP
            URL url = new URL(urlString);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("POST");
            connection.setDoOutput(true);

            // Dados a serem enviados (formato URL-encoded)
            String urlParameters = "chat_id=" + chatID + "&text=" + msg;

            // Escreve os parâmetros no corpo da requisição
            connection.getOutputStream().write(urlParameters.getBytes("UTF-8"));

            // Verificando a resposta da API
            int responseCode = connection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) { // 200 OK
                // Lê a resposta
                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String inputLine;
                StringBuilder response = new StringBuilder();
                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
                in.close();

            } else {
                System.out.println("Erro ao enviar a mensagem. Código de resposta: " + responseCode);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
