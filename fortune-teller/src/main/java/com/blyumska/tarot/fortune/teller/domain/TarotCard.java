package com.blyumska.tarot.fortune.teller.domain;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class TarotCard {

    String name;
    String number;
    String arcana;
    String suit;
    List<String> fortuneTelling;
    List<String> keywords;
    TarotCardMeanings meanings;
    List<String> questions;
}
