
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
    "track",
    "maxSize",
    "filledSpotsCount",
    "full",
    "readyWhenNotFull"
})
public class Village {

    @JsonProperty("track")
    private List<Track> track = null;
    @JsonProperty("maxSize")
    private int maxSize;
    @JsonProperty("filledSpotsCount")
    private int filledSpotsCount;
    @JsonProperty("full")
    private boolean full;
    @JsonProperty("readyWhenNotFull")
    private boolean readyWhenNotFull;

    @JsonProperty("track")
    public List<Track> getTrack() {
        return track;
    }

    @JsonProperty("track")
    public void setTrack(List<Track> track) {
        this.track = track;
    }

    @JsonProperty("maxSize")
    public int getMaxSize() {
        return maxSize;
    }

    @JsonProperty("maxSize")
    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    @JsonProperty("filledSpotsCount")
    public int getFilledSpotsCount() {
        return filledSpotsCount;
    }

    @JsonProperty("filledSpotsCount")
    public void setFilledSpotsCount(int filledSpotsCount) {
        this.filledSpotsCount = filledSpotsCount;
    }

    @JsonProperty("full")
    public boolean isFull() {
        return full;
    }

    @JsonProperty("full")
    public void setFull(boolean full) {
        this.full = full;
    }

    @JsonProperty("readyWhenNotFull")
    public boolean isReadyWhenNotFull() {
        return readyWhenNotFull;
    }

    @JsonProperty("readyWhenNotFull")
    public void setReadyWhenNotFull(boolean readyWhenNotFull) {
        this.readyWhenNotFull = readyWhenNotFull;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("track", track).append("maxSize", maxSize).append("filledSpotsCount", filledSpotsCount).append("full", full).append("readyWhenNotFull", readyWhenNotFull).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(filledSpotsCount).append(maxSize).append(track).append(readyWhenNotFull).append(full).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Village) == false) {
            return false;
        }
        Village rhs = ((Village) other);
        return new EqualsBuilder().append(filledSpotsCount, rhs.filledSpotsCount).append(maxSize, rhs.maxSize).append(track, rhs.track).append(readyWhenNotFull, rhs.readyWhenNotFull).append(full, rhs.full).isEquals();
    }

}
