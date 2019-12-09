package com.blyumska.tarot.cards.dao;


import com.blyumska.tarot.cards.domain.TarotCard;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TarotCardRepository extends MongoRepository<TarotCard, String> {

}
