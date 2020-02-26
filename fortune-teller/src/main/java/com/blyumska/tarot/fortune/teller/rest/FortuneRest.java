package com.blyumska.tarot.fortune.teller.rest;

import com.blyumska.tarot.fortune.teller.domain.TarotCard;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FortuneRest {

    @GetMapping("/tell-me-my-fortune")
    public TarotCard getProphecy() {
        
    }
}
