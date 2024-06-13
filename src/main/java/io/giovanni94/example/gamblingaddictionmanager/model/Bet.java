package io.giovanni94.example.gamblingaddictionmanager.model;

public class Bet {
    private float quote;
    private String homeTeam;
    private String awayTeam;
    private String event;

    public float getQuote() {
        return this.quote;
    }

    public void setQuote(float quote) {
        this.quote = quote;
    }

    public String getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(String homeTeam) {
        this.homeTeam = homeTeam;
    }

    public String getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(String awayTeam) {
        this.awayTeam = awayTeam;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }
}
