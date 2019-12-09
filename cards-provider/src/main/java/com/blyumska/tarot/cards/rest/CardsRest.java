package com.blyumska.tarot.cards.rest;

import com.blyumska.tarot.cards.domain.TarotCard;
import com.blyumska.tarot.cards.service.TarotCardService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CardsRest {

    private final TarotCardService tarotCardService;

    @GetMapping("/random/{n}")
    public List<TarotCard> getCards(@PathVariable("n") int n) {
        return tarotCardService.getNRandomCards(n);
    }
}
