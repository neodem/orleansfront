
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
    "LeMans-Chateaudun",
    "LeBlanc-ArgentonSurCreuse",
    "Tours-Loches",
    "Venedome-Blois",
    "Montrichard-Loches",
    "Vierzon-Chateauroux",
    "Chatelleraut-ArgentonSurCreuse",
    "Bourges-Nevers",
    "Orleans-Briare",
    "LeBlanc-Chateauroux",
    "Orleans-Vierzon",
    "Tours-Montrichard",
    "Sancerre-Bourges",
    "Chinon-LeBlanc",
    "Tours-Chinon",
    "Sancerre-Nevers",
    "Bourges-SAmandMontrond",
    "SAmandMontrond-Nevers",
    "LeMans-Tours",
    "Montargis-Briare",
    "Vierzon-SAmandMontrond",
    "Chartres-LeMans",
    "LeMans-Venedome",
    "Chateaudun-Orleans",
    "Chartres-Orleans",
    "Orleans-Blois",
    "Briare-Sancerre",
    "Loches-Chateauroux",
    "Blois-Tours",
    "Chateauroux-LaChatre",
    "Etampes-Montargis",
    "Vierzon-Bourges",
    "Chartres-Etampes",
    "Chartres-Chateaudun",
    "Chinon-Chatelleraut",
    "Montrichard-Vierzon",
    "ArgentonSurCreuse-LaChatre",
    "Orleans-Montargis",
    "Chateauroux-ArgentonSurCreuse",
    "Chateaudun-Venedome",
    "LaChatre-SAmandMontrond",
    "Blois-Vierzon"
})
public class PathsBetween {

