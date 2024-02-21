package com.example.chatgptbasedcookingingredients;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ChatGPTResponse {

    private List<ChatGptChoice> choices;

    public String getAnswer(){
        return getChoices().getFirst().getMessage().getContent();
    }
}
