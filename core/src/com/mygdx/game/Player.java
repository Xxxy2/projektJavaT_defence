package com.mygdx.game;

public class Player {
    public Integer getMobCounter() {
        return mobCounter;
    }

    public Integer getScore() {
        return score;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMobCounter(Integer mobCounter) {
        this.mobCounter = mobCounter;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    private Integer mobCounter;
    private  Integer score;
    private  Integer money;



}
