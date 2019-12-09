package com.blyumska.tarot.cards.domain;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@AllArgsConstructor
@Getter
@Setter
public class TarotCard {

    String name;

    @Id
    String number;
    String arcana;
    String suit;
    List<String> fortuneTelling;
    List<String> keywords;
    TarotCardMeanings meanings;
    List<String> questions;
}