    @JsonProperty("LeMans-Chateaudun")
    private List<LeMansChateaudun> leMansChateaudun = null;
    @JsonProperty("LeBlanc-ArgentonSurCreuse")
    private List<LeBlancArgentonSurCreuse> leBlancArgentonSurCreuse = null;
    @JsonProperty("Tours-Loches")
    private List<ToursLoch> toursLoches = null;
    @JsonProperty("Venedome-Blois")
    private List<VenedomeBloi> venedomeBlois = null;
    @JsonProperty("Montrichard-Loches")
    private List<MontrichardLoch> montrichardLoches = null;
    @JsonProperty("Vierzon-Chateauroux")
    private List<VierzonChateauroux> vierzonChateauroux = null;
    @JsonProperty("Chatelleraut-ArgentonSurCreuse")
    private List<ChatellerautArgentonSurCreuse> chatellerautArgentonSurCreuse = null;
    @JsonProperty("Bourges-Nevers")
    private List<BourgesNever> bourgesNevers = null;
    @JsonProperty("Orleans-Briare")
    private List<OrleansBriare> orleansBriare = null;
    @JsonProperty("LeBlanc-Chateauroux")
    private List<LeBlancChateauroux> leBlancChateauroux = null;
    @JsonProperty("Orleans-Vierzon")
    private List<OrleansVierzon> orleansVierzon = null;
    @JsonProperty("Tours-Montrichard")
    private List<ToursMontrichard> toursMontrichard = null;
    @JsonProperty("Sancerre-Bourges")
    private List<SancerreBourge> sancerreBourges = null;
    @JsonProperty("Chinon-LeBlanc")
    private List<ChinonLeBlanc> chinonLeBlanc = null;
    @JsonProperty("Tours-Chinon")
    private List<ToursChinon> toursChinon = null;
    @JsonProperty("Sancerre-Nevers")
    private List<SancerreNever> sancerreNevers = null;
    @JsonProperty("Bourges-SAmandMontrond")
    private List<BourgesSAmandMontrond> bourgesSAmandMontrond = null;
    @JsonProperty("SAmandMontrond-Nevers")
    private List<SAmandMontrondNever> sAmandMontrondNevers = null;
    @JsonProperty("LeMans-Tours")
    private List<LeMansTour> leMansTours = null;
    @JsonProperty("Montargis-Briare")
    private List<MontargisBriare> montargisBriare = null;
    @JsonProperty("Vierzon-SAmandMontrond")
    private List<VierzonSAmandMontrond> vierzonSAmandMontrond = null;
    @JsonProperty("Chartres-LeMans")
    private List<ChartresLeMan> chartresLeMans = null;
    @JsonProperty("LeMans-Venedome")
    private List<LeMansVenedome> leMansVenedome = null;
    @JsonProperty("Chateaudun-Orleans")
    private List<ChateaudunOrlean> chateaudunOrleans = null;
    @JsonProperty("Chartres-Orleans")
    private List<ChartresOrlean> chartresOrleans = null;
    @JsonProperty("Orleans-Blois")
    private List<OrleansBloi> orleansBlois = null;
    @JsonProperty("Briare-Sancerre")
    private List<BriareSancerre> briareSancerre = null;
    @JsonProperty("Loches-Chateauroux")
    private List<LochesChateauroux> lochesChateauroux = null;
    @JsonProperty("Blois-Tours")
    private List<BloisTour> bloisTours = null;
    @JsonProperty("Chateauroux-LaChatre")
    private List<ChateaurouxLaChatre> chateaurouxLaChatre = null;
    @JsonProperty("Etampes-Montargis")
    private List<EtampesMontargi> etampesMontargis = null;
    @JsonProperty("Vierzon-Bourges")
    private List<VierzonBourge> vierzonBourges = null;
    @JsonProperty("Chartres-Etampes")
    private List<ChartresEtampe> chartresEtampes = null;
    @JsonProperty("Chartres-Chateaudun")
    private List<ChartresChateaudun> chartresChateaudun = null;
    @JsonProperty("Chinon-Chatelleraut")
    private List<ChinonChatelleraut> chinonChatelleraut = null;
    @JsonProperty("Montrichard-Vierzon")
    private List<MontrichardVierzon> montrichardVierzon = null;
    @JsonProperty("ArgentonSurCreuse-LaChatre")
    private List<ArgentonSurCreuseLaChatre> argentonSurCreuseLaChatre = null;
    @JsonProperty("Orleans-Montargis")
    private List<OrleansMontargi> orleansMontargis = null;
    @JsonProperty("Chateauroux-ArgentonSurCreuse")
    private List<ChateaurouxArgentonSurCreuse> chateaurouxArgentonSurCreuse = null;
    @JsonProperty("Chateaudun-Venedome")
    private List<ChateaudunVenedome> chateaudunVenedome = null;
    @JsonProperty("LaChatre-SAmandMontrond")
    private List<LaChatreSAmandMontrond> laChatreSAmandMontrond = null;
    @JsonProperty("Blois-Vierzon")
    private List<BloisVierzon> bloisVierzon = null;

    @JsonProperty("LeMans-Chateaudun")
    public List<LeMansChateaudun> getLeMansChateaudun() {
        return leMansChateaudun;
    }

    @JsonProperty("LeMans-Chateaudun")
    public void setLeMansChateaudun(List<LeMansChateaudun> leMansChateaudun) {
        this.leMansChateaudun = leMansChateaudun;
    }

    @JsonProperty("LeBlanc-ArgentonSurCreuse")
    public List<LeBlancArgentonSurCreuse> getLeBlancArgentonSurCreuse() {
        return leBlancArgentonSurCreuse;
    }

    @JsonProperty("LeBlanc-ArgentonSurCreuse")
    public void setLeBlancArgentonSurCreuse(List<LeBlancArgentonSurCreuse> leBlancArgentonSurCreuse) {
        this.leBlancArgentonSurCreuse = leBlancArgentonSurCreuse;
    }

    @JsonProperty("Tours-Loches")
    public List<ToursLoch> getToursLoches() {
        return toursLoches;
    }

    @JsonProperty("Tours-Loches")
    public void setToursLoches(List<ToursLoch> toursLoches) {
        this.toursLoches = toursLoches;
    }

    @JsonProperty("Venedome-Blois")
    public List<VenedomeBloi> getVenedomeBlois() {
        return venedomeBlois;
    }

    @JsonProperty("Venedome-Blois")
    public void setVenedomeBlois(List<VenedomeBloi> venedomeBlois) {
        this.venedomeBlois = venedomeBlois;
    }

