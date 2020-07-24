package com.example.examen;

public class Paises {
    private String name;
    private String topLevelDomain;
    private String alpha2Code;
    private String alpha3Code;
    private Integer callingCodes;
    private String capital;
    private String altSpellingM;
    private String region;
    private String subregion;
    private Integer population;
    private Integer latng;
    private String demonym;
    private Integer area;
    private Integer gini;
    private String timesones;
    private String borders;
    private String languages;
public Paises()
{ }
 public Paises(String name,String topLevelDomain,String alpha2Code,String alpha3Code,String capital,String altSpellingM,String region,String subregion,
               String demonym,String timesones,String borders,String symbol,String languages ){
    this.name=name;
    this.topLevelDomain=topLevelDomain;
    this.alpha2Code=alpha2Code;
    this.alpha3Code=alpha3Code;
    this.capital=capital;
    this.altSpellingM=altSpellingM;
    this.region=region;
    this.subregion=subregion;
    this.demonym=demonym;
    this.timesones=timesones;
    this.borders=borders;
    this.languages=languages;
 }

    public String getBorders() {
        return borders;
    }

    public void setBorders(String borders) {
        this.borders = borders;
    }

    public String getTimesones() {
        return timesones;
    }

    public void setTimesones(String timesones) {
        this.timesones = timesones;
    }

    public Integer getGini() {
        return gini;
    }

    public void setGini(Integer gini) {
        this.gini = gini;
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    public String getDemonym() {
        return demonym;
    }

    public void setDemonym(String demonym) {
        this.demonym = demonym;
    }

    public Integer getLatng() {
        return latng;
    }

    public void setLatng(Integer latng) {
        this.latng = latng;
    }

    public Integer getPopulation() {
        return population;
    }

    public void setPopulation(Integer population) {
        this.population = population;
    }

    public String getSubregion() {
        return subregion;
    }

    public void setSubregion(String subregion) {
        this.subregion = subregion;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getAltSpellingM() {
        return altSpellingM;
    }

    public void setAltSpellingM(String altSpellingM) {
        this.altSpellingM = altSpellingM;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public Integer getCallingCodes() {
        return callingCodes;
    }

    public void setCallingCodes(Integer callingCodes) {
        this.callingCodes = callingCodes;
    }

    public String getAlpha3Code() {
        return alpha3Code;
    }

    public void setAlpha3Code(String alpha3Code) {
        this.alpha3Code = alpha3Code;
    }

    public String getAlpha2Code() {
        return alpha2Code;
    }

    public void setAlpha2Code(String alpha2Code) {
        this.alpha2Code = alpha2Code;
    }

    public String getTopLevelDomain() {
        return topLevelDomain;
    }

    public void setTopLevelDomain(String topLevelDomain) {
        this.topLevelDomain = topLevelDomain;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getLanguages() {
        return languages;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }

  }
