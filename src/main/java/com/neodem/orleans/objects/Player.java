
package com.neodem.orleans.objects;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "playerId",
    "playerColor",
    "phaseComplete",
    "bag",
    "plans",
    "merchantLocation",
    "coinCount",
    "market",
    "goodCounts",
    "techTileMap",
    "claimedCitizens",
    "placeTiles",
    "tradingStationLocations",
    "bathhouseChoices",
    "beingTortured",
    "score",
    "maxAllowableTradingStations",
    "tradingStationCount",
    "claimedCitizenCount",
    "fullGoodCount",
    "foodAvailable",
    "bathhouseChoice",
    "playingSacristy",
    "availableMarketSlots",
    "tracks"
})
public class Player {

    @JsonProperty("playerId")
    private String playerId;
    @JsonProperty("playerColor")
    private String playerColor;
    @JsonProperty("phaseComplete")
    private boolean phaseComplete;
    @JsonProperty("bag")
    private List<Object> bag = null;
    @JsonProperty("plans")
    private Plans plans;
    @JsonProperty("merchantLocation")
    private String merchantLocation;
    @JsonProperty("coinCount")
    private int coinCount;
    @JsonProperty("market")
    private Market market;
    @JsonProperty("goodCounts")
    private GoodCounts goodCounts;
    @JsonProperty("techTileMap")
    private TechTileMap techTileMap;
    @JsonProperty("claimedCitizens")
    private List<Object> claimedCitizens = null;
    @JsonProperty("placeTiles")
    private List<Object> placeTiles = null;
    @JsonProperty("tradingStationLocations")
    private List<Object> tradingStationLocations = null;
    @JsonProperty("bathhouseChoices")
    private List<Object> bathhouseChoices = null;
    @JsonProperty("beingTortured")
    private boolean beingTortured;
    @JsonProperty("score")
    private int score;
    @JsonProperty("maxAllowableTradingStations")
    private int maxAllowableTradingStations;
    @JsonProperty("tradingStationCount")
    private int tradingStationCount;
    @JsonProperty("claimedCitizenCount")
    private int claimedCitizenCount;
    @JsonProperty("fullGoodCount")
    private int fullGoodCount;
    @JsonProperty("foodAvailable")
    private boolean foodAvailable;
    @JsonProperty("bathhouseChoice")
    private Object bathhouseChoice;
    @JsonProperty("playingSacristy")
    private boolean playingSacristy;
    @JsonProperty("availableMarketSlots")
    private int availableMarketSlots;
    @JsonProperty("tracks")
    private Tracks tracks;

    @JsonProperty("playerId")
    public String getPlayerId() {
        return playerId;
    }

    @JsonProperty("playerId")
    public void setPlayerId(String playerId) {
        this.playerId = playerId;
    }

    @JsonProperty("playerColor")
    public String getPlayerColor() {
        return playerColor;
    }

    @JsonProperty("playerColor")
    public void setPlayerColor(String playerColor) {
        this.playerColor = playerColor;
    }

    @JsonProperty("phaseComplete")
    public boolean isPhaseComplete() {
        return phaseComplete;
    }

    @JsonProperty("phaseComplete")
    public void setPhaseComplete(boolean phaseComplete) {
        this.phaseComplete = phaseComplete;
    }

    @JsonProperty("bag")
    public List<Object> getBag() {
        return bag;
    }

    @JsonProperty("bag")
    public void setBag(List<Object> bag) {
        this.bag = bag;
    }

    @JsonProperty("plans")
    public Plans getPlans() {
        return plans;
    }

    @JsonProperty("plans")
    public void setPlans(Plans plans) {
        this.plans = plans;
    }

    @JsonProperty("merchantLocation")
    public String getMerchantLocation() {
        return merchantLocation;
    }

    @JsonProperty("merchantLocation")
    public void setMerchantLocation(String merchantLocation) {
        this.merchantLocation = merchantLocation;
    }

