package com.blyumska.tarot.cards.service;

import com.blyumska.tarot.cards.domain.TarotCard;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.aggregation.Aggregation;
import org.springframework.data.mongodb.core.aggregation.AggregationResults;
import org.springframework.data.mongodb.core.aggregation.SampleOperation;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TarotCardService {

    private final MongoTemplate mongoTemplate;

    public List<TarotCard> getNRandomCards(int n) {
        SampleOperation matchStage = Aggregation.sample(n);
        Aggregation aggregation = Aggregation.newAggregation(matchStage);
        AggregationResults<TarotCard> output = mongoTemplate.aggregate(aggregation, "collectionName", TarotCard.class);

        return output.getMappedResults();
    }
}
