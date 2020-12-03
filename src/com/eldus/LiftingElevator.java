package com.eldus;

public class LiftingElevator extends MainElevator implements Elevator {

    private int minWeight;

    LiftingElevator(int floor) {
        speed = 1;
        maxWeight = 1200;
        minWeight = 350;


        this.currentFloor = floor;
    }

    @Override
    public boolean moveToFloor(int floor, int weight) {
        if (currentFloor != floor && floor > 0 && weight < maxWeight && weight > minWeight) {
            System.out.println("Едем на " + floor + " этаж");
            return true;
        } else {
            if (currentFloor == floor) {
                System.out.println("Вы уже на этом этаже");
            }
            if (weight >= maxWeight) {
                System.out.println("Лифт перегружен");
            }
            if (weight <= minWeight) {
                System.out.println("Лифт недостаточно загружен,воспользуйтесь пассажирским лифтом");
            }
            if (floor <= 0){
                System.out.println("Такого этажа не существует!");
            }
            return false;
        }
    }
}