    @JsonProperty("coinCount")
    public int getCoinCount() {
        return coinCount;
    }

    @JsonProperty("coinCount")
    public void setCoinCount(int coinCount) {
        this.coinCount = coinCount;
    }

    @JsonProperty("market")
    public Market getMarket() {
        return market;
    }

    @JsonProperty("market")
    public void setMarket(Market market) {
        this.market = market;
    }

    @JsonProperty("goodCounts")
    public GoodCounts getGoodCounts() {
        return goodCounts;
    }

    @JsonProperty("goodCounts")
    public void setGoodCounts(GoodCounts goodCounts) {
        this.goodCounts = goodCounts;
    }

    @JsonProperty("techTileMap")
    public TechTileMap getTechTileMap() {
        return techTileMap;
    }

    @JsonProperty("techTileMap")
    public void setTechTileMap(TechTileMap techTileMap) {
        this.techTileMap = techTileMap;
    }

    @JsonProperty("claimedCitizens")
    public List<Object> getClaimedCitizens() {
        return claimedCitizens;
    }

    @JsonProperty("claimedCitizens")
    public void setClaimedCitizens(List<Object> claimedCitizens) {
        this.claimedCitizens = claimedCitizens;
    }

    @JsonProperty("placeTiles")
    public List<Object> getPlaceTiles() {
        return placeTiles;
    }

    @JsonProperty("placeTiles")
    public void setPlaceTiles(List<Object> placeTiles) {
        this.placeTiles = placeTiles;
    }

    @JsonProperty("tradingStationLocations")
    public List<Object> getTradingStationLocations() {
        return tradingStationLocations;
    }

    @JsonProperty("tradingStationLocations")
    public void setTradingStationLocations(List<Object> tradingStationLocations) {
        this.tradingStationLocations = tradingStationLocations;
    }

    @JsonProperty("bathhouseChoices")
    public List<Object> getBathhouseChoices() {
        return bathhouseChoices;
    }

    @JsonProperty("bathhouseChoices")
    public void setBathhouseChoices(List<Object> bathhouseChoices) {
        this.bathhouseChoices = bathhouseChoices;
    }

    @JsonProperty("beingTortured")
    public boolean isBeingTortured() {
        return beingTortured;
    }

    @JsonProperty("beingTortured")
    public void setBeingTortured(boolean beingTortured) {
        this.beingTortured = beingTortured;
    }

    @JsonProperty("score")
    public int getScore() {
        return score;
    }

    @JsonProperty("score")
    public void setScore(int score) {
        this.score = score;
    }

    @JsonProperty("maxAllowableTradingStations")
    public int getMaxAllowableTradingStations() {
        return maxAllowableTradingStations;
    }

    @JsonProperty("maxAllowableTradingStations")
    public void setMaxAllowableTradingStations(int maxAllowableTradingStations) {
        this.maxAllowableTradingStations = maxAllowableTradingStations;
    }

    @JsonProperty("tradingStationCount")
    public int getTradingStationCount() {
        return tradingStationCount;
    }

    @JsonProperty("tradingStationCount")
    public void setTradingStationCount(int tradingStationCount) {
        this.tradingStationCount = tradingStationCount;
    }

    @JsonProperty("claimedCitizenCount")
    public int getClaimedCitizenCount() {
        return claimedCitizenCount;
    }

    @JsonProperty("claimedCitizenCount")
    public void setClaimedCitizenCount(int claimedCitizenCount) {
        this.claimedCitizenCount = claimedCitizenCount;
    }

    @JsonProperty("fullGoodCount")
    public int getFullGoodCount() {
        return fullGoodCount;
    }

    @JsonProperty("fullGoodCount")
    public void setFullGoodCount(int fullGoodCount) {
        this.fullGoodCount = fullGoodCount;
    }

    @JsonProperty("foodAvailable")
    public boolean isFoodAvailable() {
        return foodAvailable;
    }

    @JsonProperty("foodAvailable")
    public void setFoodAvailable(boolean foodAvailable) {
        this.foodAvailable = foodAvailable;
    }

