package com.example.BharatEduHub.Models;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CustomMessage {

    String text;
    public CustomMessage(String text) {
        this.text=text;
    }
}
