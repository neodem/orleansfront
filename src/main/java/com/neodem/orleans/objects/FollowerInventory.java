
package com.neodem.orleans.objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Farmer",
    "Trader",
    "Craftsman",
    "Boatman",
    "Scholar",
    "Knight",
    "Monk"
})
public class FollowerInventory {

    @JsonProperty("Farmer")
    private int farmer;
    @JsonProperty("Trader")
    private int trader;
    @JsonProperty("Craftsman")
    private int craftsman;
    @JsonProperty("Boatman")
    private int boatman;
    @JsonProperty("Scholar")
    private int scholar;
    @JsonProperty("Knight")
    private int knight;
    @JsonProperty("Monk")
    private int monk;

    @JsonProperty("Farmer")
    public int getFarmer() {
        return farmer;
    }

    @JsonProperty("Farmer")
    public void setFarmer(int farmer) {
        this.farmer = farmer;
    }

    @JsonProperty("Trader")
    public int getTrader() {
        return trader;
    }

    @JsonProperty("Trader")
    public void setTrader(int trader) {
        this.trader = trader;
    }

    @JsonProperty("Craftsman")
    public int getCraftsman() {
        return craftsman;
    }

    @JsonProperty("Craftsman")
    public void setCraftsman(int craftsman) {
        this.craftsman = craftsman;
    }

    @JsonProperty("Boatman")
    public int getBoatman() {
        return boatman;
    }

    @JsonProperty("Boatman")
    public void setBoatman(int boatman) {
        this.boatman = boatman;
    }

    @JsonProperty("Scholar")
    public int getScholar() {
        return scholar;
    }

    @JsonProperty("Scholar")
    public void setScholar(int scholar) {
        this.scholar = scholar;
    }

    @JsonProperty("Knight")
    public int getKnight() {
        return knight;
    }

    @JsonProperty("Knight")
    public void setKnight(int knight) {
        this.knight = knight;
    }

    @JsonProperty("Monk")
    public int getMonk() {
        return monk;
    }

    @JsonProperty("Monk")
    public void setMonk(int monk) {
        this.monk = monk;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("farmer", farmer).append("trader", trader).append("craftsman", craftsman).append("boatman", boatman).append("scholar", scholar).append("knight", knight).append("monk", monk).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(boatman).append(craftsman).append(trader).append(knight).append(farmer).append(scholar).append(monk).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FollowerInventory) == false) {
            return false;
        }
        FollowerInventory rhs = ((FollowerInventory) other);
        return new EqualsBuilder().append(boatman, rhs.boatman).append(craftsman, rhs.craftsman).append(trader, rhs.trader).append(knight, rhs.knight).append(farmer, rhs.farmer).append(scholar, rhs.scholar).append(monk, rhs.monk).isEquals();
    }

}
