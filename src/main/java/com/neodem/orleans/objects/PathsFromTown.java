
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
    "Briare",
    "Chateaudun",
    "Blois",
    "LaChatre",
    "Tours",
    "LeMans",
    "Sancerre",
    "Vierzon",
    "Chinon",
    "Venedome",
    "Etampes",
    "LeBlanc",
    "Loches",
    "Chartres",
    "Bourges",
    "Montargis",
    "ArgentonSurCreuse",
    "Nevers",
    "Chatelleraut",
    "Orleans",
    "Chateauroux",
    "SAmandMontrond",
    "Montrichard"
})
public class PathsFromTown {

    @JsonProperty("Briare")
    private List<Briare> briare = null;
    @JsonProperty("Chateaudun")
    private List<Chateaudun> chateaudun = null;
    @JsonProperty("Blois")
    private List<Bloi> blois = null;
    @JsonProperty("LaChatre")
    private List<LaChatre> laChatre = null;
    @JsonProperty("Tours")
    private List<Tour> tours = null;
    @JsonProperty("LeMans")
    private List<LeMan> leMans = null;
    @JsonProperty("Sancerre")
    private List<Sancerre> sancerre = null;
    @JsonProperty("Vierzon")
    private List<Vierzon> vierzon = null;
    @JsonProperty("Chinon")
    private List<Chinon> chinon = null;
    @JsonProperty("Venedome")
    private List<Venedome> venedome = null;
    @JsonProperty("Etampes")
    private List<Etampe> etampes = null;
    @JsonProperty("LeBlanc")
    private List<LeBlanc> leBlanc = null;
    @JsonProperty("Loches")
    private List<Loch> loches = null;
    @JsonProperty("Chartres")
    private List<Chartre> chartres = null;
    @JsonProperty("Bourges")
    private List<Bourge> bourges = null;
    @JsonProperty("Montargis")
    private List<Montargi> montargis = null;
    @JsonProperty("ArgentonSurCreuse")
    private List<ArgentonSurCreuse> argentonSurCreuse = null;
    @JsonProperty("Nevers")
    private List<Never> nevers = null;
    @JsonProperty("Chatelleraut")
    private List<Chatelleraut> chatelleraut = null;
    @JsonProperty("Orleans")
    private List<Orlean> orleans = null;
    @JsonProperty("Chateauroux")
    private List<Chateauroux> chateauroux = null;
    @JsonProperty("SAmandMontrond")
    private List<SAmandMontrond> sAmandMontrond = null;
    @JsonProperty("Montrichard")
    private List<Montrichard> montrichard = null;

    @JsonProperty("Briare")
    public List<Briare> getBriare() {
        return briare;
    }

    @JsonProperty("Briare")
    public void setBriare(List<Briare> briare) {
        this.briare = briare;
    }

    @JsonProperty("Chateaudun")
    public List<Chateaudun> getChateaudun() {
        return chateaudun;
    }

    @JsonProperty("Chateaudun")
    public void setChateaudun(List<Chateaudun> chateaudun) {
        this.chateaudun = chateaudun;
    }

    @JsonProperty("Blois")
    public List<Bloi> getBlois() {
        return blois;
    }

    @JsonProperty("Blois")
    public void setBlois(List<Bloi> blois) {
        this.blois = blois;
    }

    @JsonProperty("LaChatre")
    public List<LaChatre> getLaChatre() {
        return laChatre;
    }

    @JsonProperty("LaChatre")
    public void setLaChatre(List<LaChatre> laChatre) {
        this.laChatre = laChatre;
    }

    @JsonProperty("Tours")
    public List<Tour> getTours() {
        return tours;
    }

    @JsonProperty("Tours")
    public void setTours(List<Tour> tours) {
        this.tours = tours;
    }

    @JsonProperty("LeMans")
    public List<LeMan> getLeMans() {
        return leMans;
    }

    @JsonProperty("LeMans")
    public void setLeMans(List<LeMan> leMans) {
        this.leMans = leMans;
    }

    @JsonProperty("Sancerre")
    public List<Sancerre> getSancerre() {
        return sancerre;
    }

    @JsonProperty("Sancerre")
    public void setSancerre(List<Sancerre> sancerre) {
        this.sancerre = sancerre;
    }

    @JsonProperty("Vierzon")
    public List<Vierzon> getVierzon() {
        return vierzon;
    }

    @JsonProperty("Vierzon")
    public void setVierzon(List<Vierzon> vierzon) {
        this.vierzon = vierzon;
    }

    @JsonProperty("Chinon")
    public List<Chinon> getChinon() {
        return chinon;
    }

    @JsonProperty("Chinon")
    public void setChinon(List<Chinon> chinon) {
        this.chinon = chinon;
    }

    @JsonProperty("Venedome")
    public List<Venedome> getVenedome() {
        return venedome;
    }

    @JsonProperty("Venedome")
    public void setVenedome(List<Venedome> venedome) {
        this.venedome = venedome;
    }

    @JsonProperty("Etampes")
    public List<Etampe> getEtampes() {
        return etampes;
    }

    @JsonProperty("Etampes")
    public void setEtampes(List<Etampe> etampes) {
        this.etampes = etampes;
    }

    @JsonProperty("LeBlanc")
    public List<LeBlanc> getLeBlanc() {
        return leBlanc;
    }

