package eu.hurion.opendata.arbre;

import java.util.Date;

public class Tree {

    private double siteNr;
    private double treeNr;
    private String town;
    private String municipality;
    private String domain;
    private String type;
    private String speciesLatin;
    private String SpeciesFrench;
    private String sanit;
    private double circumference;
    private double height;
    private int anobs;
    private String interest;
    private String env1;
    private String env2;
    private String ref;
    private String comment;
    private String evolution;
    private Date officialDate;

    public void setSiteNr(final double siteNr) {
        this.siteNr = siteNr;
    }

    public double getSiteNr() {
        return siteNr;
    }

    public void setTreeNr(final double treeNr) {
        this.treeNr = treeNr;
    }

    public double getTreeNr() {
        return treeNr;
    }

    public void setTown(final String town) {
        this.town = town;
    }

    public String getTown() {
        return town;
    }

    public void setMunicipality(final String municipality) {
        this.municipality = municipality;
    }

    public String getMunicipality() {
        return municipality;
    }

    public void setDomain(final String domain) {
        this.domain = domain;
    }

    public String getDomain() {
        return domain;
    }

    public void setType(final String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setSpeciesLatin(final String speciesLatin) {
        this.speciesLatin = speciesLatin;
    }

    public String getSpeciesLatin() {
        return speciesLatin;
    }

    public void setSpeciesFrench(final String speciesFrench) {
        this.SpeciesFrench = speciesFrench;
    }

    public String getSpeciesFrench() {
        return SpeciesFrench;
    }

    public void setSanit(final String sanit) {
        this.sanit = sanit;
    }

    public String getSanit() {
        return sanit;
    }

    public void setCircumference(final double circumference) {
        this.circumference = circumference;
    }

    public double getCircumference() {
        return circumference;
    }

    public void setHeight(final double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setAnobs(final int anobs) {
        this.anobs = anobs;
    }

    public int getAnobs() {
        return anobs;
    }

    public void setInterest(final String interest) {
        this.interest = interest;
    }

    public String getInterest() {
        return interest;
    }

    public void setEnv1(final String env1) {
        this.env1 = env1;
    }

    public String getEnv1() {
        return env1;
    }

    public void setEnv2(final String env2) {
        this.env2 = env2;
    }

    public String getEnv2() {
        return env2;
    }

    public void setRef(final String ref) {
        this.ref = ref;
    }

    public String getRef() {
        return ref;
    }

    public void setComment(final String comment) {
        this.comment = comment;
    }

    public String getComment() {
        return comment;
    }

    public void setEvolution(final String evolution) {
        this.evolution = evolution;
    }

    public String getEvolution() {
        return evolution;
    }

    public void setOfficialDate(final Date officialDate) {
        this.officialDate = officialDate;
    }

    public Date getOfficialDate() {
        return officialDate;
    }

    @Override
    public String toString() {
        return "Tree{" +
                "siteNr=" + siteNr +
                ", treeNr=" + treeNr +
                ", town='" + town + '\'' +
                ", municipality='" + municipality + '\'' +
                ", domain='" + domain + '\'' +
                ", type='" + type + '\'' +
                ", speciesLatin='" + speciesLatin + '\'' +
                ", SpeciesFrench='" + SpeciesFrench + '\'' +
                ", sanit='" + sanit + '\'' +
                ", circumference=" + circumference +
                ", height=" + height +
                ", anobs=" + anobs +
                ", interest='" + interest + '\'' +
                ", env1='" + env1 + '\'' +
                ", env2='" + env2 + '\'' +
                ", ref='" + ref + '\'' +
                ", comment='" + comment + '\'' +
                ", evolution='" + evolution + '\'' +
                ", officialDate=" + officialDate +
                '}';
    }
}
