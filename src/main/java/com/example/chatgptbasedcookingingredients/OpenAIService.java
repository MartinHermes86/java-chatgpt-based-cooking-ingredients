package com.example.chatgptbasedcookingingredients;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

@Service
public class OpenAIService {

    private final RestClient client;

    public OpenAIService(
            @Value("${open.ai.key}") String apikey,
            @Value("${open.ai.url}") String baseurl){
        client = RestClient.builder()
                .baseUrl(baseurl)
                .defaultHeader("Authorization", "Bearer " + apikey) //<- Header mit Metainformationen. z. B. Unser Auth Token!
                .build();
    }

    public String categorizeIngredient(String i) {
        ChatGPTRequest request = new ChatGPTRequest(i);
        ChatGPTResponse response = client.post()
                .body(request)
                .retrieve()
                .body(ChatGPTResponse.class);
        return response.getAnswer();
    }
}