    @JsonProperty("Montrichard-Loches")
    public List<MontrichardLoch> getMontrichardLoches() {
        return montrichardLoches;
    }

    @JsonProperty("Montrichard-Loches")
    public void setMontrichardLoches(List<MontrichardLoch> montrichardLoches) {
        this.montrichardLoches = montrichardLoches;
    }

    @JsonProperty("Vierzon-Chateauroux")
    public List<VierzonChateauroux> getVierzonChateauroux() {
        return vierzonChateauroux;
    }

    @JsonProperty("Vierzon-Chateauroux")
    public void setVierzonChateauroux(List<VierzonChateauroux> vierzonChateauroux) {
        this.vierzonChateauroux = vierzonChateauroux;
    }

    @JsonProperty("Chatelleraut-ArgentonSurCreuse")
    public List<ChatellerautArgentonSurCreuse> getChatellerautArgentonSurCreuse() {
        return chatellerautArgentonSurCreuse;
    }

    @JsonProperty("Chatelleraut-ArgentonSurCreuse")
    public void setChatellerautArgentonSurCreuse(List<ChatellerautArgentonSurCreuse> chatellerautArgentonSurCreuse) {
        this.chatellerautArgentonSurCreuse = chatellerautArgentonSurCreuse;
    }

    @JsonProperty("Bourges-Nevers")
    public List<BourgesNever> getBourgesNevers() {
        return bourgesNevers;
    }

    @JsonProperty("Bourges-Nevers")
    public void setBourgesNevers(List<BourgesNever> bourgesNevers) {
        this.bourgesNevers = bourgesNevers;
    }

    @JsonProperty("Orleans-Briare")
    public List<OrleansBriare> getOrleansBriare() {
        return orleansBriare;
    }

    @JsonProperty("Orleans-Briare")
    public void setOrleansBriare(List<OrleansBriare> orleansBriare) {
        this.orleansBriare = orleansBriare;
    }

    @JsonProperty("LeBlanc-Chateauroux")
    public List<LeBlancChateauroux> getLeBlancChateauroux() {
        return leBlancChateauroux;
    }

    @JsonProperty("LeBlanc-Chateauroux")
    public void setLeBlancChateauroux(List<LeBlancChateauroux> leBlancChateauroux) {
        this.leBlancChateauroux = leBlancChateauroux;
    }

    @JsonProperty("Orleans-Vierzon")
    public List<OrleansVierzon> getOrleansVierzon() {
        return orleansVierzon;
    }

    @JsonProperty("Orleans-Vierzon")
    public void setOrleansVierzon(List<OrleansVierzon> orleansVierzon) {
        this.orleansVierzon = orleansVierzon;
    }

    @JsonProperty("Tours-Montrichard")
    public List<ToursMontrichard> getToursMontrichard() {
        return toursMontrichard;
    }

    @JsonProperty("Tours-Montrichard")
    public void setToursMontrichard(List<ToursMontrichard> toursMontrichard) {
        this.toursMontrichard = toursMontrichard;
    }

    @JsonProperty("Sancerre-Bourges")
    public List<SancerreBourge> getSancerreBourges() {
        return sancerreBourges;
    }

    @JsonProperty("Sancerre-Bourges")
    public void setSancerreBourges(List<SancerreBourge> sancerreBourges) {
        this.sancerreBourges = sancerreBourges;
    }

    @JsonProperty("Chinon-LeBlanc")
    public List<ChinonLeBlanc> getChinonLeBlanc() {
        return chinonLeBlanc;
    }

    @JsonProperty("Chinon-LeBlanc")
    public void setChinonLeBlanc(List<ChinonLeBlanc> chinonLeBlanc) {
        this.chinonLeBlanc = chinonLeBlanc;
    }

    @JsonProperty("Tours-Chinon")
    public List<ToursChinon> getToursChinon() {
        return toursChinon;
    }

    @JsonProperty("Tours-Chinon")
    public void setToursChinon(List<ToursChinon> toursChinon) {
        this.toursChinon = toursChinon;
    }

