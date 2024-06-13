package io.giovanni94.example.gamblingaddictionmanager.model;

public class BetSlip {
    private String date = "01-01-2024";
    private float betValue;
    private Bet[] array;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public float getBetValue() {
        return betValue;
    }

    public void setBetValue(float betValue) {
        this.betValue = betValue;
    }

    public Bet[] getArray() {
        return array;
    }

    public void setArray(Bet[] array) {
        this.array = array;
    }
}

