
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
    "followerType",
    "dba"
})
public class FollowerInSlot {

    @JsonProperty("followerType")
    private String followerType;
    @JsonProperty("dba")
    private List<String> dba = null;

    @JsonProperty("followerType")
    public String getFollowerType() {
        return followerType;
    }

    @JsonProperty("followerType")
    public void setFollowerType(String followerType) {
        this.followerType = followerType;
    }

    @JsonProperty("dba")
    public List<String> getDba() {
        return dba;
    }

    @JsonProperty("dba")
    public void setDba(List<String> dba) {
        this.dba = dba;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("followerType", followerType).append("dba", dba).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(dba).append(followerType).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FollowerInSlot) == false) {
            return false;
        }
        FollowerInSlot rhs = ((FollowerInSlot) other);
        return new EqualsBuilder().append(dba, rhs.dba).append(followerType, rhs.followerType).isEquals();
    }

}
