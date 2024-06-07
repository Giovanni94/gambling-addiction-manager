package io.giovanni94.example.gamblingaddictionmanager.model;

public class Bet {
    private float quote;
    private String homeTeam;
    private String awayTeam;
    private String event;

    public Bet(float quote, String homeTeam, String awayTeam, String event) {
        this.quote = quote;
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.event = event;
    }

    public float getQuote() {
        return quote;
    }

    public String getHomeTeam() {
        return homeTeam;
    }

    public String getAwayTeam() {
        return awayTeam;
    }

    public String getEvent() {
        return event;
    }
}