    @JsonProperty("LeBlanc")
    public void setLeBlanc(List<LeBlanc> leBlanc) {
        this.leBlanc = leBlanc;
    }

    @JsonProperty("Loches")
    public List<Loch> getLoches() {
        return loches;
    }

    @JsonProperty("Loches")
    public void setLoches(List<Loch> loches) {
        this.loches = loches;
    }

    @JsonProperty("Chartres")
    public List<Chartre> getChartres() {
        return chartres;
    }

    @JsonProperty("Chartres")
    public void setChartres(List<Chartre> chartres) {
        this.chartres = chartres;
    }

    @JsonProperty("Bourges")
    public List<Bourge> getBourges() {
        return bourges;
    }

    @JsonProperty("Bourges")
    public void setBourges(List<Bourge> bourges) {
        this.bourges = bourges;
    }

    @JsonProperty("Montargis")
    public List<Montargi> getMontargis() {
        return montargis;
    }

    @JsonProperty("Montargis")
    public void setMontargis(List<Montargi> montargis) {
        this.montargis = montargis;
    }

    @JsonProperty("ArgentonSurCreuse")
    public List<ArgentonSurCreuse> getArgentonSurCreuse() {
        return argentonSurCreuse;
    }

    @JsonProperty("ArgentonSurCreuse")
    public void setArgentonSurCreuse(List<ArgentonSurCreuse> argentonSurCreuse) {
        this.argentonSurCreuse = argentonSurCreuse;
    }

    @JsonProperty("Nevers")
    public List<Never> getNevers() {
        return nevers;
    }

    @JsonProperty("Nevers")
    public void setNevers(List<Never> nevers) {
        this.nevers = nevers;
    }

    @JsonProperty("Chatelleraut")
    public List<Chatelleraut> getChatelleraut() {
        return chatelleraut;
    }

    @JsonProperty("Chatelleraut")
    public void setChatelleraut(List<Chatelleraut> chatelleraut) {
        this.chatelleraut = chatelleraut;
    }

    @JsonProperty("Orleans")
    public List<Orlean> getOrleans() {
        return orleans;
    }

    @JsonProperty("Orleans")
    public void setOrleans(List<Orlean> orleans) {
        this.orleans = orleans;
    }

    @JsonProperty("Chateauroux")
    public List<Chateauroux> getChateauroux() {
        return chateauroux;
    }

    @JsonProperty("Chateauroux")
    public void setChateauroux(List<Chateauroux> chateauroux) {
        this.chateauroux = chateauroux;
    }

    @JsonProperty("SAmandMontrond")
    public List<SAmandMontrond> getSAmandMontrond() {
        return sAmandMontrond;
    }

    @JsonProperty("SAmandMontrond")
    public void setSAmandMontrond(List<SAmandMontrond> sAmandMontrond) {
        this.sAmandMontrond = sAmandMontrond;
    }

    @JsonProperty("Montrichard")
    public List<Montrichard> getMontrichard() {
        return montrichard;
    }

    @JsonProperty("Montrichard")
    public void setMontrichard(List<Montrichard> montrichard) {
        this.montrichard = montrichard;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("briare", briare).append("chateaudun", chateaudun).append("blois", blois).append("laChatre", laChatre).append("tours", tours).append("leMans", leMans).append("sancerre", sancerre).append("vierzon", vierzon).append("chinon", chinon).append("venedome", venedome).append("etampes", etampes).append("leBlanc", leBlanc).append("loches", loches).append("chartres", chartres).append("bourges", bourges).append("montargis", montargis).append("argentonSurCreuse", argentonSurCreuse).append("nevers", nevers).append("chatelleraut", chatelleraut).append("orleans", orleans).append("chateauroux", chateauroux).append("sAmandMontrond", sAmandMontrond).append("montrichard", montrichard).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(loches).append(chateaudun).append(argentonSurCreuse).append(sAmandMontrond).append(vierzon).append(briare).append(montargis).append(tours).append(leMans).append(montrichard).append(etampes).append(chinon).append(laChatre).append(orleans).append(blois).append(sancerre).append(bourges).append(venedome).append(leBlanc).append(nevers).append(chartres).append(chateauroux).append(chatelleraut).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PathsFromTown) == false) {
            return false;
        }
        PathsFromTown rhs = ((PathsFromTown) other);
        return new EqualsBuilder().append(loches, rhs.loches).append(chateaudun, rhs.chateaudun).append(argentonSurCreuse, rhs.argentonSurCreuse).append(sAmandMontrond, rhs.sAmandMontrond).append(vierzon, rhs.vierzon).append(briare, rhs.briare).append(montargis, rhs.montargis).append(tours, rhs.tours).append(leMans, rhs.leMans).append(montrichard, rhs.montrichard).append(etampes, rhs.etampes).append(chinon, rhs.chinon).append(laChatre, rhs.laChatre).append(orleans, rhs.orleans).append(blois, rhs.blois).append(sancerre, rhs.sancerre).append(bourges, rhs.bourges).append(venedome, rhs.venedome).append(leBlanc, rhs.leBlanc).append(nevers, rhs.nevers).append(chartres, rhs.chartres).append(chateauroux, rhs.chateauroux).append(chatelleraut, rhs.chatelleraut).isEquals();
    }

}
