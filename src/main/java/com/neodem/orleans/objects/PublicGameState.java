
package com.neodem.orleans.objects;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "players",
    "boardState",
    "benefitTracker",
    "goodsInventory",
    "followerInventory",
    "placeTiles1",
    "placeTiles2",
    "usedHourGlassTiles",
    "gameLog",
    "playerCount",
    "gameId",
    "round",
    "gamePhase",
    "startPlayer",
    "currentHourGlass",
    "winners",
    "playerHasBathhouse",
    "playerWithMostTradingStations",
    "hourGlassStack",
    "currentActionPlayer",
    "numberTechTilesAvailable",
    "allTradingStations",
    "phaseComplete"
})
public class PublicGameState {

    @JsonProperty("players")
    @JsonIgnore
    private List<Player> players = null;
    @JsonProperty("boardState")
    @JsonIgnore
    private BoardState boardState;
    @JsonProperty("benefitTracker")
    private BenefitTracker benefitTracker;
    @JsonProperty("goodsInventory")
    private GoodsInventory goodsInventory;
    @JsonProperty("followerInventory")
    private FollowerInventory followerInventory;
    @JsonProperty("placeTiles1")
    private List<String> placeTiles1 = null;
    @JsonProperty("placeTiles2")
    private List<String> placeTiles2 = null;
    @JsonProperty("usedHourGlassTiles")
    private List<String> usedHourGlassTiles = null;
    @JsonProperty("gameLog")
    private List<String> gameLog = null;
    @JsonProperty("playerCount")
    private int playerCount;
    @JsonProperty("gameId")
    private String gameId;
    @JsonProperty("round")
    private int round;
    @JsonProperty("gamePhase")
    private String gamePhase;
    @JsonProperty("startPlayer")
    private String startPlayer;
    @JsonProperty("currentHourGlass")
    private String currentHourGlass;
    @JsonProperty("winners")
    private Object winners;
    @JsonProperty("playerHasBathhouse")
    private Object playerHasBathhouse;
    @JsonProperty("playerWithMostTradingStations")
    private Object playerWithMostTradingStations;
    @JsonProperty("hourGlassStack")
    private List<String> hourGlassStack = null;
    @JsonProperty("currentActionPlayer")
    private String currentActionPlayer;
    @JsonProperty("numberTechTilesAvailable")
    private int numberTechTilesAvailable;
    @JsonProperty("allTradingStations")
    private AllTradingStations allTradingStations;
    @JsonProperty("phaseComplete")
    private boolean phaseComplete;

    @JsonProperty("players")
    public List<Player> getPlayers() {
        return players;
    }

    @JsonProperty("players")
    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    @JsonProperty("boardState")
    public BoardState getBoardState() {
        return boardState;
    }

    @JsonProperty("boardState")
    public void setBoardState(BoardState boardState) {
        this.boardState = boardState;
    }

    @JsonProperty("benefitTracker")
    public BenefitTracker getBenefitTracker() {
        return benefitTracker;
    }

    @JsonProperty("benefitTracker")
    public void setBenefitTracker(BenefitTracker benefitTracker) {
        this.benefitTracker = benefitTracker;
    }

    @JsonProperty("goodsInventory")
    public GoodsInventory getGoodsInventory() {
        return goodsInventory;
    }

    @JsonProperty("goodsInventory")
    public void setGoodsInventory(GoodsInventory goodsInventory) {
        this.goodsInventory = goodsInventory;
    }

    @JsonProperty("followerInventory")
    public FollowerInventory getFollowerInventory() {
        return followerInventory;
    }

    @JsonProperty("followerInventory")
    public void setFollowerInventory(FollowerInventory followerInventory) {
        this.followerInventory = followerInventory;
    }

    @JsonProperty("placeTiles1")
    public List<String> getPlaceTiles1() {
        return placeTiles1;
    }

    @JsonProperty("placeTiles1")
    public void setPlaceTiles1(List<String> placeTiles1) {
        this.placeTiles1 = placeTiles1;
    }

    @JsonProperty("placeTiles2")
    public List<String> getPlaceTiles2() {
        return placeTiles2;
    }

    @JsonProperty("placeTiles2")
    public void setPlaceTiles2(List<String> placeTiles2) {
        this.placeTiles2 = placeTiles2;
    }

    @JsonProperty("usedHourGlassTiles")
    public List<String> getUsedHourGlassTiles() {
        return usedHourGlassTiles;
    }

    @JsonProperty("usedHourGlassTiles")
    public void setUsedHourGlassTiles(List<String> usedHourGlassTiles) {
        this.usedHourGlassTiles = usedHourGlassTiles;
    }

    @JsonProperty("gameLog")
    public List<String> getGameLog() {
        return gameLog;
    }

    @JsonProperty("gameLog")
    public void setGameLog(List<String> gameLog) {
        this.gameLog = gameLog;
    }

    @JsonProperty("playerCount")
    public int getPlayerCount() {
        return playerCount;
    }

    @JsonProperty("playerCount")
    public void setPlayerCount(int playerCount) {
        this.playerCount = playerCount;
    }

    @JsonProperty("gameId")
    public String getGameId() {
        return gameId;
    }

    @JsonProperty("gameId")
    public void setGameId(String gameId) {
        this.gameId = gameId;
    }

    @JsonProperty("round")
    public int getRound() {
        return round;
    }

    @JsonProperty("round")
    public void setRound(int round) {
        this.round = round;
    }

    @JsonProperty("gamePhase")
    public String getGamePhase() {
        return gamePhase;
    }

    @JsonProperty("gamePhase")
    public void setGamePhase(String gamePhase) {
        this.gamePhase = gamePhase;
    }

