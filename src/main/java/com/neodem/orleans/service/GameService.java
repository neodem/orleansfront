package com.neodem.orleans.service;

import com.neodem.orleans.objects.PublicGameState;

import java.util.List;
import java.util.Map;

/**
 * Created by Vincent Fumo (neodem@gmail.com)
 * Created on 1/20/20
 */
public interface GameService {
    PublicGameState initGame(List<String> names);

    PublicGameState startGame(String gameId);

    PublicGameState submitPlan(String gameId, String playerId, String action, int marketSlot, int actionSlot);

    PublicGameState doAction(String gameId, String playerId, String action, Map<String, String> params);

    PublicGameState pass(String gameId, String playerId);

    PublicGameState submitTorturePlan(String gameId, String playerId, String tortureTypeString, Map<String, String> params);

    PublicGameState getGameState(String gameId);

}
