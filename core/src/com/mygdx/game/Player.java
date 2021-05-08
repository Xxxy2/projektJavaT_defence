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

    public void setHp(Integer hp) {
        this.hp = hp;
    }

    public Integer getHp() {
        return hp;
    }
    private Integer mobCounter;
    private  Integer score;
    private  Integer money;
    private  Integer hp;


}