    @JsonProperty("Sancerre-Nevers")
    public List<SancerreNever> getSancerreNevers() {
        return sancerreNevers;
    }

    @JsonProperty("Sancerre-Nevers")
    public void setSancerreNevers(List<SancerreNever> sancerreNevers) {
        this.sancerreNevers = sancerreNevers;
    }

    @JsonProperty("Bourges-SAmandMontrond")
    public List<BourgesSAmandMontrond> getBourgesSAmandMontrond() {
        return bourgesSAmandMontrond;
    }

    @JsonProperty("Bourges-SAmandMontrond")
    public void setBourgesSAmandMontrond(List<BourgesSAmandMontrond> bourgesSAmandMontrond) {
        this.bourgesSAmandMontrond = bourgesSAmandMontrond;
    }

    @JsonProperty("SAmandMontrond-Nevers")
    public List<SAmandMontrondNever> getSAmandMontrondNevers() {
        return sAmandMontrondNevers;
    }

    @JsonProperty("SAmandMontrond-Nevers")
    public void setSAmandMontrondNevers(List<SAmandMontrondNever> sAmandMontrondNevers) {
        this.sAmandMontrondNevers = sAmandMontrondNevers;
    }

    @JsonProperty("LeMans-Tours")
    public List<LeMansTour> getLeMansTours() {
        return leMansTours;
    }

    @JsonProperty("LeMans-Tours")
    public void setLeMansTours(List<LeMansTour> leMansTours) {
        this.leMansTours = leMansTours;
    }

    @JsonProperty("Montargis-Briare")
    public List<MontargisBriare> getMontargisBriare() {
        return montargisBriare;
    }

    @JsonProperty("Montargis-Briare")
    public void setMontargisBriare(List<MontargisBriare> montargisBriare) {
        this.montargisBriare = montargisBriare;
    }

    @JsonProperty("Vierzon-SAmandMontrond")
    public List<VierzonSAmandMontrond> getVierzonSAmandMontrond() {
        return vierzonSAmandMontrond;
    }

    @JsonProperty("Vierzon-SAmandMontrond")
    public void setVierzonSAmandMontrond(List<VierzonSAmandMontrond> vierzonSAmandMontrond) {
        this.vierzonSAmandMontrond = vierzonSAmandMontrond;
    }

    @JsonProperty("Chartres-LeMans")
    public List<ChartresLeMan> getChartresLeMans() {
        return chartresLeMans;
    }

    @JsonProperty("Chartres-LeMans")
    public void setChartresLeMans(List<ChartresLeMan> chartresLeMans) {
        this.chartresLeMans = chartresLeMans;
    }

    @JsonProperty("LeMans-Venedome")
    public List<LeMansVenedome> getLeMansVenedome() {
        return leMansVenedome;
    }

    @JsonProperty("LeMans-Venedome")
    public void setLeMansVenedome(List<LeMansVenedome> leMansVenedome) {
        this.leMansVenedome = leMansVenedome;
    }

    @JsonProperty("Chateaudun-Orleans")
    public List<ChateaudunOrlean> getChateaudunOrleans() {
        return chateaudunOrleans;
    }

    @JsonProperty("Chateaudun-Orleans")
    public void setChateaudunOrleans(List<ChateaudunOrlean> chateaudunOrleans) {
        this.chateaudunOrleans = chateaudunOrleans;
    }

    @JsonProperty("Chartres-Orleans")
    public List<ChartresOrlean> getChartresOrleans() {
        return chartresOrleans;
    }

    @JsonProperty("Chartres-Orleans")
    public void setChartresOrleans(List<ChartresOrlean> chartresOrleans) {
        this.chartresOrleans = chartresOrleans;
    }

    @JsonProperty("Orleans-Blois")
    public List<OrleansBloi> getOrleansBlois() {
        return orleansBlois;
    }

    @JsonProperty("Orleans-Blois")
    public void setOrleansBlois(List<OrleansBloi> orleansBlois) {
        this.orleansBlois = orleansBlois;
    }

    @JsonProperty("Briare-Sancerre")
    public List<BriareSancerre> getBriareSancerre() {
        return briareSancerre;
    }

