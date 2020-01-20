
package com.neodem.orleans.objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "BuildingCityWall",
    "Canalisation",
    "PapalConclave",
    "DefeatingPlague",
    "Astronomy",
    "PeaceTreaty",
    "FoundingBoatmenGuild",
    "BuildingCathedral"
})
public class BenefitTracks {

    @JsonProperty("BuildingCityWall")
    private BuildingCityWall buildingCityWall;
    @JsonProperty("Canalisation")
    private Canalisation canalisation;
    @JsonProperty("PapalConclave")
    private PapalConclave papalConclave;
    @JsonProperty("DefeatingPlague")
    private DefeatingPlague defeatingPlague;
    @JsonProperty("Astronomy")
    private Astronomy astronomy;
    @JsonProperty("PeaceTreaty")
    private PeaceTreaty peaceTreaty;
    @JsonProperty("FoundingBoatmenGuild")
    private FoundingBoatmenGuild foundingBoatmenGuild;
    @JsonProperty("BuildingCathedral")
    private BuildingCathedral buildingCathedral;

    @JsonProperty("BuildingCityWall")
    public BuildingCityWall getBuildingCityWall() {
        return buildingCityWall;
    }

    @JsonProperty("BuildingCityWall")
    public void setBuildingCityWall(BuildingCityWall buildingCityWall) {
        this.buildingCityWall = buildingCityWall;
    }

    @JsonProperty("Canalisation")
    public Canalisation getCanalisation() {
        return canalisation;
    }

    @JsonProperty("Canalisation")
    public void setCanalisation(Canalisation canalisation) {
        this.canalisation = canalisation;
    }

    @JsonProperty("PapalConclave")
    public PapalConclave getPapalConclave() {
        return papalConclave;
    }

    @JsonProperty("PapalConclave")
    public void setPapalConclave(PapalConclave papalConclave) {
        this.papalConclave = papalConclave;
    }

    @JsonProperty("DefeatingPlague")
    public DefeatingPlague getDefeatingPlague() {
        return defeatingPlague;
    }

    @JsonProperty("DefeatingPlague")
    public void setDefeatingPlague(DefeatingPlague defeatingPlague) {
        this.defeatingPlague = defeatingPlague;
    }

    @JsonProperty("Astronomy")
    public Astronomy getAstronomy() {
        return astronomy;
    }

    @JsonProperty("Astronomy")
    public void setAstronomy(Astronomy astronomy) {
        this.astronomy = astronomy;
    }

    @JsonProperty("PeaceTreaty")
    public PeaceTreaty getPeaceTreaty() {
        return peaceTreaty;
    }

    @JsonProperty("PeaceTreaty")
    public void setPeaceTreaty(PeaceTreaty peaceTreaty) {
        this.peaceTreaty = peaceTreaty;
    }

    @JsonProperty("FoundingBoatmenGuild")
    public FoundingBoatmenGuild getFoundingBoatmenGuild() {
        return foundingBoatmenGuild;
    }

    @JsonProperty("FoundingBoatmenGuild")
    public void setFoundingBoatmenGuild(FoundingBoatmenGuild foundingBoatmenGuild) {
        this.foundingBoatmenGuild = foundingBoatmenGuild;
    }

    @JsonProperty("BuildingCathedral")
    public BuildingCathedral getBuildingCathedral() {
        return buildingCathedral;
    }

    @JsonProperty("BuildingCathedral")
    public void setBuildingCathedral(BuildingCathedral buildingCathedral) {
        this.buildingCathedral = buildingCathedral;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("buildingCityWall", buildingCityWall).append("canalisation", canalisation).append("papalConclave", papalConclave).append("defeatingPlague", defeatingPlague).append("astronomy", astronomy).append("peaceTreaty", peaceTreaty).append("foundingBoatmenGuild", foundingBoatmenGuild).append("buildingCathedral", buildingCathedral).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(peaceTreaty).append(foundingBoatmenGuild).append(defeatingPlague).append(buildingCathedral).append(astronomy).append(buildingCityWall).append(canalisation).append(papalConclave).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BenefitTracks) == false) {
            return false;
        }
        BenefitTracks rhs = ((BenefitTracks) other);
        return new EqualsBuilder().append(peaceTreaty, rhs.peaceTreaty).append(foundingBoatmenGuild, rhs.foundingBoatmenGuild).append(defeatingPlague, rhs.defeatingPlague).append(buildingCathedral, rhs.buildingCathedral).append(astronomy, rhs.astronomy).append(buildingCityWall, rhs.buildingCityWall).append(canalisation, rhs.canalisation).append(papalConclave, rhs.papalConclave).isEquals();
    }

}
