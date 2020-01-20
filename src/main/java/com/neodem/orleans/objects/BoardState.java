
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
    "pathsFromTown",
    "allPaths",
    "pathsBetween"
})
public class BoardState {

    @JsonProperty("pathsFromTown")
    private PathsFromTown pathsFromTown;
    @JsonProperty("allPaths")
    private List<AllPath> allPaths = null;
    @JsonProperty("pathsBetween")
    private PathsBetween pathsBetween;

    @JsonProperty("pathsFromTown")
    public PathsFromTown getPathsFromTown() {
        return pathsFromTown;
    }

    @JsonProperty("pathsFromTown")
    public void setPathsFromTown(PathsFromTown pathsFromTown) {
        this.pathsFromTown = pathsFromTown;
    }

    @JsonProperty("allPaths")
    public List<AllPath> getAllPaths() {
        return allPaths;
    }

    @JsonProperty("allPaths")
    public void setAllPaths(List<AllPath> allPaths) {
        this.allPaths = allPaths;
    }

    @JsonProperty("pathsBetween")
    public PathsBetween getPathsBetween() {
        return pathsBetween;
    }

    @JsonProperty("pathsBetween")
    public void setPathsBetween(PathsBetween pathsBetween) {
        this.pathsBetween = pathsBetween;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("pathsFromTown", pathsFromTown).append("allPaths", allPaths).append("pathsBetween", pathsBetween).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(pathsBetween).append(pathsFromTown).append(allPaths).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BoardState) == false) {
            return false;
        }
        BoardState rhs = ((BoardState) other);
        return new EqualsBuilder().append(pathsBetween, rhs.pathsBetween).append(pathsFromTown, rhs.pathsFromTown).append(allPaths, rhs.allPaths).isEquals();
    }

}
