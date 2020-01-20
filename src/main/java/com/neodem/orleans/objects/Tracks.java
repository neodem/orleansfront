
package com.neodem.orleans.objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Craftsmen",
    "Farmers",
    "Knights",
    "Boatmen",
    "Scholars",
    "Traders",
    "Development"
})
public class Tracks {

    @JsonProperty("Craftsmen")
    private int craftsmen;
    @JsonProperty("Farmers")
    private int farmers;
    @JsonProperty("Knights")
    private int knights;
    @JsonProperty("Boatmen")
    private int boatmen;
    @JsonProperty("Scholars")
    private int scholars;
    @JsonProperty("Traders")
    private int traders;
    @JsonProperty("Development")
    private int development;

    @JsonProperty("Craftsmen")
    public int getCraftsmen() {
        return craftsmen;
    }

    @JsonProperty("Craftsmen")
    public void setCraftsmen(int craftsmen) {
        this.craftsmen = craftsmen;
    }

    @JsonProperty("Farmers")
    public int getFarmers() {
        return farmers;
    }

    @JsonProperty("Farmers")
    public void setFarmers(int farmers) {
        this.farmers = farmers;
    }

    @JsonProperty("Knights")
    public int getKnights() {
        return knights;
    }

    @JsonProperty("Knights")
    public void setKnights(int knights) {
        this.knights = knights;
    }

    @JsonProperty("Boatmen")
    public int getBoatmen() {
        return boatmen;
    }

    @JsonProperty("Boatmen")
    public void setBoatmen(int boatmen) {
        this.boatmen = boatmen;
    }

    @JsonProperty("Scholars")
    public int getScholars() {
        return scholars;
    }

    @JsonProperty("Scholars")
    public void setScholars(int scholars) {
        this.scholars = scholars;
    }

    @JsonProperty("Traders")
    public int getTraders() {
        return traders;
    }

    @JsonProperty("Traders")
    public void setTraders(int traders) {
        this.traders = traders;
    }

    @JsonProperty("Development")
    public int getDevelopment() {
        return development;
    }

    @JsonProperty("Development")
    public void setDevelopment(int development) {
        this.development = development;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("craftsmen", craftsmen).append("farmers", farmers).append("knights", knights).append("boatmen", boatmen).append("scholars", scholars).append("traders", traders).append("development", development).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(knights).append(development).append(craftsmen).append(traders).append(farmers).append(scholars).append(boatmen).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Tracks) == false) {
            return false;
        }
        Tracks rhs = ((Tracks) other);
        return new EqualsBuilder().append(knights, rhs.knights).append(development, rhs.development).append(craftsmen, rhs.craftsmen).append(traders, rhs.traders).append(farmers, rhs.farmers).append(scholars, rhs.scholars).append(boatmen, rhs.boatmen).isEquals();
    }

}
