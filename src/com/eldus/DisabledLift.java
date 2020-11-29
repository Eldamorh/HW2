package com.eldus;

public class DisabledLift extends MainElevator implements Elevator {

    int numberOfPeople;

    DisabledLift(int floor, int numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
        speed = 1;
        maxWeight = 200;
        this.currentFloor = floor;
    }

    @Override
    public int getMaxWeight() {
        return maxWeight;
    }

    @Override
    public double getSpeed() {
        return speed;
    }

    @Override
    public boolean moveToFloor(int floor, int weight) {
        if (currentFloor != floor && floor > 0 && weight < maxWeight && numberOfPeople == 1) {
            System.out.println("Едем на " + floor + " этаж");
            return true;
        } else {
            if (currentFloor == floor) {
                System.out.println("Вы уже на этом этаже");
            }
            if (weight >= maxWeight) {
                System.out.println("Лифт перегружен");
            }
            if (numberOfPeople > 1) {
                System.out.println("Лифт предназначен только для 1 человека");
            }
            if (floor <= 0){
                System.out.println("Такого этажа не существует!");
            }
            return false;
        }
    }
}
