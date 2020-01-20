
package com.neodem.orleans.objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "benefitTracks"
})
public class BenefitTracker {

    @JsonProperty("benefitTracks")
    private BenefitTracks benefitTracks;

    @JsonProperty("benefitTracks")
    public BenefitTracks getBenefitTracks() {
        return benefitTracks;
    }

    @JsonProperty("benefitTracks")
    public void setBenefitTracks(BenefitTracks benefitTracks) {
        this.benefitTracks = benefitTracks;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("benefitTracks", benefitTracks).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(benefitTracks).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BenefitTracker) == false) {
            return false;
        }
        BenefitTracker rhs = ((BenefitTracker) other);
        return new EqualsBuilder().append(benefitTracks, rhs.benefitTracks).isEquals();
    }

}
