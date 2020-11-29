package com.eldus;

public interface Elevator {

    /**
     * @return maximum weight that elevator can lift
     */
    int getMaxWeight();

    /**
     * @return elevator's speed
     */
    double getSpeed();

    /**
     * Change floor
     *
     * @return true - if can move, false - otherwise
     */
    boolean moveToFloor(int floor, int weight);

}