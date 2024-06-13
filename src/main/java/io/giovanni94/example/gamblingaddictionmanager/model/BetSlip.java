package io.giovanni94.example.gamblingaddictionmanager.model;

import java.util.Date;

public class BetSlip {
    private Date date;
    private float betValue;
    private Bet[] array;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
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

