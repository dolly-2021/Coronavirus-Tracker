package com.example.CoronavirusTracker.models;

public class LocationStats {

    private String state;
    private String country;
    private String confirmed_cases;
    private String deaths;
    private String recovered;
    private String active_cases;
    private String fatality_ratio;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getConfirmed_cases() {
        return confirmed_cases;
    }

    public void setConfirmed_cases(String confirmed_cases) {
        this.confirmed_cases = confirmed_cases;
    }

    public String getDeaths() {
        return deaths;
    }

    public void setDeaths(String deaths) {
        this.deaths = deaths;
    }

    public String getRecovered() {
        return recovered;
    }

    public void setRecovered(String recovered) {
        this.recovered = recovered;
    }

    public String getActive_cases() {
        return active_cases;
    }

    public void setActive_cases(String active_cases) {
        this.active_cases = active_cases;
    }

    public String getFatality_ratio() {
        return fatality_ratio;
    }

    public void setFatality_ratio(String fatality_ratio) {
        this.fatality_ratio = fatality_ratio;
    }

    @Override
    public String toString() {
        return "LocationStats{" +
                "state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", confirmed_cases='" + confirmed_cases + '\'' +
                ", deaths='" + deaths + '\'' +
                ", recovered='" + recovered + '\'' +
                ", active_cases='" + active_cases + '\'' +
                ", fatality_ratio='" + fatality_ratio + '\'' +
                '}';
    }
}
