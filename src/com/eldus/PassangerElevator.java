package com.eldus;

public class PassangerElevator extends MainElevator implements Elevator {


    PassangerElevator(int floor) {
        speed = 3;
        maxWeight = 350;
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

        if (currentFloor != floor && floor > 0 && weight < maxWeight) {
            System.out.println("Едем на " + floor + " этаж");
            return true;
        } else {
            if (currentFloor == floor) {
                System.out.println("Вы уже на этом этаже");
            }
            if (weight >= maxWeight) {
                System.out.println("Лифт перегружен");
            }
            if (floor <= 0){
                System.out.println("Такого этажа не существует!");
            }
            return false;
        }

    }
}