    @JsonProperty("Briare-Sancerre")
    public void setBriareSancerre(List<BriareSancerre> briareSancerre) {
        this.briareSancerre = briareSancerre;
    }

    @JsonProperty("Loches-Chateauroux")
    public List<LochesChateauroux> getLochesChateauroux() {
        return lochesChateauroux;
    }

    @JsonProperty("Loches-Chateauroux")
    public void setLochesChateauroux(List<LochesChateauroux> lochesChateauroux) {
        this.lochesChateauroux = lochesChateauroux;
    }

    @JsonProperty("Blois-Tours")
    public List<BloisTour> getBloisTours() {
        return bloisTours;
    }

    @JsonProperty("Blois-Tours")
    public void setBloisTours(List<BloisTour> bloisTours) {
        this.bloisTours = bloisTours;
    }

    @JsonProperty("Chateauroux-LaChatre")
    public List<ChateaurouxLaChatre> getChateaurouxLaChatre() {
        return chateaurouxLaChatre;
    }

    @JsonProperty("Chateauroux-LaChatre")
    public void setChateaurouxLaChatre(List<ChateaurouxLaChatre> chateaurouxLaChatre) {
        this.chateaurouxLaChatre = chateaurouxLaChatre;
    }

    @JsonProperty("Etampes-Montargis")
    public List<EtampesMontargi> getEtampesMontargis() {
        return etampesMontargis;
    }

    @JsonProperty("Etampes-Montargis")
    public void setEtampesMontargis(List<EtampesMontargi> etampesMontargis) {
        this.etampesMontargis = etampesMontargis;
    }

    @JsonProperty("Vierzon-Bourges")
    public List<VierzonBourge> getVierzonBourges() {
        return vierzonBourges;
    }

    @JsonProperty("Vierzon-Bourges")
    public void setVierzonBourges(List<VierzonBourge> vierzonBourges) {
        this.vierzonBourges = vierzonBourges;
    }

    @JsonProperty("Chartres-Etampes")
    public List<ChartresEtampe> getChartresEtampes() {
        return chartresEtampes;
    }

    @JsonProperty("Chartres-Etampes")
    public void setChartresEtampes(List<ChartresEtampe> chartresEtampes) {
        this.chartresEtampes = chartresEtampes;
    }

    @JsonProperty("Chartres-Chateaudun")
    public List<ChartresChateaudun> getChartresChateaudun() {
        return chartresChateaudun;
    }

    @JsonProperty("Chartres-Chateaudun")
    public void setChartresChateaudun(List<ChartresChateaudun> chartresChateaudun) {
        this.chartresChateaudun = chartresChateaudun;
    }

    @JsonProperty("Chinon-Chatelleraut")
    public List<ChinonChatelleraut> getChinonChatelleraut() {
        return chinonChatelleraut;
    }

    @JsonProperty("Chinon-Chatelleraut")
    public void setChinonChatelleraut(List<ChinonChatelleraut> chinonChatelleraut) {
        this.chinonChatelleraut = chinonChatelleraut;
    }

    @JsonProperty("Montrichard-Vierzon")
    public List<MontrichardVierzon> getMontrichardVierzon() {
        return montrichardVierzon;
    }

    @JsonProperty("Montrichard-Vierzon")
    public void setMontrichardVierzon(List<MontrichardVierzon> montrichardVierzon) {
        this.montrichardVierzon = montrichardVierzon;
    }

    @JsonProperty("ArgentonSurCreuse-LaChatre")
    public List<ArgentonSurCreuseLaChatre> getArgentonSurCreuseLaChatre() {
        return argentonSurCreuseLaChatre;
    }

    @JsonProperty("ArgentonSurCreuse-LaChatre")
    public void setArgentonSurCreuseLaChatre(List<ArgentonSurCreuseLaChatre> argentonSurCreuseLaChatre) {
        this.argentonSurCreuseLaChatre = argentonSurCreuseLaChatre;
    }

    @JsonProperty("Orleans-Montargis")
    public List<OrleansMontargi> getOrleansMontargis() {
        return orleansMontargis;
    }

