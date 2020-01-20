
package com.neodem.orleans.objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "expectedType",
    "followerInSlot"
})
public class Track________ {

    @JsonProperty("expectedType")
    private String expectedType;
    @JsonProperty("followerInSlot")
    private Object followerInSlot;

    @JsonProperty("expectedType")
    public String getExpectedType() {
        return expectedType;
    }

    @JsonProperty("expectedType")
    public void setExpectedType(String expectedType) {
        this.expectedType = expectedType;
    }

    @JsonProperty("followerInSlot")
    public Object getFollowerInSlot() {
        return followerInSlot;
    }

    @JsonProperty("followerInSlot")
    public void setFollowerInSlot(Object followerInSlot) {
        this.followerInSlot = followerInSlot;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("expectedType", expectedType).append("followerInSlot", followerInSlot).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(followerInSlot).append(expectedType).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Track________) == false) {
            return false;
        }
        Track________ rhs = ((Track________) other);
        return new EqualsBuilder().append(followerInSlot, rhs.followerInSlot).append(expectedType, rhs.expectedType).isEquals();
    }

}
