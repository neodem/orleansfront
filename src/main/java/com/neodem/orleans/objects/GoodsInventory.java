
package com.neodem.orleans.objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Grain",
    "Cheese",
    "Brocade",
    "Wine",
    "Wool"
})
public class GoodsInventory {

    @JsonProperty("Grain")
    private int grain;
    @JsonProperty("Cheese")
    private int cheese;
    @JsonProperty("Brocade")
    private int brocade;
    @JsonProperty("Wine")
    private int wine;
    @JsonProperty("Wool")
    private int wool;

    @JsonProperty("Grain")
    public int getGrain() {
        return grain;
    }

    @JsonProperty("Grain")
    public void setGrain(int grain) {
        this.grain = grain;
    }

    @JsonProperty("Cheese")
    public int getCheese() {
        return cheese;
    }

    @JsonProperty("Cheese")
    public void setCheese(int cheese) {
        this.cheese = cheese;
    }

    @JsonProperty("Brocade")
    public int getBrocade() {
        return brocade;
    }

    @JsonProperty("Brocade")
    public void setBrocade(int brocade) {
        this.brocade = brocade;
    }

    @JsonProperty("Wine")
    public int getWine() {
        return wine;
    }

    @JsonProperty("Wine")
    public void setWine(int wine) {
        this.wine = wine;
    }

    @JsonProperty("Wool")
    public int getWool() {
        return wool;
    }

    @JsonProperty("Wool")
    public void setWool(int wool) {
        this.wool = wool;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("grain", grain).append("cheese", cheese).append("brocade", brocade).append("wine", wine).append("wool", wool).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(wool).append(grain).append(brocade).append(wine).append(cheese).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GoodsInventory) == false) {
            return false;
        }
        GoodsInventory rhs = ((GoodsInventory) other);
        return new EqualsBuilder().append(wool, rhs.wool).append(grain, rhs.grain).append(brocade, rhs.brocade).append(wine, rhs.wine).append(cheese, rhs.cheese).isEquals();
    }

}
