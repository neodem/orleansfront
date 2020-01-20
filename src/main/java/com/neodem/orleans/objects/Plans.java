
package com.neodem.orleans.objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Village"
})
public class Plans {

    @JsonProperty("Village")
    private Village village;

    @JsonProperty("Village")
    public Village getVillage() {
        return village;
    }

    @JsonProperty("Village")
    public void setVillage(Village village) {
        this.village = village;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("village", village).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(village).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Plans) == false) {
            return false;
        }
        Plans rhs = ((Plans) other);
        return new EqualsBuilder().append(village, rhs.village).isEquals();
    }

}
