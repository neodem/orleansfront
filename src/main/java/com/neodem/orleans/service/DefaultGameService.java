package com.neodem.orleans.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.neodem.orleans.objects.PublicGameState;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;
import java.util.Map;

/**
 * Created by Vincent Fumo (neodem@gmail.com)
 * Created on 1/20/20
 */
@Component
public class DefaultGameService implements GameService{

    private static final String BASE = "http://localhost:8081";

    @Autowired
    private RestTemplate restTemplate;

    private ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public PublicGameState initGame(List<String> names) {
        String nameString = StringUtils.join(names, ',');
        PublicGameState gameState = send("/game/init", "playerNames", nameString);
        return gameState;
    }

    @Override
    public PublicGameState startGame(String gameId) {
        return null;
    }

    @Override
    public PublicGameState submitPlan(String gameId, String playerId, String action, int marketSlot, int actionSlot) {
        return null;
    }

    @Override
    public PublicGameState doAction(String gameId, String playerId, String action, Map<String, String> params) {
        return null;
    }

    @Override
    public PublicGameState pass(String gameId, String playerId) {
        return null;
    }

    @Override
    public PublicGameState submitTorturePlan(String gameId, String playerId, String tortureTypeString, Map<String, String> params) {
        return null;
    }

    @Override
    public PublicGameState getGameState(String gameId) {
        return null;
    }

    private PublicGameState sendForPlayer(String gameId, String playerId, String command, String... params) {
        return send("/game/" + gameId + "/" + playerId + "/" + command, params);
    }

    private PublicGameState send(String uri, String... params) {
        String url = createURL(uri);
        HttpEntity<String> requestEntity = new HttpEntity<>(null, new HttpHeaders());

        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(url);

        if (params != null) {
            for (int i = 0; i < params.length - 1; i = i + 2) {
                builder.queryParam(params[i], params[i + 1]);
            }
        }
        String urlString = builder.toUriString();
        ResponseEntity<String> response = restTemplate.exchange(urlString, HttpMethod.GET, requestEntity, String.class);
        String json = response.getBody();
        PublicGameState publicGameState = null;
        try {
            publicGameState = objectMapper.readValue(json, PublicGameState.class);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        return publicGameState;
    }

    private String createURL(String uri) {
        return BASE + uri;
    }
}