    @JsonProperty("Orleans-Montargis")
    public void setOrleansMontargis(List<OrleansMontargi> orleansMontargis) {
        this.orleansMontargis = orleansMontargis;
    }

    @JsonProperty("Chateauroux-ArgentonSurCreuse")
    public List<ChateaurouxArgentonSurCreuse> getChateaurouxArgentonSurCreuse() {
        return chateaurouxArgentonSurCreuse;
    }

    @JsonProperty("Chateauroux-ArgentonSurCreuse")
    public void setChateaurouxArgentonSurCreuse(List<ChateaurouxArgentonSurCreuse> chateaurouxArgentonSurCreuse) {
        this.chateaurouxArgentonSurCreuse = chateaurouxArgentonSurCreuse;
    }

    @JsonProperty("Chateaudun-Venedome")
    public List<ChateaudunVenedome> getChateaudunVenedome() {
        return chateaudunVenedome;
    }

    @JsonProperty("Chateaudun-Venedome")
    public void setChateaudunVenedome(List<ChateaudunVenedome> chateaudunVenedome) {
        this.chateaudunVenedome = chateaudunVenedome;
    }

    @JsonProperty("LaChatre-SAmandMontrond")
    public List<LaChatreSAmandMontrond> getLaChatreSAmandMontrond() {
        return laChatreSAmandMontrond;
    }

    @JsonProperty("LaChatre-SAmandMontrond")
    public void setLaChatreSAmandMontrond(List<LaChatreSAmandMontrond> laChatreSAmandMontrond) {
        this.laChatreSAmandMontrond = laChatreSAmandMontrond;
    }

    @JsonProperty("Blois-Vierzon")
    public List<BloisVierzon> getBloisVierzon() {
        return bloisVierzon;
    }

