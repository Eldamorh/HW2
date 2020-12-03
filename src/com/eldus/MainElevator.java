package com.eldus;

public abstract class MainElevator implements Elevator{
    protected int currentFloor;
    protected int maxWeight;
    protected int speed;


    @Override
    public int getMaxWeight() {
        return maxWeight;
    }

    @Override
    public double getSpeed() {
        return speed;
    }

    @Override
    public abstract boolean moveToFloor(int floor, int weight);
}
