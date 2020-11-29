package com.eldus;

public class Main {

    public static void main(String[] args) {
        MainElevator[] elevators = new MainElevator[3];
        elevators[0] = new PassangerElevator(10);
        elevators[1] = new LiftingElevator(10);
        elevators[2] = new DisabledLift(10, 1);

        for(MainElevator elevator : elevators){
            elevator.moveToFloor(-3,250);
            elevator.moveToFloor(9999,700);
            elevator.moveToFloor(8,300);
            elevator.moveToFloor(1,100);
            System.out.println("_________________");
        }
    }
}
