package com.day50;

/**
 * Created by Jaylon Breckenridge on 6/6/2016.
 */
public class ChocolateInput {
    public int small;
    public int bigs;
    public int goal;

    public ChocolateInput(){

    }

    public int getSmall() {
        return small;
    }

    public void setSmall(int small) {
        this.small = small;
    }

    public int getBigs() {
        return bigs;
    }

    public void setBigs(int bigs) {
        this.bigs = bigs;
    }

    public int getGoal() {
        return goal;
    }

    public void setGoal(int goal) {
        this.goal = goal;
    }

    public ChocolateInput(int small, int bigs, int goal) {
    this.bigs = bigs;
    this.small = small;
    this.goal = goal;
    }
}
