FROM mongo
COPY dbseed/tarot.json /tarot.json
CMD mongoimport --host mongodb --db exampleDb --collection contacts --type json --file /tarot.json --jsonArray