    @JsonProperty("Blois-Vierzon")
    public void setBloisVierzon(List<BloisVierzon> bloisVierzon) {
        this.bloisVierzon = bloisVierzon;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("leMansChateaudun", leMansChateaudun).append("leBlancArgentonSurCreuse", leBlancArgentonSurCreuse).append("toursLoches", toursLoches).append("venedomeBlois", venedomeBlois).append("montrichardLoches", montrichardLoches).append("vierzonChateauroux", vierzonChateauroux).append("chatellerautArgentonSurCreuse", chatellerautArgentonSurCreuse).append("bourgesNevers", bourgesNevers).append("orleansBriare", orleansBriare).append("leBlancChateauroux", leBlancChateauroux).append("orleansVierzon", orleansVierzon).append("toursMontrichard", toursMontrichard).append("sancerreBourges", sancerreBourges).append("chinonLeBlanc", chinonLeBlanc).append("toursChinon", toursChinon).append("sancerreNevers", sancerreNevers).append("bourgesSAmandMontrond", bourgesSAmandMontrond).append("sAmandMontrondNevers", sAmandMontrondNevers).append("leMansTours", leMansTours).append("montargisBriare", montargisBriare).append("vierzonSAmandMontrond", vierzonSAmandMontrond).append("chartresLeMans", chartresLeMans).append("leMansVenedome", leMansVenedome).append("chateaudunOrleans", chateaudunOrleans).append("chartresOrleans", chartresOrleans).append("orleansBlois", orleansBlois).append("briareSancerre", briareSancerre).append("lochesChateauroux", lochesChateauroux).append("bloisTours", bloisTours).append("chateaurouxLaChatre", chateaurouxLaChatre).append("etampesMontargis", etampesMontargis).append("vierzonBourges", vierzonBourges).append("chartresEtampes", chartresEtampes).append("chartresChateaudun", chartresChateaudun).append("chinonChatelleraut", chinonChatelleraut).append("montrichardVierzon", montrichardVierzon).append("argentonSurCreuseLaChatre", argentonSurCreuseLaChatre).append("orleansMontargis", orleansMontargis).append("chateaurouxArgentonSurCreuse", chateaurouxArgentonSurCreuse).append("chateaudunVenedome", chateaudunVenedome).append("laChatreSAmandMontrond", laChatreSAmandMontrond).append("bloisVierzon", bloisVierzon).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(leBlancArgentonSurCreuse).append(vierzonChateauroux).append(orleansMontargis).append(chateaudunOrleans).append(leMansVenedome).append(venedomeBlois).append(chinonChatelleraut).append(sancerreBourges).append(chinonLeBlanc).append(vierzonBourges).append(orleansBlois).append(chartresOrleans).append(briareSancerre).append(leMansTours).append(bloisTours).append(orleansVierzon).append(toursMontrichard).append(etampesMontargis).append(orleansBriare).append(toursChinon).append(sancerreNevers).append(chartresLeMans).append(argentonSurCreuseLaChatre).append(bourgesSAmandMontrond).append(chartresChateaudun).append(leBlancChateauroux).append(vierzonSAmandMontrond).append(laChatreSAmandMontrond).append(bourgesNevers).append(montrichardVierzon).append(lochesChateauroux).append(montrichardLoches).append(chateaurouxArgentonSurCreuse).append(chateaurouxLaChatre).append(montargisBriare).append(chateaudunVenedome).append(leMansChateaudun).append(chatellerautArgentonSurCreuse).append(sAmandMontrondNevers).append(chartresEtampes).append(toursLoches).append(bloisVierzon).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PathsBetween) == false) {
            return false;
        }
        PathsBetween rhs = ((PathsBetween) other);
        return new EqualsBuilder().append(leBlancArgentonSurCreuse, rhs.leBlancArgentonSurCreuse).append(vierzonChateauroux, rhs.vierzonChateauroux).append(orleansMontargis, rhs.orleansMontargis).append(chateaudunOrleans, rhs.chateaudunOrleans).append(leMansVenedome, rhs.leMansVenedome).append(venedomeBlois, rhs.venedomeBlois).append(chinonChatelleraut, rhs.chinonChatelleraut).append(sancerreBourges, rhs.sancerreBourges).append(chinonLeBlanc, rhs.chinonLeBlanc).append(vierzonBourges, rhs.vierzonBourges).append(orleansBlois, rhs.orleansBlois).append(chartresOrleans, rhs.chartresOrleans).append(briareSancerre, rhs.briareSancerre).append(leMansTours, rhs.leMansTours).append(bloisTours, rhs.bloisTours).append(orleansVierzon, rhs.orleansVierzon).append(toursMontrichard, rhs.toursMontrichard).append(etampesMontargis, rhs.etampesMontargis).append(orleansBriare, rhs.orleansBriare).append(toursChinon, rhs.toursChinon).append(sancerreNevers, rhs.sancerreNevers).append(chartresLeMans, rhs.chartresLeMans).append(argentonSurCreuseLaChatre, rhs.argentonSurCreuseLaChatre).append(bourgesSAmandMontrond, rhs.bourgesSAmandMontrond).append(chartresChateaudun, rhs.chartresChateaudun).append(leBlancChateauroux, rhs.leBlancChateauroux).append(vierzonSAmandMontrond, rhs.vierzonSAmandMontrond).append(laChatreSAmandMontrond, rhs.laChatreSAmandMontrond).append(bourgesNevers, rhs.bourgesNevers).append(montrichardVierzon, rhs.montrichardVierzon).append(lochesChateauroux, rhs.lochesChateauroux).append(montrichardLoches, rhs.montrichardLoches).append(chateaurouxArgentonSurCreuse, rhs.chateaurouxArgentonSurCreuse).append(chateaurouxLaChatre, rhs.chateaurouxLaChatre).append(montargisBriare, rhs.montargisBriare).append(chateaudunVenedome, rhs.chateaudunVenedome).append(leMansChateaudun, rhs.leMansChateaudun).append(chatellerautArgentonSurCreuse, rhs.chatellerautArgentonSurCreuse).append(sAmandMontrondNevers, rhs.sAmandMontrondNevers).append(chartresEtampes, rhs.chartresEtampes).append(toursLoches, rhs.toursLoches).append(bloisVierzon, rhs.bloisVierzon).isEquals();
    }

}
