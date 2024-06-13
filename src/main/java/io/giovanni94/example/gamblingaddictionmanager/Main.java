package io.giovanni94.example.gamblingaddictionmanager;

import io.giovanni94.example.gamblingaddictionmanager.service.BetService;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BetService betService = new BetService();
        betService.startBetting();
        betService.addBet();
        betService.addBet();
        betService.addBet();
        betService.endBetting();
    }
}