
package com.neodem.orleans.objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "location1",
    "location2"
})
public class PathBetween_________________________________________________ {

    @JsonProperty("location1")
    private String location1;
    @JsonProperty("location2")
    private String location2;

    @JsonProperty("location1")
    public String getLocation1() {
        return location1;
    }

    @JsonProperty("location1")
    public void setLocation1(String location1) {
        this.location1 = location1;
    }

    @JsonProperty("location2")
    public String getLocation2() {
        return location2;
    }

    @JsonProperty("location2")
    public void setLocation2(String location2) {
        this.location2 = location2;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("location1", location1).append("location2", location2).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(location1).append(location2).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PathBetween_________________________________________________) == false) {
            return false;
        }
        PathBetween_________________________________________________ rhs = ((PathBetween_________________________________________________) other);
        return new EqualsBuilder().append(location1, rhs.location1).append(location2, rhs.location2).isEquals();
    }

}