    @JsonProperty("startPlayer")
    public String getStartPlayer() {
        return startPlayer;
    }

    @JsonProperty("startPlayer")
    public void setStartPlayer(String startPlayer) {
        this.startPlayer = startPlayer;
    }

    @JsonProperty("currentHourGlass")
    public String getCurrentHourGlass() {
        return currentHourGlass;
    }

    @JsonProperty("currentHourGlass")
    public void setCurrentHourGlass(String currentHourGlass) {
        this.currentHourGlass = currentHourGlass;
    }

    @JsonProperty("winners")
    public Object getWinners() {
        return winners;
    }

    @JsonProperty("winners")
    public void setWinners(Object winners) {
        this.winners = winners;
    }

    @JsonProperty("playerHasBathhouse")
    public Object getPlayerHasBathhouse() {
        return playerHasBathhouse;
    }

    @JsonProperty("playerHasBathhouse")
    public void setPlayerHasBathhouse(Object playerHasBathhouse) {
        this.playerHasBathhouse = playerHasBathhouse;
    }

    @JsonProperty("playerWithMostTradingStations")
    public Object getPlayerWithMostTradingStations() {
        return playerWithMostTradingStations;
    }

    @JsonProperty("playerWithMostTradingStations")
    public void setPlayerWithMostTradingStations(Object playerWithMostTradingStations) {
        this.playerWithMostTradingStations = playerWithMostTradingStations;
    }

    @JsonProperty("hourGlassStack")
    public List<String> getHourGlassStack() {
        return hourGlassStack;
    }

    @JsonProperty("hourGlassStack")
    public void setHourGlassStack(List<String> hourGlassStack) {
        this.hourGlassStack = hourGlassStack;
    }

    @JsonProperty("currentActionPlayer")
    public String getCurrentActionPlayer() {
        return currentActionPlayer;
    }

    @JsonProperty("currentActionPlayer")
    public void setCurrentActionPlayer(String currentActionPlayer) {
        this.currentActionPlayer = currentActionPlayer;
    }

    @JsonProperty("numberTechTilesAvailable")
    public int getNumberTechTilesAvailable() {
        return numberTechTilesAvailable;
    }

    @JsonProperty("numberTechTilesAvailable")
    public void setNumberTechTilesAvailable(int numberTechTilesAvailable) {
        this.numberTechTilesAvailable = numberTechTilesAvailable;
    }

    @JsonProperty("allTradingStations")
    public AllTradingStations getAllTradingStations() {
        return allTradingStations;
    }

    @JsonProperty("allTradingStations")
    public void setAllTradingStations(AllTradingStations allTradingStations) {
        this.allTradingStations = allTradingStations;
    }

    @JsonProperty("phaseComplete")
    public boolean isPhaseComplete() {
        return phaseComplete;
    }

    @JsonProperty("phaseComplete")
    public void setPhaseComplete(boolean phaseComplete) {
        this.phaseComplete = phaseComplete;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("players", players).append("boardState", boardState).append("benefitTracker", benefitTracker).append("goodsInventory", goodsInventory).append("followerInventory", followerInventory).append("placeTiles1", placeTiles1).append("placeTiles2", placeTiles2).append("usedHourGlassTiles", usedHourGlassTiles).append("gameLog", gameLog).append("playerCount", playerCount).append("gameId", gameId).append("round", round).append("gamePhase", gamePhase).append("startPlayer", startPlayer).append("currentHourGlass", currentHourGlass).append("winners", winners).append("playerHasBathhouse", playerHasBathhouse).append("playerWithMostTradingStations", playerWithMostTradingStations).append("hourGlassStack", hourGlassStack).append("currentActionPlayer", currentActionPlayer).append("numberTechTilesAvailable", numberTechTilesAvailable).append("allTradingStations", allTradingStations).append("phaseComplete", phaseComplete).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(placeTiles1).append(gameId).append(winners).append(hourGlassStack).append(boardState).append(gameLog).append(players).append(playerCount).append(allTradingStations).append(placeTiles2).append(usedHourGlassTiles).append(playerWithMostTradingStations).append(goodsInventory).append(startPlayer).append(currentActionPlayer).append(playerHasBathhouse).append(currentHourGlass).append(round).append(phaseComplete).append(followerInventory).append(gamePhase).append(numberTechTilesAvailable).append(benefitTracker).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PublicGameState) == false) {
            return false;
        }
        PublicGameState rhs = ((PublicGameState) other);
        return new EqualsBuilder().append(placeTiles1, rhs.placeTiles1).append(gameId, rhs.gameId).append(winners, rhs.winners).append(hourGlassStack, rhs.hourGlassStack).append(boardState, rhs.boardState).append(gameLog, rhs.gameLog).append(players, rhs.players).append(playerCount, rhs.playerCount).append(allTradingStations, rhs.allTradingStations).append(placeTiles2, rhs.placeTiles2).append(usedHourGlassTiles, rhs.usedHourGlassTiles).append(playerWithMostTradingStations, rhs.playerWithMostTradingStations).append(goodsInventory, rhs.goodsInventory).append(startPlayer, rhs.startPlayer).append(currentActionPlayer, rhs.currentActionPlayer).append(playerHasBathhouse, rhs.playerHasBathhouse).append(currentHourGlass, rhs.currentHourGlass).append(round, rhs.round).append(phaseComplete, rhs.phaseComplete).append(followerInventory, rhs.followerInventory).append(gamePhase, rhs.gamePhase).append(numberTechTilesAvailable, rhs.numberTechTilesAvailable).append(benefitTracker, rhs.benefitTracker).isEquals();
    }

}
