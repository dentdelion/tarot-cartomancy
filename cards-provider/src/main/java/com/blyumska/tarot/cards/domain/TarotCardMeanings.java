package com.blyumska.tarot.cards.domain;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class TarotCardMeanings {

    List<String> light;
    List<String> shadow;
}
