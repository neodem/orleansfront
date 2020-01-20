
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
    "marketSize",
    "market",
    "availableSlots",
    "filledSlotCount"
})
public class Market {

    @JsonProperty("marketSize")
    private int marketSize;
    @JsonProperty("market")
    private List<Market_> market = null;
    @JsonProperty("availableSlots")
    private int availableSlots;
    @JsonProperty("filledSlotCount")
    private int filledSlotCount;

    @JsonProperty("marketSize")
    public int getMarketSize() {
        return marketSize;
    }

    @JsonProperty("marketSize")
    public void setMarketSize(int marketSize) {
        this.marketSize = marketSize;
    }

    @JsonProperty("market")
    public List<Market_> getMarket() {
        return market;
    }

    @JsonProperty("market")
    public void setMarket(List<Market_> market) {
        this.market = market;
    }

    @JsonProperty("availableSlots")
    public int getAvailableSlots() {
        return availableSlots;
    }

    @JsonProperty("availableSlots")
    public void setAvailableSlots(int availableSlots) {
        this.availableSlots = availableSlots;
    }

    @JsonProperty("filledSlotCount")
    public int getFilledSlotCount() {
        return filledSlotCount;
    }

    @JsonProperty("filledSlotCount")
    public void setFilledSlotCount(int filledSlotCount) {
        this.filledSlotCount = filledSlotCount;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("marketSize", marketSize).append("market", market).append("availableSlots", availableSlots).append("filledSlotCount", filledSlotCount).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(market).append(marketSize).append(availableSlots).append(filledSlotCount).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Market) == false) {
            return false;
        }
        Market rhs = ((Market) other);
        return new EqualsBuilder().append(market, rhs.market).append(marketSize, rhs.marketSize).append(availableSlots, rhs.availableSlots).append(filledSlotCount, rhs.filledSlotCount).isEquals();
    }

}
