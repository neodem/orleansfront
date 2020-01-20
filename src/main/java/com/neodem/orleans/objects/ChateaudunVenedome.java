
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
    "pathBetween",
    "pathType",
    "goods"
})
public class ChateaudunVenedome {

    @JsonProperty("pathBetween")
    private PathBetween_______________________________________________________________ pathBetween;
    @JsonProperty("pathType")
    private String pathType;
    @JsonProperty("goods")
    private List<String> goods = null;

    @JsonProperty("pathBetween")
    public PathBetween_______________________________________________________________ getPathBetween() {
        return pathBetween;
    }

    @JsonProperty("pathBetween")
    public void setPathBetween(PathBetween_______________________________________________________________ pathBetween) {
        this.pathBetween = pathBetween;
    }

    @JsonProperty("pathType")
    public String getPathType() {
        return pathType;
    }

    @JsonProperty("pathType")
    public void setPathType(String pathType) {
        this.pathType = pathType;
    }

    @JsonProperty("goods")
    public List<String> getGoods() {
        return goods;
    }

    @JsonProperty("goods")
    public void setGoods(List<String> goods) {
        this.goods = goods;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("pathBetween", pathBetween).append("pathType", pathType).append("goods", goods).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(goods).append(pathType).append(pathBetween).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ChateaudunVenedome) == false) {
            return false;
        }
        ChateaudunVenedome rhs = ((ChateaudunVenedome) other);
        return new EqualsBuilder().append(goods, rhs.goods).append(pathType, rhs.pathType).append(pathBetween, rhs.pathBetween).isEquals();
    }

}
