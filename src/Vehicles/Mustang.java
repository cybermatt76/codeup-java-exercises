package Vehicles;

public class Mustang extends Vehicle {

    @Override
    public void makeNoise() {
        super.makeNoise();
        System.out.println(this.getName() + " goes squeak squeak");
    }
}