    @JsonProperty("bathhouseChoice")
    public Object getBathhouseChoice() {
        return bathhouseChoice;
    }

    @JsonProperty("bathhouseChoice")
    public void setBathhouseChoice(Object bathhouseChoice) {
        this.bathhouseChoice = bathhouseChoice;
    }

    @JsonProperty("playingSacristy")
    public boolean isPlayingSacristy() {
        return playingSacristy;
    }

    @JsonProperty("playingSacristy")
    public void setPlayingSacristy(boolean playingSacristy) {
        this.playingSacristy = playingSacristy;
    }

    @JsonProperty("availableMarketSlots")
    public int getAvailableMarketSlots() {
        return availableMarketSlots;
    }

    @JsonProperty("availableMarketSlots")
    public void setAvailableMarketSlots(int availableMarketSlots) {
        this.availableMarketSlots = availableMarketSlots;
    }

    @JsonProperty("tracks")
    public Tracks getTracks() {
        return tracks;
    }

    @JsonProperty("tracks")
    public void setTracks(Tracks tracks) {
        this.tracks = tracks;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("playerId", playerId).append("playerColor", playerColor).append("phaseComplete", phaseComplete).append("bag", bag).append("plans", plans).append("merchantLocation", merchantLocation).append("coinCount", coinCount).append("market", market).append("goodCounts", goodCounts).append("techTileMap", techTileMap).append("claimedCitizens", claimedCitizens).append("placeTiles", placeTiles).append("tradingStationLocations", tradingStationLocations).append("bathhouseChoices", bathhouseChoices).append("beingTortured", beingTortured).append("score", score).append("maxAllowableTradingStations", maxAllowableTradingStations).append("tradingStationCount", tradingStationCount).append("claimedCitizenCount", claimedCitizenCount).append("fullGoodCount", fullGoodCount).append("foodAvailable", foodAvailable).append("bathhouseChoice", bathhouseChoice).append("playingSacristy", playingSacristy).append("availableMarketSlots", availableMarketSlots).append("tracks", tracks).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(foodAvailable).append(bag).append(playingSacristy).append(goodCounts).append(bathhouseChoices).append(score).append(claimedCitizens).append(fullGoodCount).append(phaseComplete).append(bathhouseChoice).append(claimedCitizenCount).append(playerId).append(coinCount).append(tradingStationCount).append(beingTortured).append(maxAllowableTradingStations).append(playerColor).append(tradingStationLocations).append(tracks).append(availableMarketSlots).append(market).append(merchantLocation).append(plans).append(placeTiles).append(techTileMap).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Player) == false) {
            return false;
        }
        Player rhs = ((Player) other);
        return new EqualsBuilder().append(foodAvailable, rhs.foodAvailable).append(bag, rhs.bag).append(playingSacristy, rhs.playingSacristy).append(goodCounts, rhs.goodCounts).append(bathhouseChoices, rhs.bathhouseChoices).append(score, rhs.score).append(claimedCitizens, rhs.claimedCitizens).append(fullGoodCount, rhs.fullGoodCount).append(phaseComplete, rhs.phaseComplete).append(bathhouseChoice, rhs.bathhouseChoice).append(claimedCitizenCount, rhs.claimedCitizenCount).append(playerId, rhs.playerId).append(coinCount, rhs.coinCount).append(tradingStationCount, rhs.tradingStationCount).append(beingTortured, rhs.beingTortured).append(maxAllowableTradingStations, rhs.maxAllowableTradingStations).append(playerColor, rhs.playerColor).append(tradingStationLocations, rhs.tradingStationLocations).append(tracks, rhs.tracks).append(availableMarketSlots, rhs.availableMarketSlots).append(market, rhs.market).append(merchantLocation, rhs.merchantLocation).append(plans, rhs.plans).append(placeTiles, rhs.placeTiles).append(techTileMap, rhs.techTileMap).isEquals();
    }

}
