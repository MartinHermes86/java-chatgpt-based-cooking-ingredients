package com.example.chatgptbasedcookingingredients;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ChatGptMessage {

    private String role;
    private String content;

    public ChatGptMessage(String ingredient){
        this.role = "user";
        this.content = ingredient;
    }
}
