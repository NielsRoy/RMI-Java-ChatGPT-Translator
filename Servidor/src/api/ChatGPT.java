package api;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;

public class ChatGPT {
	private HttpURLConnection con;
	private final String URL = "https://api.openai.com/v1/chat/completions";
	private final String API_KEY = "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";
	private final String MODEL = "gpt-3.5-turbo";
	
	public ChatGPT() {
		
		try {
			URL obj = new URL(URL);
			con = (HttpURLConnection) obj.openConnection();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
	
	public String request(String message) {
		try {
			con.setRequestMethod("POST");
			con.setRequestProperty("Authorization", "Bearer "+API_KEY);
			con.setRequestProperty("Content-Type", "application/json");
			//Build the request body
			String body = "{\"model\": \""+MODEL+"\", \"messages\": [{\"role\": \"user\", \"content\": \""+message+"\"}]}";
			con.setDoOutput(true);
			OutputStreamWriter writer = new OutputStreamWriter(con.getOutputStream());
			writer.write(body);
			writer.flush();
			writer.close();
			
			//Get the response
			BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String inputLine;
			StringBuffer response = new StringBuffer();
			while ((inputLine = in.readLine()) != null) {
				response.append(inputLine);
			}
			in.close();
			
			return (response.toString().split("\"content\": \"")[1].split("\"")[0]);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}
