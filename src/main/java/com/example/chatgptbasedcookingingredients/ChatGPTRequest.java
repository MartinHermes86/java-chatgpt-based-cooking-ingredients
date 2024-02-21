package com.example.chatgptbasedcookingingredients;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ChatGPTRequest {

    private String model;
    private List<ChatGptMessage> messages;

    public ChatGPTRequest(String ingredient){
        this.model = "gpt-3.5-turbo";
        this.messages = List.of(new ChatGptMessage("Sind/ist " + ingredient + "vegan, vegetarisch oder nicht?"));
    }
}
